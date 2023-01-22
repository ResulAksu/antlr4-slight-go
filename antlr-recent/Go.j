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
 .limit locals 1
 .line 5
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc2_w 3.0
   invokestatic Go/boolA(D)D
   invokevirtual java/io/PrintStream/println()V
   return
.end method 

.method public static boolA(D)D
 .limit stack 100
 .limit locals 3
 .line 9
 .line 10
   dload_0
   ldc2_w 3.0
   dmul 
   ldc2_w 4.0
   dadd 
   dreturn
.end method 

