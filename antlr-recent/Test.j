.class Test
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
   invokestatic Test/test()V
   return
   return
.end method 

.method public static test()V
 .limit stack 4
 .limit locals 12
 .line 9
   ldc 3
   istore 1
   ldc 4
   istore 2
   iload 1
   iload 2
   isub 
   ifge Label10
   iconst_1
   goto Label11
Label10:
   iconst_0
Label11:
   iload 1
   iload 2
   isub 
   ifgt Label12
   iconst_1
   goto Label13
Label12:
   iconst_0
Label13:
   iand
   iload 1
   iload 2
   isub 
   iflt Label14
   iconst_1
   goto Label15
Label14:
   iconst_1
Label15:
   ior
   istore 3
   iload 1
   iload 2
   isub 
   ifle Label16
   iconst_1
   goto Label17
Label16:
   iconst_0
Label17:
   iload 3
   iand
   istore 4
   iload 1
   iload 2
   isub 
   ifeq Label18
   iconst_0
   goto Label19
Label18:
   iconst_1
Label19:
   iload 3
   iand
   iload 4
   ior
   ldc 3
   ldc 4
   isub 
   ifge Label20
   iconst_1
   goto Label21
Label20:
   iconst_0
Label21:
   ior
   ldc 5
   ldc 8
   isub 
   ifge Label22
   iconst_1
   goto Label23
Label22:
   iconst_0
Label23:
   ior
   ldc "hallo"
   ldc "hallo"
   invokestatic java/util/Objects/equals(Ljava/lang/Object;Ljava/lang/Object;)Z
   ifne Label24
   iconst_1
   goto Label25
Label24:
   iconst_0
Label25:
   ior
   istore 5
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 3
   invokevirtual java/io/PrintStream/println(Z)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 4
   invokevirtual java/io/PrintStream/println(Z)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 5
   invokevirtual java/io/PrintStream/println(Z)V
   return
.end method 

