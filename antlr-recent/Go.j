.class Go
.super java/lang/Object
.method public <init>()V
    .limit stack 1
    .limit locals 1
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V 
 .limit stack 100
 .limit locals 2
 .line 5
   ldc 3
   istore_1
   iload_1
   ldc 5
   isub
   ifge Label10
   ldc 4
   istore_1
   goto LabelELSE
Label10:
   ldc 1
   istore_1
LabelELSE:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload_1
   invokevirtual java/io/PrintStream/println(I)V
   return
.end method 

