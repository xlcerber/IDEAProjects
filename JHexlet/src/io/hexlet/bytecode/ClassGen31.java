package io.hexlet.bytecode;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Label;
import java.io.FileOutputStream;

public class ClassGen31 {

    public static void main(final String... args) throws Exception {
        final String path = args[0];
        final byte[] byteCode = new ClassGen31().generateMathClass();
        try (FileOutputStream stream = new FileOutputStream(path)) {
            stream.write(byteCode);
        }
    }

    private byte[] generateMathClass() {
        final ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(51,
                Opcodes.ACC_PUBLIC,
                "Math",
                null,
                "java/lang/Object",
                null);
        generateDefaultConstructor(cw);
        generateDMethod(cw);
        generateAbsMethod(cw);
        cw.visitEnd();
        return cw.toByteArray();
    }

    private void generateDefaultConstructor(final ClassWriter cw) {
        final MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        mv.visitCode();
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(1, 1);
        mv.visitEnd();
    }

//    public static double d(final double a, final double b, final double c) {
//        return b * b - 4 * a * c;
//    }

    private void generateDMethod(final ClassWriter cw) {
        final MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
                "d", // method name
                "(DDD)D", // method descriptor
                null,    // exceptions
                null);   // method attributes
        mv.visitCode();
        // BEGIN (write your solution here)

        // calculate b * b
        // push b to stack
        mv.visitVarInsn(Opcodes.DLOAD, 2);
        mv.visitVarInsn(Opcodes.DLOAD, 2);
        mv.visitInsn(Opcodes.DMUL);

        // calculate 4 * a
        // push "a" to stack
        mv.visitLdcInsn(4.0);
        mv.visitVarInsn(Opcodes.DLOAD, 0);
        mv.visitInsn(Opcodes.DMUL);

        // calculate (4 * a) * c
        // push c to stack
        mv.visitVarInsn(Opcodes.DLOAD, 4);
        mv.visitInsn(Opcodes.DMUL);

        // substract b * b - (4 * a * c)
        mv.visitInsn(Opcodes.DSUB);
        mv.visitInsn(Opcodes.DRETURN);

        mv.visitMaxs(6, 6);

        // END
        mv.visitEnd();
    }


//    public static double abs(final double a) {
//        if (a >= 0) {
//            return a;
//        } else {
//            return -a;
//        }
//    }

    private void generateAbsMethod(final ClassWriter cw ) {
        final MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
                "abs",    // method name
                "(D)D", // method descriptor
                null,     // exceptions
                null);    // method attributes
        mv.visitCode();
        final Label elseLable = new Label();
        // BEGIN (write your solution here)

        // loade variable and const 0 to stack
        mv.visitVarInsn(Opcodes.DLOAD, 0);
        mv.visitInsn(Opcodes.DCONST_0);
        // compare variable with 0
        mv.visitInsn(Opcodes.DCMPL);
        // compare result of double comparation with 0
        mv.visitJumpInsn(Opcodes.IFLT, elseLable);

        // if the result of comparation has been greate then 0 then the values if postitive
        mv.visitVarInsn(Opcodes.DLOAD, 0);
        mv.visitInsn(Opcodes.DRETURN);

        // if the result of comparation has been less then 0 then the values if negative
        mv.visitLabel(elseLable);
        mv.visitVarInsn(Opcodes.DLOAD, 0);
        mv.visitInsn(Opcodes.DNEG);
        mv.visitInsn(Opcodes.DRETURN);
        mv.visitMaxs(4, 2);

        // END
        mv.visitEnd();
    }

}

