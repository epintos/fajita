/* 
 * DynAlloy translator options 
 * --------------------------- 
 * assertionId= check_roops_core_objectsInstrumented_BinTree_removeTest_0
 * loopUnroll= 1
 * removeQuantifiers= true
 * strictUnrolling= false
 * build_dynalloy_trace= false
 */ 

//-------------- prelude--------------//
module moduleId
open util/integer
open util/sequniv as sequniv
one sig null {}
fun fun_reach[h: univ, 
              type: set univ, 
              field: univ -> univ
]: set univ { 
  h.*(field & type->(type+null)) & type 
}

one
sig AssertionFailureLit extends java_lang_Throwable {}
abstract sig boolean {}
one sig true extends boolean {}
one sig false extends boolean {}
abstract sig char {}
pred TruePred[] {} 
pred FalsePred[] { not TruePred[] } 
pred equ[l,r:univ] {l=r} 
pred neq[l,r:univ] {l!=r} 

fun shl[l,r: Int]: Int { l << r } 
fun sshr[l,r: Int]: Int { l >> r } 
fun ushr[l,r: Int]: Int { l >>> r } 

fun fun_univ_equals[
  l:univ, 
  r: univ 
]: boolean { 
  (equ[l,r]) => true else false 
} 

fun fun_set_add[
  l: set univ,
  e: univ
]: set univ { 
  l+e 
} 

fun fun_set_remove[
  l: set univ,
  e: univ
]: set univ {
  l-e
}
fun fun_set_contains[
  l: set univ,
  e: univ
]: boolean {
  (e in l) => true else false 
} 
pred isSubset[
  l: set univ,
  r: set univ
] {
  (l in r) 
} 
pred isNotSubset[
  l: set univ,
  r: set univ
] {
  (l !in r) 
} 
fun fun_set_size[s: set univ]: Int { #s } 

fun fun_not_empty_set[s: set univ]: boolean { (no s) => false else true } 

fun fun_set_is_empty[s: set univ]: boolean { (no s) => true else false } 

pred pred_empty_set[l: set univ] { (no l) } 

pred pred_set_some[l: set univ] { some l } 

pred pred_set_one[l: set univ] { one l } 

pred pred_set_lone[l: set univ] { lone l } 

pred pred_Object_subset[
  s: set univ
] {
  s in java_lang_Object+null
}

fun fun_set_intersection[
  l: set univ,
  r: set univ
]: set univ {
  l & r 
} 
fun fun_set_difference[
  l: set univ,
  r: set univ
]: set univ {
  l - r 
} 
fun fun_rel_difference[ 
  rel: univ -> univ, 
  l: univ,
  r: univ
]: univ->univ {
 rel - (l->r) 
}
fun fun_rel_add[ 
  rel: univ -> univ, 
  l: univ,
  r: univ
]: univ->univ {
 rel + (l->r) 
}
fun fun_set_sum[
  s: set Int
]: Int {
  sum s 
} 
pred pred_empty_list[l: Int -> univ] { (no l) } 

fun fun_list_add[
  l: Int -> univ,
  e: univ
]: Int -> univ {
  l + (Int[#(l.univ)]->e)
} 

fun fun_list_get[
  l: Int -> univ, 
  index: Int
]: univ { 
  index.l 
} 

fun fun_list_contains[
  l: Int -> univ, 
  e: univ
]: boolean { 
  (e in Int.l) => true else false 
} 

fun fun_list_remove[
  l: Int -> univ, 
  index: Int
]: Int -> univ { 
  prevs[index]<:(l-(index->univ)) + next.(nexts[index]<:(l-(index->univ))) 
} 

fun fun_list_size[s: Int -> univ]: Int { #s } 

fun fun_list_equals[
  s1:Int -> univ, 
  s2: Int -> univ
]: boolean { 
  (s1=s2) => true else false 
} 

fun fun_list_empty[s: Int -> univ]: boolean { (#s = 0) => true else false } 

pred pred_empty_map[map: univ -> univ] { (no map) } 

fun fun_map_put[
  map: univ->univ, 
  k: univ, 
  v: univ
]: univ-> univ { 
  map ++ (k->v) 
}

fun fun_map_contains_key[
  map: univ -> univ, 
  k: univ
]: boolean { 
  (some k.map) => true else false 
}

fun fun_map_remove[
  map: univ -> univ, 
  k: univ
]: univ->univ {
  map - (k->univ) 
} 

fun fun_map_get[
  map: univ -> univ, 
  k: univ
]: univ { 
  (some k.map) => k.map else null 
} 

fun fun_map_is_empty[
  map: univ -> univ, 
]: boolean { 
  (some map) => false else true 
}

fun fun_map_clear[
  mapEntries1: univ -> univ -> univ, 
  map: univ
]: univ -> univ -> univ { 
  mapEntries1 - (map -> univ -> univ)
}

fun fun_map_size[
  map: univ -> univ, 
]: univ {
  #map 
} 

pred isEmptyOrNull[u: univ] { u in null } 
fun fun_closure[
  rel: univ -> univ 
]: univ -> univ {
  ^rel 
} 

fun fun_reflexive_closure[
  rel: univ -> univ 
]: univ -> univ {
  *rel 
} 

fun fun_transpose[
  rel: univ -> univ 
]: univ -> univ {
  ~rel 
} 

pred liftExpression[
  expr: univ 
] {
  expr=true 
} 

fun rel_override[
  r:univ->univ,
  k:univ, 
  v:univ
]: univ->univ { 
  r - (k->univ) + (k->v) 
} 

fun Not[a: boolean]: boolean {
    (a=true) => false else true 
}
fun Or[a: boolean, b: boolean]: boolean {
    (a=true or b=true) => true else false
}
fun And[a: boolean, b: boolean]: boolean {
    (a=true and b=true) => true else false
}
fun Xor[a: boolean, b: boolean]: boolean {
    ((a==true and b==false) or (a==false and b==true)) => true else false
}
fun AdderCarry[a: boolean, b: boolean, cin: boolean]: boolean {
    Or[ And[a,b], And[cin, Xor[a,b]]] 
}
fun AdderSum[a: boolean, b: boolean, cin: boolean]: boolean {
    Xor[Xor[a, b], cin]
}
pred updateFieldPost[
  f1:univ->univ,
  f0:univ->univ,
  l:univ,
  r:univ
]{ 
  (r=none) => f1=f0-(l->univ) else f1 = f0 ++ (l->r) 
} 

pred havocVarPost[u:univ]{} 
pred havocVariable2Post[u:univ->univ]{}
pred havocVariable3Post[u:univ->(seq univ)]{}
pred havocFieldPost[f0,f1: univ->univ, u:univ]{ 
  u<:f0 = u<:f1 
  some u.f1  
} 

pred havocFieldContentsPost[target: univ, 
                            field_0: univ -> univ, 
                            field_1: univ -> univ] { 
  field_1 - (target->univ) = field_0 - (target->univ) 
}
pred havocListSeqPost[target: univ,
                            field_0: univ -> Int -> univ, 
                            field_1: univ -> Int -> univ] { 
  field_1 - (target->Int->univ) = field_0 - (target->Int->univ) 
}
pred pred_in[n: univ, t: set univ] { n in t } 

pred instanceOf[n: univ, t: set univ] { n in t } 

pred isCasteableTo[n: univ, t: set univ] { (n in t) or (n = null) } 

pred getUnusedObjectPost[
  usedObjects1:set java_lang_Object, 
  usedObjects0:set java_lang_Object,
  n1: java_lang_Object+null
]{ 
  n1 !in usedObjects0 
  usedObjects1 = usedObjects0 + (n1)
}
//-------------- ClassFields--------------//
one
sig ClassFields {}
{}




//-------------- java_lang_RuntimeException--------------//
abstract sig java_lang_RuntimeException extends java_lang_Exception {}
{}



one
sig java_lang_RuntimeExceptionLit extends java_lang_RuntimeException {}
{}

//-------------- java_lang_Exception--------------//
abstract sig java_lang_Exception extends java_lang_Throwable {}
{}



one
sig java_lang_ExceptionLit extends java_lang_Exception {}
{}

//-------------- java_lang_Throwable--------------//
abstract sig java_lang_Throwable extends java_lang_Object {}
{}



one
sig java_lang_ThrowableLit extends java_lang_Throwable {}
{}

//-------------- java_lang_Object--------------//
sig java_lang_Object {}
{}




//-------------- roops_core_objectsInstrumented_BinTreeNode--------------//
sig roops_core_objectsInstrumented_BinTreeNode extends java_lang_Object {}
{}




//-------------- roops_utilInstrumented_RoopsArray--------------//
sig roops_utilInstrumented_RoopsArray extends java_lang_Object {}
{}




//-------------- java_lang_NullPointerException--------------//
abstract one sig java_lang_NullPointerException extends java_lang_RuntimeException {}
{}



one
sig java_lang_NullPointerExceptionLit extends java_lang_NullPointerException {}
{}

//-------------- roops_core_objectsInstrumented_BinTree--------------//
sig roops_core_objectsInstrumented_BinTree extends java_lang_Object {}
{}




pred roops_core_objectsInstrumented_BinTreeCondition4[
  t_12:univ
]{
   t_12=true

}

pred roops_core_objectsInstrumented_BinTreeCondition7[
  t_11:univ
]{
   not (
     t_11=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition5[
  t_12:univ
]{
   not (
     t_12=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition1[
]{
   not (
     isEmptyOrNull[ClassFields])

}

pred roops_core_objectsInstrumented_BinTreeCondition47[
  t_39:univ
]{
   not (
     t_39=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition0[
]{
   isEmptyOrNull[ClassFields]

}

pred roops_core_objectsInstrumented_BinTreeCondition6[
  t_11:univ
]{
   t_11=true

}

pred roops_core_objectsInstrumented_BinTreeCondition28[
  var_11_y:univ,
  var_12_x:univ
]{
   isEmptyOrNull[var_12_x]
   or 
   isEmptyOrNull[var_11_y]

}

pred roops_core_objectsInstrumented_BinTreeCondition29[
  var_11_y:univ,
  var_12_x:univ
]{
   not (
     isEmptyOrNull[var_12_x]
     or 
     isEmptyOrNull[var_11_y]
   )

}

pred roops_core_objectsInstrumented_BinTreeCondition34[
  t_50:univ
]{
   t_50=true

}

pred roops_core_objectsInstrumented_BinTreeCondition46[
  t_39:univ
]{
   t_39=true

}

pred roops_core_objectsInstrumented_BinTreeCondition37[
  t_51:univ
]{
   not (
     t_51=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition36[
  t_51:univ
]{
   t_51=true

}

pred roops_core_objectsInstrumented_BinTreeCondition35[
  t_50:univ
]{
   not (
     t_50=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition48[
  t_38:univ
]{
   t_38=true

}

pred roops_core_objectsInstrumented_BinTreeCondition17[
  t_47:univ
]{
   not (
     t_47=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition49[
  t_38:univ
]{
   not (
     t_38=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition18[
  t_46:univ
]{
   t_46=true

}

pred roops_core_objectsInstrumented_BinTreeCondition16[
  t_47:univ
]{
   t_47=true

}

pred roops_core_objectsInstrumented_BinTreeCondition19[
  t_46:univ
]{
   not (
     t_46=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition60[
  t_43:univ
]{
   t_43=true

}

pred roops_core_objectsInstrumented_BinTreeCondition61[
  t_43:univ
]{
   not (
     t_43=true)

}

pred postcondition_roops_core_objectsInstrumented_BinTree_removeTest_0[
  roops_core_objectsInstrumented_BinTreeNode_key':univ->univ,
  roops_core_objectsInstrumented_BinTreeNode_left':univ->univ,
  roops_core_objectsInstrumented_BinTreeNode_parent':univ->univ,
  roops_core_objectsInstrumented_BinTreeNode_right':univ->univ,
  roops_core_objectsInstrumented_BinTree_root':univ->univ,
  throw':univ
]{
   roops_core_objectsInstrumented_BinTree_ensures[throw']
   and 
   (
     not (
       throw'=AssertionFailureLit)
   )
   and 
   (
     all objx':roops_core_objectsInstrumented_BinTree | {
       roops_core_objectsInstrumented_BinTree_object_invariant[roops_core_objectsInstrumented_BinTreeNode_key',
                                                              roops_core_objectsInstrumented_BinTreeNode_left',
                                                              roops_core_objectsInstrumented_BinTreeNode_parent',
                                                              roops_core_objectsInstrumented_BinTreeNode_right',
                                                              roops_core_objectsInstrumented_BinTree_root',
                                                              objx']
     
     }
   )

}

pred roops_core_objectsInstrumented_BinTreeCondition44[
  var_7_x:univ
]{
   isEmptyOrNull[var_7_x]

}

pred roops_core_objectsInstrumented_BinTreeCondition45[
  var_7_x:univ
]{
   not (
     isEmptyOrNull[var_7_x])

}

pred roops_core_objectsInstrumented_BinTreeCondition33[
  roops_core_objectsInstrumented_BinTreeNode_parent:univ->univ,
  var_11_y:univ
]{
   not (
     isEmptyOrNull[var_11_y.roops_core_objectsInstrumented_BinTreeNode_parent]
     or 
     isEmptyOrNull[var_11_y]
   )

}

pred roops_core_objectsInstrumented_BinTreeCondition32[
  roops_core_objectsInstrumented_BinTreeNode_parent:univ->univ,
  var_11_y:univ
]{
   isEmptyOrNull[var_11_y.roops_core_objectsInstrumented_BinTreeNode_parent]
   or 
   isEmptyOrNull[var_11_y]

}

pred roops_core_objectsInstrumented_BinTreeCondition56[
  t_41:univ
]{
   t_41=true

}

pred roops_core_objectsInstrumented_BinTreeCondition59[
  t_40:univ
]{
   not (
     t_40=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition58[
  t_40:univ
]{
   t_40=true

}

pred roops_core_objectsInstrumented_BinTreeCondition57[
  t_41:univ
]{
   not (
     t_41=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition25[
  var_11_y:univ
]{
   not (
     isEmptyOrNull[var_11_y])

}

pred roops_core_objectsInstrumented_BinTreeCondition24[
  var_11_y:univ
]{
   isEmptyOrNull[var_11_y]

}

pred roops_core_objectsInstrumented_BinTree_object_invariant[
  roops_core_objectsInstrumented_BinTreeNode_key:univ->univ,
  roops_core_objectsInstrumented_BinTreeNode_left:univ->univ,
  roops_core_objectsInstrumented_BinTreeNode_parent:univ->univ,
  roops_core_objectsInstrumented_BinTreeNode_right:univ->univ,
  roops_core_objectsInstrumented_BinTree_root:univ->univ,
  thiz:univ
]{
   (
     all n:roops_core_objectsInstrumented_BinTreeNode | {
       isSubset[n,
               (thiz.roops_core_objectsInstrumented_BinTree_root).(fun_reflexive_closure[roops_core_objectsInstrumented_BinTreeNode_left+roops_core_objectsInstrumented_BinTreeNode_right])]
       implies 
               (
                 isNotSubset[n,
                            n.(fun_closure[roops_core_objectsInstrumented_BinTreeNode_left+roops_core_objectsInstrumented_BinTreeNode_right])]
                 and 
                 (
                   all m:roops_core_objectsInstrumented_BinTreeNode | {
                     isSubset[m,
                             (n.roops_core_objectsInstrumented_BinTreeNode_left).(fun_reflexive_closure[roops_core_objectsInstrumented_BinTreeNode_left+roops_core_objectsInstrumented_BinTreeNode_right])]
                     implies 
                             pred_java_primitive_integer_value_lt[m.roops_core_objectsInstrumented_BinTreeNode_key,
                                                                 n.roops_core_objectsInstrumented_BinTreeNode_key]
                   
                   }
                 )
                 and 
                 (
                   all m:roops_core_objectsInstrumented_BinTreeNode | {
                     isSubset[m,
                             (n.roops_core_objectsInstrumented_BinTreeNode_right).(fun_reflexive_closure[roops_core_objectsInstrumented_BinTreeNode_left+roops_core_objectsInstrumented_BinTreeNode_right])]
                     implies 
                             pred_java_primitive_integer_value_lt[n.roops_core_objectsInstrumented_BinTreeNode_key,
                                                                 m.roops_core_objectsInstrumented_BinTreeNode_key]
                   
                   }
                 )
                 and 
                 (
                   neq[n.roops_core_objectsInstrumented_BinTreeNode_left,
                      null]
                   implies 
                           equ[(n.roops_core_objectsInstrumented_BinTreeNode_left).roops_core_objectsInstrumented_BinTreeNode_parent,
                              n]
                 )
                 and 
                 (
                   neq[n.roops_core_objectsInstrumented_BinTreeNode_right,
                      null]
                   implies 
                           equ[(n.roops_core_objectsInstrumented_BinTreeNode_right).roops_core_objectsInstrumented_BinTreeNode_parent,
                              n]
                 )
                 and 
                 (
                   equ[n,
                      thiz.roops_core_objectsInstrumented_BinTree_root]
                   implies 
                           equ[n.roops_core_objectsInstrumented_BinTreeNode_parent,
                              null]
                 )
               )
     
     }
   )
   and 
   (
     not (
       thiz.roops_core_objectsInstrumented_BinTree_root=null)
   )

}

pred roops_core_objectsInstrumented_BinTreeCondition54[
  t_42:univ
]{
   t_42=true

}

pred roops_core_objectsInstrumented_BinTreeCondition55[
  t_42:univ
]{
   not (
     t_42=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition3[
  exit_stmt_reached:univ,
  throw:univ
]{
   not (
     (
       throw=null)
     and 
     (
       exit_stmt_reached=false)
   )

}

pred roops_core_objectsInstrumented_BinTreeCondition14[
  t_9:univ
]{
   t_9=true

}

pred roops_core_objectsInstrumented_BinTreeCondition2[
  exit_stmt_reached:univ,
  throw:univ
]{
   (
     throw=null)
   and 
   (
     exit_stmt_reached=false)

}

pred roops_core_objectsInstrumented_BinTreeCondition42[
  thiz:univ,
  var_7_x:univ
]{
   isEmptyOrNull[var_7_x]
   or 
   isEmptyOrNull[thiz]

}

pred roops_core_objectsInstrumented_BinTreeCondition43[
  thiz:univ,
  var_7_x:univ
]{
   not (
     isEmptyOrNull[var_7_x]
     or 
     isEmptyOrNull[thiz]
   )

}

pred roops_core_objectsInstrumented_BinTreeCondition15[
  t_9:univ
]{
   not (
     t_9=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition51[
  var_9_y:univ
]{
   not (
     isEmptyOrNull[var_9_y])

}

pred roops_core_objectsInstrumented_BinTreeCondition50[
  var_9_y:univ
]{
   isEmptyOrNull[var_9_y]

}

pred roops_core_objectsInstrumented_BinTreeCondition31[
  t_49:univ
]{
   not (
     t_49=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition67[
  t_35:univ
]{
   not (
     t_35=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition30[
  t_49:univ
]{
   t_49=true

}

pred roops_core_objectsInstrumented_BinTreeCondition64[
  t_34:univ
]{
   t_34=true

}

pred roops_core_objectsInstrumented_BinTreeCondition65[
  t_34:univ
]{
   not (
     t_34=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition66[
  t_35:univ
]{
   t_35=true

}

pred roops_core_objectsInstrumented_BinTree_ensures[
  throw':univ
]{
   liftExpression[false]
   and 
   equ[throw',
      null]

}

pred precondition_roops_core_objectsInstrumented_BinTree_removeTest_0[
  roops_core_objectsInstrumented_BinTreeNode_key:univ->univ,
  roops_core_objectsInstrumented_BinTreeNode_left:univ->univ,
  roops_core_objectsInstrumented_BinTreeNode_parent:univ->univ,
  roops_core_objectsInstrumented_BinTreeNode_right:univ->univ,
  roops_core_objectsInstrumented_BinTree_root:univ->univ,
  throw:univ
]{
   equ[throw,
      null]
   and 
   (
     all objx:roops_core_objectsInstrumented_BinTree | {
       roops_core_objectsInstrumented_BinTree_object_invariant[roops_core_objectsInstrumented_BinTreeNode_key,
                                                              roops_core_objectsInstrumented_BinTreeNode_left,
                                                              roops_core_objectsInstrumented_BinTreeNode_parent,
                                                              roops_core_objectsInstrumented_BinTreeNode_right,
                                                              roops_core_objectsInstrumented_BinTree_root,
                                                              objx]
     
     }
   )

}

pred roops_core_objectsInstrumented_BinTreeCondition62[
  var_5_x:univ
]{
   isEmptyOrNull[var_5_x]

}

pred roops_core_objectsInstrumented_BinTreeCondition8[
  tree:univ
]{
   isEmptyOrNull[tree]

}

pred roops_core_objectsInstrumented_BinTreeCondition63[
  var_5_x:univ
]{
   not (
     isEmptyOrNull[var_5_x])

}

pred roops_core_objectsInstrumented_BinTreeCondition9[
  tree:univ
]{
   not (
     isEmptyOrNull[tree])

}

pred roops_core_objectsInstrumented_BinTreeCondition20[
  thiz:univ
]{
   isEmptyOrNull[thiz]

}

pred roops_core_objectsInstrumented_BinTreeCondition41[
  t_52:univ
]{
   not (
     t_52=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition39[
  var_11_y:univ,
  z:univ
]{
   not (
     isEmptyOrNull[z]
     or 
     isEmptyOrNull[var_11_y]
   )

}

pred roops_core_objectsInstrumented_BinTreeCondition40[
  t_52:univ
]{
   t_52=true

}

pred roops_core_objectsInstrumented_BinTreeCondition38[
  var_11_y:univ,
  z:univ
]{
   isEmptyOrNull[z]
   or 
   isEmptyOrNull[var_11_y]

}

pred roops_core_objectsInstrumented_BinTreeCondition21[
  thiz:univ
]{
   not (
     isEmptyOrNull[thiz])

}

pred roops_core_objectsInstrumented_BinTreeCondition10[
  t_13:univ
]{
   t_13=true

}

pred roops_core_objectsInstrumented_BinTreeCondition11[
  t_13:univ
]{
   not (
     t_13=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition12[
  t_10:univ
]{
   t_10=true

}

pred roops_core_objectsInstrumented_BinTreeCondition13[
  t_10:univ
]{
   not (
     t_10=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition27[
  t_48:univ
]{
   not (
     t_48=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition26[
  t_48:univ
]{
   t_48=true

}

pred roops_core_objectsInstrumented_BinTreeCondition52[
  t_37:univ
]{
   t_37=true

}

pred roops_core_objectsInstrumented_BinTreeCondition53[
  t_37:univ
]{
   not (
     t_37=true)

}

pred roops_core_objectsInstrumented_BinTreeCondition22[
  t_45:univ
]{
   t_45=true

}

pred roops_core_objectsInstrumented_BinTreeCondition23[
  t_45:univ
]{
   not (
     t_45=true)

}
//-------------- JavaPrimitiveIntegerValue--------------//
sig JavaPrimitiveIntegerValue {b00:boolean,
b01:boolean,
b02:boolean,
b03:boolean,
b04:boolean,
b05:boolean,
b06:boolean,
b07:boolean,
b08:boolean,
b09:boolean,
b10:boolean,
b11:boolean,
b12:boolean,
b13:boolean,
b14:boolean,
b15:boolean,
b16:boolean,
b17:boolean,
b18:boolean,
b19:boolean,
b20:boolean,
b21:boolean,
b22:boolean,
b23:boolean,
b24:boolean,
b25:boolean,
b26:boolean,
b27:boolean,
b28:boolean,
b29:boolean,
b30:boolean,
b31:boolean}
{all m:JavaPrimitiveIntegerValue,
n:JavaPrimitiveIntegerValue | {
  pred_java_primitive_integer_value_eq[m,n] implies (m=n)
}
}
/*
Authors: Pablo Abad and Marcelo Frias

PREDICATES:
pred_java_primitive_integer_value_abs
pred_java_primitive_integer_value_decrement
pred_java_primitive_integer_value_add
pred_java_primitive_integer_value_sub
pred_java_primitive_integer_value_div
pred_java_primitive_integer_value_div_rem
pred_java_primitive_integer_value_eq
pred_java_primitive_integer_value_eq_zero
pred_java_primitive_integer_value_gt
pred_java_primitive_integer_value_gt_zero
pred_java_primitive_integer_value_gte
pred_java_primitive_integer_value_gte_zero
pred_java_primitive_integer_value_lt
pred_java_primitive_integer_value_lt_zero
pred_java_primitive_integer_value_lte_zero
pred_java_primitive_integer_value_lte
pred_java_primitive_integer_value_mul
pred_java_primitive_integer_value_negate
pred_java_primitive_integer_value_neq
pred_java_primitive_integer_value_sshr

MARKER PREDICATES
pred_java_primitive_integer_value_mul_marker

FUNCTIONS:
fun_java_primitive_integer_value_add
fun_java_primitive_integer_value_div
fun_java_primitive_integer_value_mul
fun_java_primitive_integer_value_negate
fun_java_primitive_integer_value_rem
fun_java_primitive_integer_value_sshr
fun_java_primitive_integer_value_sub
*/

// PREDICATES

pred pred_java_primitive_integer_value_sshr[a: JavaPrimitiveIntegerValue, 
                                          ret: JavaPrimitiveIntegerValue] {
 a.b31= ret.b31 
 false= ret.b30
 a.b30= ret.b29 
 a.b29= ret.b28 
 a.b28= ret.b27 
 a.b27= ret.b26 
 a.b26= ret.b25 
 a.b25= ret.b24 
 a.b24= ret.b23 
 a.b23= ret.b22 
 a.b22= ret.b21 
 a.b21= ret.b20 
 a.b20= ret.b19 
 a.b19= ret.b18 
 a.b18= ret.b17 
 a.b17= ret.b16 
 a.b16= ret.b15 
 a.b15= ret.b14 
 a.b14= ret.b13 
 a.b13= ret.b12 
 a.b12= ret.b11 
 a.b11= ret.b10 
 a.b10= ret.b09 
 a.b09= ret.b08 
 a.b08= ret.b07 
 a.b07= ret.b06 
 a.b06= ret.b05 
 a.b05= ret.b04 
 a.b04= ret.b03 
 a.b03= ret.b02 
 a.b02= ret.b01 
 a.b01= ret.b00 
}


pred pred_java_primitive_integer_value_negate[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue] { 
   a.b00 in b.b00 
   a.b01 in Xor [ Not[b.b01]  , And[Not[b.b00], Xor[Not[b.b00], a.b00]]] 
   a.b02 in Xor [ Not[b.b02]  , And[Not[b.b01], Xor[Not[b.b01], a.b01]]] 
   a.b03 in Xor [ Not[b.b03]  , And[Not[b.b02], Xor[Not[b.b02], a.b02]]] 
   a.b04 in Xor [ Not[b.b04]  , And[Not[b.b03], Xor[Not[b.b03], a.b03]]] 
   a.b05 in Xor [ Not[b.b05]  , And[Not[b.b04], Xor[Not[b.b04], a.b04]]] 
   a.b06 in Xor [ Not[b.b06]  , And[Not[b.b05], Xor[Not[b.b05], a.b05]]] 
   a.b07 in Xor [ Not[b.b07]  , And[Not[b.b06], Xor[Not[b.b06], a.b06]]] 
   a.b08 in Xor [ Not[b.b08]  , And[Not[b.b07], Xor[Not[b.b07], a.b07]]] 
   a.b09 in Xor [ Not[b.b09]  , And[Not[b.b08], Xor[Not[b.b08], a.b08]]] 
   a.b10 in Xor [ Not[b.b10]  , And[Not[b.b09], Xor[Not[b.b09], a.b09]]] 
   a.b11 in Xor [ Not[b.b11]  , And[Not[b.b10], Xor[Not[b.b10], a.b10]]] 
   a.b12 in Xor [ Not[b.b12]  , And[Not[b.b11], Xor[Not[b.b11], a.b11]]] 
   a.b13 in Xor [ Not[b.b13]  , And[Not[b.b12], Xor[Not[b.b12], a.b12]]] 
   a.b14 in Xor [ Not[b.b14]  , And[Not[b.b13], Xor[Not[b.b13], a.b13]]] 
   a.b15 in Xor [ Not[b.b15]  , And[Not[b.b14], Xor[Not[b.b14], a.b14]]] 
   a.b16 in Xor [ Not[b.b16]  , And[Not[b.b15], Xor[Not[b.b15], a.b15]]] 
   a.b17 in Xor [ Not[b.b17]  , And[Not[b.b16], Xor[Not[b.b16], a.b16]]] 
   a.b18 in Xor [ Not[b.b18]  , And[Not[b.b17], Xor[Not[b.b17], a.b17]]] 
   a.b19 in Xor [ Not[b.b19]  , And[Not[b.b18], Xor[Not[b.b18], a.b18]]] 
   a.b20 in Xor [ Not[b.b20]  , And[Not[b.b19], Xor[Not[b.b19], a.b19]]] 
   a.b21 in Xor [ Not[b.b21]  , And[Not[b.b20], Xor[Not[b.b20], a.b20]]] 
   a.b22 in Xor [ Not[b.b22]  , And[Not[b.b21], Xor[Not[b.b21], a.b21]]] 
   a.b23 in Xor [ Not[b.b23]  , And[Not[b.b22], Xor[Not[b.b22], a.b22]]] 
   a.b24 in Xor [ Not[b.b24]  , And[Not[b.b23], Xor[Not[b.b23], a.b23]]] 
   a.b25 in Xor [ Not[b.b25]  , And[Not[b.b24], Xor[Not[b.b24], a.b24]]] 
   a.b26 in Xor [ Not[b.b26]  , And[Not[b.b25], Xor[Not[b.b25], a.b25]]] 
   a.b27 in Xor [ Not[b.b27]  , And[Not[b.b26], Xor[Not[b.b26], a.b26]]] 
   a.b28 in Xor [ Not[b.b28]  , And[Not[b.b27], Xor[Not[b.b27], a.b27]]] 
   a.b29 in Xor [ Not[b.b29]  , And[Not[b.b28], Xor[Not[b.b28], a.b28]]] 
   a.b30 in Xor [ Not[b.b30]  , And[Not[b.b29], Xor[Not[b.b29], a.b29]]] 
   a.b31 in Xor [ Not[b.b31]  , And[Not[b.b30], Xor[Not[b.b30], a.b30]]] 
}


pred pred_java_primitive_integer_value_mul[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue, result: JavaPrimitiveIntegerValue, overflow: boolean] {
some 
   a_c00, a_c01, a_c02, a_c03, a_c04, a_c05, a_c06, a_c07, a_c08, a_c09, a_c10, a_c11, a_c12, a_c13, a_c14, a_c15, a_c16, a_c17, a_c18, a_c19, a_c20, a_c21, a_c22, a_c23, a_c24, a_c25, a_c26, a_c27, a_c28, a_c29, a_c30, 
   b_c00, b_c01, b_c02, b_c03, b_c04, b_c05, b_c06, b_c07, b_c08, b_c09, b_c10, b_c11, b_c12, b_c13, b_c14, b_c15, b_c16, b_c17, b_c18, b_c19, b_c20, b_c21, b_c22, b_c23, b_c24, b_c25, b_c26, b_c27, b_c28, b_c29, b_c30, 
   s_0_0, s_0_1, 
   s_1_0, s_1_1, s_1_2, 
   s_2_0, s_2_1, s_2_2, s_2_3, 
   s_3_0, s_3_1, s_3_2, s_3_3, s_3_4, 
   s_4_0, s_4_1, s_4_2, s_4_3, s_4_4, s_4_5, 
   s_5_0, s_5_1, s_5_2, s_5_3, s_5_4, s_5_5, s_5_6, 
   s_6_0, s_6_1, s_6_2, s_6_3, s_6_4, s_6_5, s_6_6, s_6_7, 
   s_7_0, s_7_1, s_7_2, s_7_3, s_7_4, s_7_5, s_7_6, s_7_7, s_7_8, 
   s_8_0, s_8_1, s_8_2, s_8_3, s_8_4, s_8_5, s_8_6, s_8_7, s_8_8, s_8_9, 
   s_9_0, s_9_1, s_9_2, s_9_3, s_9_4, s_9_5, s_9_6, s_9_7, s_9_8, s_9_9, s_9_10, 
   s_10_0, s_10_1, s_10_2, s_10_3, s_10_4, s_10_5, s_10_6, s_10_7, s_10_8, s_10_9, s_10_10, s_10_11, 
   s_11_0, s_11_1, s_11_2, s_11_3, s_11_4, s_11_5, s_11_6, s_11_7, s_11_8, s_11_9, s_11_10, s_11_11, s_11_12, 
   s_12_0, s_12_1, s_12_2, s_12_3, s_12_4, s_12_5, s_12_6, s_12_7, s_12_8, s_12_9, s_12_10, s_12_11, s_12_12, s_12_13, 
   s_13_0, s_13_1, s_13_2, s_13_3, s_13_4, s_13_5, s_13_6, s_13_7, s_13_8, s_13_9, s_13_10, s_13_11, s_13_12, s_13_13, s_13_14, 
   s_14_0, s_14_1, s_14_2, s_14_3, s_14_4, s_14_5, s_14_6, s_14_7, s_14_8, s_14_9, s_14_10, s_14_11, s_14_12, s_14_13, s_14_14, s_14_15, 
   s_15_0, s_15_1, s_15_2, s_15_3, s_15_4, s_15_5, s_15_6, s_15_7, s_15_8, s_15_9, s_15_10, s_15_11, s_15_12, s_15_13, s_15_14, s_15_15, s_15_16, 
   s_16_0, s_16_1, s_16_2, s_16_3, s_16_4, s_16_5, s_16_6, s_16_7, s_16_8, s_16_9, s_16_10, s_16_11, s_16_12, s_16_13, s_16_14, s_16_15, s_16_16, s_16_17, 
   s_17_0, s_17_1, s_17_2, s_17_3, s_17_4, s_17_5, s_17_6, s_17_7, s_17_8, s_17_9, s_17_10, s_17_11, s_17_12, s_17_13, s_17_14, s_17_15, s_17_16, s_17_17, s_17_18, 
   s_18_0, s_18_1, s_18_2, s_18_3, s_18_4, s_18_5, s_18_6, s_18_7, s_18_8, s_18_9, s_18_10, s_18_11, s_18_12, s_18_13, s_18_14, s_18_15, s_18_16, s_18_17, s_18_18, s_18_19, 
   s_19_0, s_19_1, s_19_2, s_19_3, s_19_4, s_19_5, s_19_6, s_19_7, s_19_8, s_19_9, s_19_10, s_19_11, s_19_12, s_19_13, s_19_14, s_19_15, s_19_16, s_19_17, s_19_18, s_19_19, s_19_20, 
   s_20_0, s_20_1, s_20_2, s_20_3, s_20_4, s_20_5, s_20_6, s_20_7, s_20_8, s_20_9, s_20_10, s_20_11, s_20_12, s_20_13, s_20_14, s_20_15, s_20_16, s_20_17, s_20_18, s_20_19, s_20_20, s_20_21, 
   s_21_0, s_21_1, s_21_2, s_21_3, s_21_4, s_21_5, s_21_6, s_21_7, s_21_8, s_21_9, s_21_10, s_21_11, s_21_12, s_21_13, s_21_14, s_21_15, s_21_16, s_21_17, s_21_18, s_21_19, s_21_20, s_21_21, s_21_22, 
   s_22_0, s_22_1, s_22_2, s_22_3, s_22_4, s_22_5, s_22_6, s_22_7, s_22_8, s_22_9, s_22_10, s_22_11, s_22_12, s_22_13, s_22_14, s_22_15, s_22_16, s_22_17, s_22_18, s_22_19, s_22_20, s_22_21, s_22_22, s_22_23, 
   s_23_0, s_23_1, s_23_2, s_23_3, s_23_4, s_23_5, s_23_6, s_23_7, s_23_8, s_23_9, s_23_10, s_23_11, s_23_12, s_23_13, s_23_14, s_23_15, s_23_16, s_23_17, s_23_18, s_23_19, s_23_20, s_23_21, s_23_22, s_23_23, s_23_24, 
   s_24_0, s_24_1, s_24_2, s_24_3, s_24_4, s_24_5, s_24_6, s_24_7, s_24_8, s_24_9, s_24_10, s_24_11, s_24_12, s_24_13, s_24_14, s_24_15, s_24_16, s_24_17, s_24_18, s_24_19, s_24_20, s_24_21, s_24_22, s_24_23, s_24_24, s_24_25, 
   s_25_0, s_25_1, s_25_2, s_25_3, s_25_4, s_25_5, s_25_6, s_25_7, s_25_8, s_25_9, s_25_10, s_25_11, s_25_12, s_25_13, s_25_14, s_25_15, s_25_16, s_25_17, s_25_18, s_25_19, s_25_20, s_25_21, s_25_22, s_25_23, s_25_24, s_25_25, s_25_26, 
   s_26_0, s_26_1, s_26_2, s_26_3, s_26_4, s_26_5, s_26_6, s_26_7, s_26_8, s_26_9, s_26_10, s_26_11, s_26_12, s_26_13, s_26_14, s_26_15, s_26_16, s_26_17, s_26_18, s_26_19, s_26_20, s_26_21, s_26_22, s_26_23, s_26_24, s_26_25, s_26_26, s_26_27, 
   s_27_0, s_27_1, s_27_2, s_27_3, s_27_4, s_27_5, s_27_6, s_27_7, s_27_8, s_27_9, s_27_10, s_27_11, s_27_12, s_27_13, s_27_14, s_27_15, s_27_16, s_27_17, s_27_18, s_27_19, s_27_20, s_27_21, s_27_22, s_27_23, s_27_24, s_27_25, s_27_26, s_27_27, s_27_28, 
   s_28_0, s_28_1, s_28_2, s_28_3, s_28_4, s_28_5, s_28_6, s_28_7, s_28_8, s_28_9, s_28_10, s_28_11, s_28_12, s_28_13, s_28_14, s_28_15, s_28_16, s_28_17, s_28_18, s_28_19, s_28_20, s_28_21, s_28_22, s_28_23, s_28_24, s_28_25, s_28_26, s_28_27, s_28_28, s_28_29, 
   s_29_0, s_29_1, s_29_2, s_29_3, s_29_4, s_29_5, s_29_6, s_29_7, s_29_8, s_29_9, s_29_10, s_29_11, s_29_12, s_29_13, s_29_14, s_29_15, s_29_16, s_29_17, s_29_18, s_29_19, s_29_20, s_29_21, s_29_22, s_29_23, s_29_24, s_29_25, s_29_26, s_29_27, s_29_28, s_29_29, s_29_30, 
   s_30_0, s_30_1, s_30_2, s_30_3, s_30_4, s_30_5, s_30_6, s_30_7, s_30_8, s_30_9, s_30_10, s_30_11, s_30_12, s_30_13, s_30_14, s_30_15, s_30_16, s_30_17, s_30_18, s_30_19, s_30_20, s_30_21, s_30_22, s_30_23, s_30_24, s_30_25, s_30_26, s_30_27, s_30_28, s_30_29, s_30_30, s_30_31, 
   s_31_0, s_31_1, s_31_2, s_31_3, s_31_4, s_31_5, s_31_6, s_31_7, s_31_8, s_31_9, s_31_10, s_31_11, s_31_12, s_31_13, s_31_14, s_31_15, s_31_16, s_31_17, s_31_18, s_31_19, s_31_20, s_31_21, s_31_22, s_31_23, s_31_24, s_31_25, s_31_26, s_31_27, s_31_28, s_31_29, s_31_30, s_31_31, s_31_32, 
   c_0_0, c_0_1, 
   c_1_0, c_1_1, c_1_2, 
   c_2_0, c_2_1, c_2_2, c_2_3, 
   c_3_0, c_3_1, c_3_2, c_3_3, c_3_4, 
   c_4_0, c_4_1, c_4_2, c_4_3, c_4_4, c_4_5, 
   c_5_0, c_5_1, c_5_2, c_5_3, c_5_4, c_5_5, c_5_6, 
   c_6_0, c_6_1, c_6_2, c_6_3, c_6_4, c_6_5, c_6_6, c_6_7, 
   c_7_0, c_7_1, c_7_2, c_7_3, c_7_4, c_7_5, c_7_6, c_7_7, c_7_8, 
   c_8_0, c_8_1, c_8_2, c_8_3, c_8_4, c_8_5, c_8_6, c_8_7, c_8_8, c_8_9, 
   c_9_0, c_9_1, c_9_2, c_9_3, c_9_4, c_9_5, c_9_6, c_9_7, c_9_8, c_9_9, c_9_10, 
   c_10_0, c_10_1, c_10_2, c_10_3, c_10_4, c_10_5, c_10_6, c_10_7, c_10_8, c_10_9, c_10_10, c_10_11, 
   c_11_0, c_11_1, c_11_2, c_11_3, c_11_4, c_11_5, c_11_6, c_11_7, c_11_8, c_11_9, c_11_10, c_11_11, c_11_12, 
   c_12_0, c_12_1, c_12_2, c_12_3, c_12_4, c_12_5, c_12_6, c_12_7, c_12_8, c_12_9, c_12_10, c_12_11, c_12_12, c_12_13, 
   c_13_0, c_13_1, c_13_2, c_13_3, c_13_4, c_13_5, c_13_6, c_13_7, c_13_8, c_13_9, c_13_10, c_13_11, c_13_12, c_13_13, c_13_14, 
   c_14_0, c_14_1, c_14_2, c_14_3, c_14_4, c_14_5, c_14_6, c_14_7, c_14_8, c_14_9, c_14_10, c_14_11, c_14_12, c_14_13, c_14_14, c_14_15, 
   c_15_0, c_15_1, c_15_2, c_15_3, c_15_4, c_15_5, c_15_6, c_15_7, c_15_8, c_15_9, c_15_10, c_15_11, c_15_12, c_15_13, c_15_14, c_15_15, c_15_16, 
   c_16_0, c_16_1, c_16_2, c_16_3, c_16_4, c_16_5, c_16_6, c_16_7, c_16_8, c_16_9, c_16_10, c_16_11, c_16_12, c_16_13, c_16_14, c_16_15, c_16_16, c_16_17, 
   c_17_0, c_17_1, c_17_2, c_17_3, c_17_4, c_17_5, c_17_6, c_17_7, c_17_8, c_17_9, c_17_10, c_17_11, c_17_12, c_17_13, c_17_14, c_17_15, c_17_16, c_17_17, c_17_18, 
   c_18_0, c_18_1, c_18_2, c_18_3, c_18_4, c_18_5, c_18_6, c_18_7, c_18_8, c_18_9, c_18_10, c_18_11, c_18_12, c_18_13, c_18_14, c_18_15, c_18_16, c_18_17, c_18_18, c_18_19, 
   c_19_0, c_19_1, c_19_2, c_19_3, c_19_4, c_19_5, c_19_6, c_19_7, c_19_8, c_19_9, c_19_10, c_19_11, c_19_12, c_19_13, c_19_14, c_19_15, c_19_16, c_19_17, c_19_18, c_19_19, c_19_20, 
   c_20_0, c_20_1, c_20_2, c_20_3, c_20_4, c_20_5, c_20_6, c_20_7, c_20_8, c_20_9, c_20_10, c_20_11, c_20_12, c_20_13, c_20_14, c_20_15, c_20_16, c_20_17, c_20_18, c_20_19, c_20_20, c_20_21, 
   c_21_0, c_21_1, c_21_2, c_21_3, c_21_4, c_21_5, c_21_6, c_21_7, c_21_8, c_21_9, c_21_10, c_21_11, c_21_12, c_21_13, c_21_14, c_21_15, c_21_16, c_21_17, c_21_18, c_21_19, c_21_20, c_21_21, c_21_22, 
   c_22_0, c_22_1, c_22_2, c_22_3, c_22_4, c_22_5, c_22_6, c_22_7, c_22_8, c_22_9, c_22_10, c_22_11, c_22_12, c_22_13, c_22_14, c_22_15, c_22_16, c_22_17, c_22_18, c_22_19, c_22_20, c_22_21, c_22_22, c_22_23, 
   c_23_0, c_23_1, c_23_2, c_23_3, c_23_4, c_23_5, c_23_6, c_23_7, c_23_8, c_23_9, c_23_10, c_23_11, c_23_12, c_23_13, c_23_14, c_23_15, c_23_16, c_23_17, c_23_18, c_23_19, c_23_20, c_23_21, c_23_22, c_23_23, c_23_24, 
   c_24_0, c_24_1, c_24_2, c_24_3, c_24_4, c_24_5, c_24_6, c_24_7, c_24_8, c_24_9, c_24_10, c_24_11, c_24_12, c_24_13, c_24_14, c_24_15, c_24_16, c_24_17, c_24_18, c_24_19, c_24_20, c_24_21, c_24_22, c_24_23, c_24_24, c_24_25, 
   c_25_0, c_25_1, c_25_2, c_25_3, c_25_4, c_25_5, c_25_6, c_25_7, c_25_8, c_25_9, c_25_10, c_25_11, c_25_12, c_25_13, c_25_14, c_25_15, c_25_16, c_25_17, c_25_18, c_25_19, c_25_20, c_25_21, c_25_22, c_25_23, c_25_24, c_25_25, c_25_26, 
   c_26_0, c_26_1, c_26_2, c_26_3, c_26_4, c_26_5, c_26_6, c_26_7, c_26_8, c_26_9, c_26_10, c_26_11, c_26_12, c_26_13, c_26_14, c_26_15, c_26_16, c_26_17, c_26_18, c_26_19, c_26_20, c_26_21, c_26_22, c_26_23, c_26_24, c_26_25, c_26_26, c_26_27, 
   c_27_0, c_27_1, c_27_2, c_27_3, c_27_4, c_27_5, c_27_6, c_27_7, c_27_8, c_27_9, c_27_10, c_27_11, c_27_12, c_27_13, c_27_14, c_27_15, c_27_16, c_27_17, c_27_18, c_27_19, c_27_20, c_27_21, c_27_22, c_27_23, c_27_24, c_27_25, c_27_26, c_27_27, c_27_28, 
   c_28_0, c_28_1, c_28_2, c_28_3, c_28_4, c_28_5, c_28_6, c_28_7, c_28_8, c_28_9, c_28_10, c_28_11, c_28_12, c_28_13, c_28_14, c_28_15, c_28_16, c_28_17, c_28_18, c_28_19, c_28_20, c_28_21, c_28_22, c_28_23, c_28_24, c_28_25, c_28_26, c_28_27, c_28_28, c_28_29, 
   c_29_0, c_29_1, c_29_2, c_29_3, c_29_4, c_29_5, c_29_6, c_29_7, c_29_8, c_29_9, c_29_10, c_29_11, c_29_12, c_29_13, c_29_14, c_29_15, c_29_16, c_29_17, c_29_18, c_29_19, c_29_20, c_29_21, c_29_22, c_29_23, c_29_24, c_29_25, c_29_26, c_29_27, c_29_28, c_29_29, c_29_30, 
   c_30_0, c_30_1, c_30_2, c_30_3, c_30_4, c_30_5, c_30_6, c_30_7, c_30_8, c_30_9, c_30_10, c_30_11, c_30_12, c_30_13, c_30_14, c_30_15, c_30_16, c_30_17, c_30_18, c_30_19, c_30_20, c_30_21, c_30_22, c_30_23, c_30_24, c_30_25, c_30_26, c_30_27, c_30_28, c_30_29, c_30_30, c_30_31, 
   c_31_1, c_31_2, c_31_3, c_31_4, c_31_5, c_31_6, c_31_7, c_31_8, c_31_9, c_31_10, c_31_11, c_31_12, c_31_13, c_31_14, c_31_15, c_31_16, c_31_17, c_31_18, c_31_19, c_31_20, c_31_21, c_31_22, c_31_23, c_31_24, c_31_25, c_31_26, c_31_27, c_31_28, c_31_29, c_31_30, c_31_31, 
   t : boolean |
   a_c00 in Xor[a.b00, a.b31] and
   b_c00 in Xor[b.b00, b.b31] and
   a_c01 in Xor[a.b01, a.b31] and
   b_c01 in Xor[b.b01, b.b31] and
   a_c02 in Xor[a.b02, a.b31] and
   b_c02 in Xor[b.b02, b.b31] and
   a_c03 in Xor[a.b03, a.b31] and
   b_c03 in Xor[b.b03, b.b31] and
   a_c04 in Xor[a.b04, a.b31] and
   b_c04 in Xor[b.b04, b.b31] and
   a_c05 in Xor[a.b05, a.b31] and
   b_c05 in Xor[b.b05, b.b31] and
   a_c06 in Xor[a.b06, a.b31] and
   b_c06 in Xor[b.b06, b.b31] and
   a_c07 in Xor[a.b07, a.b31] and
   b_c07 in Xor[b.b07, b.b31] and
   a_c08 in Xor[a.b08, a.b31] and
   b_c08 in Xor[b.b08, b.b31] and
   a_c09 in Xor[a.b09, a.b31] and
   b_c09 in Xor[b.b09, b.b31] and
   a_c10 in Xor[a.b10, a.b31] and
   b_c10 in Xor[b.b10, b.b31] and
   a_c11 in Xor[a.b11, a.b31] and
   b_c11 in Xor[b.b11, b.b31] and
   a_c12 in Xor[a.b12, a.b31] and
   b_c12 in Xor[b.b12, b.b31] and
   a_c13 in Xor[a.b13, a.b31] and
   b_c13 in Xor[b.b13, b.b31] and
   a_c14 in Xor[a.b14, a.b31] and
   b_c14 in Xor[b.b14, b.b31] and
   a_c15 in Xor[a.b15, a.b31] and
   b_c15 in Xor[b.b15, b.b31] and
   a_c16 in Xor[a.b16, a.b31] and
   b_c16 in Xor[b.b16, b.b31] and
   a_c17 in Xor[a.b17, a.b31] and
   b_c17 in Xor[b.b17, b.b31] and
   a_c18 in Xor[a.b18, a.b31] and
   b_c18 in Xor[b.b18, b.b31] and
   a_c19 in Xor[a.b19, a.b31] and
   b_c19 in Xor[b.b19, b.b31] and
   a_c20 in Xor[a.b20, a.b31] and
   b_c20 in Xor[b.b20, b.b31] and
   a_c21 in Xor[a.b21, a.b31] and
   b_c21 in Xor[b.b21, b.b31] and
   a_c22 in Xor[a.b22, a.b31] and
   b_c22 in Xor[b.b22, b.b31] and
   a_c23 in Xor[a.b23, a.b31] and
   b_c23 in Xor[b.b23, b.b31] and
   a_c24 in Xor[a.b24, a.b31] and
   b_c24 in Xor[b.b24, b.b31] and
   a_c25 in Xor[a.b25, a.b31] and
   b_c25 in Xor[b.b25, b.b31] and
   a_c26 in Xor[a.b26, a.b31] and
   b_c26 in Xor[b.b26, b.b31] and
   a_c27 in Xor[a.b27, a.b31] and
   b_c27 in Xor[b.b27, b.b31] and
   a_c28 in Xor[a.b28, a.b31] and
   b_c28 in Xor[b.b28, b.b31] and
   a_c29 in Xor[a.b29, a.b31] and
   b_c29 in Xor[b.b29, b.b31] and
   a_c30 in Xor[a.b30, a.b31] and
   b_c30 in Xor[b.b30, b.b31] and
   t in Xor[a.b31, b.b31] and

   s_0_0 in AdderSum  [And[a_c00,b.b31], And[a.b31, b_c00], And[a.b31, b.b31]] and
   c_0_0 in AdderCarry[And[a_c00,b.b31], And[a.b31, b_c00], And[a.b31, b.b31]] and

   s_0_1 in AdderSum  [s_0_0, And[a_c00, b_c00], false] and
   c_0_1 in AdderCarry[s_0_0, And[a_c00, b_c00], false] and

   s_1_0 in AdderSum  [And[a_c01,b.b31], And[a.b31, b_c01], false] and
   c_1_0 in AdderCarry[And[a_c01,b.b31], And[a.b31, b_c01], false] and

   s_1_1 in AdderSum  [s_1_0, And[a_c01, b_c00], c_0_0] and
   c_1_1 in AdderCarry[s_1_0, And[a_c01, b_c00], c_0_0] and

   s_1_2 in AdderSum  [s_1_1, And[a_c00, b_c01], c_0_1] and
   c_1_2 in AdderCarry[s_1_1, And[a_c00, b_c01], c_0_1] and

   s_2_0 in AdderSum  [And[a_c02,b.b31], And[a.b31, b_c02], false] and
   c_2_0 in AdderCarry[And[a_c02,b.b31], And[a.b31, b_c02], false] and

   s_2_1 in AdderSum  [s_2_0, And[a_c02, b_c00], c_1_0] and
   c_2_1 in AdderCarry[s_2_0, And[a_c02, b_c00], c_1_0] and

   s_2_2 in AdderSum  [s_2_1, And[a_c01, b_c01], c_1_1] and
   c_2_2 in AdderCarry[s_2_1, And[a_c01, b_c01], c_1_1] and

   s_2_3 in AdderSum  [s_2_2, And[a_c00, b_c02], c_1_2] and
   c_2_3 in AdderCarry[s_2_2, And[a_c00, b_c02], c_1_2] and

   s_3_0 in AdderSum  [And[a_c03,b.b31], And[a.b31, b_c03], false] and
   c_3_0 in AdderCarry[And[a_c03,b.b31], And[a.b31, b_c03], false] and

   s_3_1 in AdderSum  [s_3_0, And[a_c03, b_c00], c_2_0] and
   c_3_1 in AdderCarry[s_3_0, And[a_c03, b_c00], c_2_0] and

   s_3_2 in AdderSum  [s_3_1, And[a_c02, b_c01], c_2_1] and
   c_3_2 in AdderCarry[s_3_1, And[a_c02, b_c01], c_2_1] and

   s_3_3 in AdderSum  [s_3_2, And[a_c01, b_c02], c_2_2] and
   c_3_3 in AdderCarry[s_3_2, And[a_c01, b_c02], c_2_2] and

   s_3_4 in AdderSum  [s_3_3, And[a_c00, b_c03], c_2_3] and
   c_3_4 in AdderCarry[s_3_3, And[a_c00, b_c03], c_2_3] and

   s_4_0 in AdderSum  [And[a_c04,b.b31], And[a.b31, b_c04], false] and
   c_4_0 in AdderCarry[And[a_c04,b.b31], And[a.b31, b_c04], false] and

   s_4_1 in AdderSum  [s_4_0, And[a_c04, b_c00], c_3_0] and
   c_4_1 in AdderCarry[s_4_0, And[a_c04, b_c00], c_3_0] and

   s_4_2 in AdderSum  [s_4_1, And[a_c03, b_c01], c_3_1] and
   c_4_2 in AdderCarry[s_4_1, And[a_c03, b_c01], c_3_1] and

   s_4_3 in AdderSum  [s_4_2, And[a_c02, b_c02], c_3_2] and
   c_4_3 in AdderCarry[s_4_2, And[a_c02, b_c02], c_3_2] and

   s_4_4 in AdderSum  [s_4_3, And[a_c01, b_c03], c_3_3] and
   c_4_4 in AdderCarry[s_4_3, And[a_c01, b_c03], c_3_3] and

   s_4_5 in AdderSum  [s_4_4, And[a_c00, b_c04], c_3_4] and
   c_4_5 in AdderCarry[s_4_4, And[a_c00, b_c04], c_3_4] and

   s_5_0 in AdderSum  [And[a_c05,b.b31], And[a.b31, b_c05], false] and
   c_5_0 in AdderCarry[And[a_c05,b.b31], And[a.b31, b_c05], false] and

   s_5_1 in AdderSum  [s_5_0, And[a_c05, b_c00], c_4_0] and
   c_5_1 in AdderCarry[s_5_0, And[a_c05, b_c00], c_4_0] and

   s_5_2 in AdderSum  [s_5_1, And[a_c04, b_c01], c_4_1] and
   c_5_2 in AdderCarry[s_5_1, And[a_c04, b_c01], c_4_1] and

   s_5_3 in AdderSum  [s_5_2, And[a_c03, b_c02], c_4_2] and
   c_5_3 in AdderCarry[s_5_2, And[a_c03, b_c02], c_4_2] and

   s_5_4 in AdderSum  [s_5_3, And[a_c02, b_c03], c_4_3] and
   c_5_4 in AdderCarry[s_5_3, And[a_c02, b_c03], c_4_3] and

   s_5_5 in AdderSum  [s_5_4, And[a_c01, b_c04], c_4_4] and
   c_5_5 in AdderCarry[s_5_4, And[a_c01, b_c04], c_4_4] and

   s_5_6 in AdderSum  [s_5_5, And[a_c00, b_c05], c_4_5] and
   c_5_6 in AdderCarry[s_5_5, And[a_c00, b_c05], c_4_5] and

   s_6_0 in AdderSum  [And[a_c06,b.b31], And[a.b31, b_c06], false] and
   c_6_0 in AdderCarry[And[a_c06,b.b31], And[a.b31, b_c06], false] and

   s_6_1 in AdderSum  [s_6_0, And[a_c06, b_c00], c_5_0] and
   c_6_1 in AdderCarry[s_6_0, And[a_c06, b_c00], c_5_0] and

   s_6_2 in AdderSum  [s_6_1, And[a_c05, b_c01], c_5_1] and
   c_6_2 in AdderCarry[s_6_1, And[a_c05, b_c01], c_5_1] and

   s_6_3 in AdderSum  [s_6_2, And[a_c04, b_c02], c_5_2] and
   c_6_3 in AdderCarry[s_6_2, And[a_c04, b_c02], c_5_2] and

   s_6_4 in AdderSum  [s_6_3, And[a_c03, b_c03], c_5_3] and
   c_6_4 in AdderCarry[s_6_3, And[a_c03, b_c03], c_5_3] and

   s_6_5 in AdderSum  [s_6_4, And[a_c02, b_c04], c_5_4] and
   c_6_5 in AdderCarry[s_6_4, And[a_c02, b_c04], c_5_4] and

   s_6_6 in AdderSum  [s_6_5, And[a_c01, b_c05], c_5_5] and
   c_6_6 in AdderCarry[s_6_5, And[a_c01, b_c05], c_5_5] and

   s_6_7 in AdderSum  [s_6_6, And[a_c00, b_c06], c_5_6] and
   c_6_7 in AdderCarry[s_6_6, And[a_c00, b_c06], c_5_6] and

   s_7_0 in AdderSum  [And[a_c07,b.b31], And[a.b31, b_c07], false] and
   c_7_0 in AdderCarry[And[a_c07,b.b31], And[a.b31, b_c07], false] and

   s_7_1 in AdderSum  [s_7_0, And[a_c07, b_c00], c_6_0] and
   c_7_1 in AdderCarry[s_7_0, And[a_c07, b_c00], c_6_0] and

   s_7_2 in AdderSum  [s_7_1, And[a_c06, b_c01], c_6_1] and
   c_7_2 in AdderCarry[s_7_1, And[a_c06, b_c01], c_6_1] and

   s_7_3 in AdderSum  [s_7_2, And[a_c05, b_c02], c_6_2] and
   c_7_3 in AdderCarry[s_7_2, And[a_c05, b_c02], c_6_2] and

   s_7_4 in AdderSum  [s_7_3, And[a_c04, b_c03], c_6_3] and
   c_7_4 in AdderCarry[s_7_3, And[a_c04, b_c03], c_6_3] and

   s_7_5 in AdderSum  [s_7_4, And[a_c03, b_c04], c_6_4] and
   c_7_5 in AdderCarry[s_7_4, And[a_c03, b_c04], c_6_4] and

   s_7_6 in AdderSum  [s_7_5, And[a_c02, b_c05], c_6_5] and
   c_7_6 in AdderCarry[s_7_5, And[a_c02, b_c05], c_6_5] and

   s_7_7 in AdderSum  [s_7_6, And[a_c01, b_c06], c_6_6] and
   c_7_7 in AdderCarry[s_7_6, And[a_c01, b_c06], c_6_6] and

   s_7_8 in AdderSum  [s_7_7, And[a_c00, b_c07], c_6_7] and
   c_7_8 in AdderCarry[s_7_7, And[a_c00, b_c07], c_6_7] and

   s_8_0 in AdderSum  [And[a_c08,b.b31], And[a.b31, b_c08], false] and
   c_8_0 in AdderCarry[And[a_c08,b.b31], And[a.b31, b_c08], false] and

   s_8_1 in AdderSum  [s_8_0, And[a_c08, b_c00], c_7_0] and
   c_8_1 in AdderCarry[s_8_0, And[a_c08, b_c00], c_7_0] and

   s_8_2 in AdderSum  [s_8_1, And[a_c07, b_c01], c_7_1] and
   c_8_2 in AdderCarry[s_8_1, And[a_c07, b_c01], c_7_1] and

   s_8_3 in AdderSum  [s_8_2, And[a_c06, b_c02], c_7_2] and
   c_8_3 in AdderCarry[s_8_2, And[a_c06, b_c02], c_7_2] and

   s_8_4 in AdderSum  [s_8_3, And[a_c05, b_c03], c_7_3] and
   c_8_4 in AdderCarry[s_8_3, And[a_c05, b_c03], c_7_3] and

   s_8_5 in AdderSum  [s_8_4, And[a_c04, b_c04], c_7_4] and
   c_8_5 in AdderCarry[s_8_4, And[a_c04, b_c04], c_7_4] and

   s_8_6 in AdderSum  [s_8_5, And[a_c03, b_c05], c_7_5] and
   c_8_6 in AdderCarry[s_8_5, And[a_c03, b_c05], c_7_5] and

   s_8_7 in AdderSum  [s_8_6, And[a_c02, b_c06], c_7_6] and
   c_8_7 in AdderCarry[s_8_6, And[a_c02, b_c06], c_7_6] and

   s_8_8 in AdderSum  [s_8_7, And[a_c01, b_c07], c_7_7] and
   c_8_8 in AdderCarry[s_8_7, And[a_c01, b_c07], c_7_7] and

   s_8_9 in AdderSum  [s_8_8, And[a_c00, b_c08], c_7_8] and
   c_8_9 in AdderCarry[s_8_8, And[a_c00, b_c08], c_7_8] and

   s_9_0 in AdderSum  [And[a_c09,b.b31], And[a.b31, b_c09], false] and
   c_9_0 in AdderCarry[And[a_c09,b.b31], And[a.b31, b_c09], false] and

   s_9_1 in AdderSum  [s_9_0, And[a_c09, b_c00], c_8_0] and
   c_9_1 in AdderCarry[s_9_0, And[a_c09, b_c00], c_8_0] and

   s_9_2 in AdderSum  [s_9_1, And[a_c08, b_c01], c_8_1] and
   c_9_2 in AdderCarry[s_9_1, And[a_c08, b_c01], c_8_1] and

   s_9_3 in AdderSum  [s_9_2, And[a_c07, b_c02], c_8_2] and
   c_9_3 in AdderCarry[s_9_2, And[a_c07, b_c02], c_8_2] and

   s_9_4 in AdderSum  [s_9_3, And[a_c06, b_c03], c_8_3] and
   c_9_4 in AdderCarry[s_9_3, And[a_c06, b_c03], c_8_3] and

   s_9_5 in AdderSum  [s_9_4, And[a_c05, b_c04], c_8_4] and
   c_9_5 in AdderCarry[s_9_4, And[a_c05, b_c04], c_8_4] and

   s_9_6 in AdderSum  [s_9_5, And[a_c04, b_c05], c_8_5] and
   c_9_6 in AdderCarry[s_9_5, And[a_c04, b_c05], c_8_5] and

   s_9_7 in AdderSum  [s_9_6, And[a_c03, b_c06], c_8_6] and
   c_9_7 in AdderCarry[s_9_6, And[a_c03, b_c06], c_8_6] and

   s_9_8 in AdderSum  [s_9_7, And[a_c02, b_c07], c_8_7] and
   c_9_8 in AdderCarry[s_9_7, And[a_c02, b_c07], c_8_7] and

   s_9_9 in AdderSum  [s_9_8, And[a_c01, b_c08], c_8_8] and
   c_9_9 in AdderCarry[s_9_8, And[a_c01, b_c08], c_8_8] and

   s_9_10 in AdderSum  [s_9_9, And[a_c00, b_c09], c_8_9] and
   c_9_10 in AdderCarry[s_9_9, And[a_c00, b_c09], c_8_9] and

   s_10_0 in AdderSum  [And[a_c10,b.b31], And[a.b31, b_c10], false] and
   c_10_0 in AdderCarry[And[a_c10,b.b31], And[a.b31, b_c10], false] and

   s_10_1 in AdderSum  [s_10_0, And[a_c10, b_c00], c_9_0] and
   c_10_1 in AdderCarry[s_10_0, And[a_c10, b_c00], c_9_0] and

   s_10_2 in AdderSum  [s_10_1, And[a_c09, b_c01], c_9_1] and
   c_10_2 in AdderCarry[s_10_1, And[a_c09, b_c01], c_9_1] and

   s_10_3 in AdderSum  [s_10_2, And[a_c08, b_c02], c_9_2] and
   c_10_3 in AdderCarry[s_10_2, And[a_c08, b_c02], c_9_2] and

   s_10_4 in AdderSum  [s_10_3, And[a_c07, b_c03], c_9_3] and
   c_10_4 in AdderCarry[s_10_3, And[a_c07, b_c03], c_9_3] and

   s_10_5 in AdderSum  [s_10_4, And[a_c06, b_c04], c_9_4] and
   c_10_5 in AdderCarry[s_10_4, And[a_c06, b_c04], c_9_4] and

   s_10_6 in AdderSum  [s_10_5, And[a_c05, b_c05], c_9_5] and
   c_10_6 in AdderCarry[s_10_5, And[a_c05, b_c05], c_9_5] and

   s_10_7 in AdderSum  [s_10_6, And[a_c04, b_c06], c_9_6] and
   c_10_7 in AdderCarry[s_10_6, And[a_c04, b_c06], c_9_6] and

   s_10_8 in AdderSum  [s_10_7, And[a_c03, b_c07], c_9_7] and
   c_10_8 in AdderCarry[s_10_7, And[a_c03, b_c07], c_9_7] and

   s_10_9 in AdderSum  [s_10_8, And[a_c02, b_c08], c_9_8] and
   c_10_9 in AdderCarry[s_10_8, And[a_c02, b_c08], c_9_8] and

   s_10_10 in AdderSum  [s_10_9, And[a_c01, b_c09], c_9_9] and
   c_10_10 in AdderCarry[s_10_9, And[a_c01, b_c09], c_9_9] and

   s_10_11 in AdderSum  [s_10_10, And[a_c00, b_c10], c_9_10] and
   c_10_11 in AdderCarry[s_10_10, And[a_c00, b_c10], c_9_10] and

   s_11_0 in AdderSum  [And[a_c11,b.b31], And[a.b31, b_c11], false] and
   c_11_0 in AdderCarry[And[a_c11,b.b31], And[a.b31, b_c11], false] and

   s_11_1 in AdderSum  [s_11_0, And[a_c11, b_c00], c_10_0] and
   c_11_1 in AdderCarry[s_11_0, And[a_c11, b_c00], c_10_0] and

   s_11_2 in AdderSum  [s_11_1, And[a_c10, b_c01], c_10_1] and
   c_11_2 in AdderCarry[s_11_1, And[a_c10, b_c01], c_10_1] and

   s_11_3 in AdderSum  [s_11_2, And[a_c09, b_c02], c_10_2] and
   c_11_3 in AdderCarry[s_11_2, And[a_c09, b_c02], c_10_2] and

   s_11_4 in AdderSum  [s_11_3, And[a_c08, b_c03], c_10_3] and
   c_11_4 in AdderCarry[s_11_3, And[a_c08, b_c03], c_10_3] and

   s_11_5 in AdderSum  [s_11_4, And[a_c07, b_c04], c_10_4] and
   c_11_5 in AdderCarry[s_11_4, And[a_c07, b_c04], c_10_4] and

   s_11_6 in AdderSum  [s_11_5, And[a_c06, b_c05], c_10_5] and
   c_11_6 in AdderCarry[s_11_5, And[a_c06, b_c05], c_10_5] and

   s_11_7 in AdderSum  [s_11_6, And[a_c05, b_c06], c_10_6] and
   c_11_7 in AdderCarry[s_11_6, And[a_c05, b_c06], c_10_6] and

   s_11_8 in AdderSum  [s_11_7, And[a_c04, b_c07], c_10_7] and
   c_11_8 in AdderCarry[s_11_7, And[a_c04, b_c07], c_10_7] and

   s_11_9 in AdderSum  [s_11_8, And[a_c03, b_c08], c_10_8] and
   c_11_9 in AdderCarry[s_11_8, And[a_c03, b_c08], c_10_8] and

   s_11_10 in AdderSum  [s_11_9, And[a_c02, b_c09], c_10_9] and
   c_11_10 in AdderCarry[s_11_9, And[a_c02, b_c09], c_10_9] and

   s_11_11 in AdderSum  [s_11_10, And[a_c01, b_c10], c_10_10] and
   c_11_11 in AdderCarry[s_11_10, And[a_c01, b_c10], c_10_10] and

   s_11_12 in AdderSum  [s_11_11, And[a_c00, b_c11], c_10_11] and
   c_11_12 in AdderCarry[s_11_11, And[a_c00, b_c11], c_10_11] and

   s_12_0 in AdderSum  [And[a_c12,b.b31], And[a.b31, b_c12], false] and
   c_12_0 in AdderCarry[And[a_c12,b.b31], And[a.b31, b_c12], false] and

   s_12_1 in AdderSum  [s_12_0, And[a_c12, b_c00], c_11_0] and
   c_12_1 in AdderCarry[s_12_0, And[a_c12, b_c00], c_11_0] and

   s_12_2 in AdderSum  [s_12_1, And[a_c11, b_c01], c_11_1] and
   c_12_2 in AdderCarry[s_12_1, And[a_c11, b_c01], c_11_1] and

   s_12_3 in AdderSum  [s_12_2, And[a_c10, b_c02], c_11_2] and
   c_12_3 in AdderCarry[s_12_2, And[a_c10, b_c02], c_11_2] and

   s_12_4 in AdderSum  [s_12_3, And[a_c09, b_c03], c_11_3] and
   c_12_4 in AdderCarry[s_12_3, And[a_c09, b_c03], c_11_3] and

   s_12_5 in AdderSum  [s_12_4, And[a_c08, b_c04], c_11_4] and
   c_12_5 in AdderCarry[s_12_4, And[a_c08, b_c04], c_11_4] and

   s_12_6 in AdderSum  [s_12_5, And[a_c07, b_c05], c_11_5] and
   c_12_6 in AdderCarry[s_12_5, And[a_c07, b_c05], c_11_5] and

   s_12_7 in AdderSum  [s_12_6, And[a_c06, b_c06], c_11_6] and
   c_12_7 in AdderCarry[s_12_6, And[a_c06, b_c06], c_11_6] and

   s_12_8 in AdderSum  [s_12_7, And[a_c05, b_c07], c_11_7] and
   c_12_8 in AdderCarry[s_12_7, And[a_c05, b_c07], c_11_7] and

   s_12_9 in AdderSum  [s_12_8, And[a_c04, b_c08], c_11_8] and
   c_12_9 in AdderCarry[s_12_8, And[a_c04, b_c08], c_11_8] and

   s_12_10 in AdderSum  [s_12_9, And[a_c03, b_c09], c_11_9] and
   c_12_10 in AdderCarry[s_12_9, And[a_c03, b_c09], c_11_9] and

   s_12_11 in AdderSum  [s_12_10, And[a_c02, b_c10], c_11_10] and
   c_12_11 in AdderCarry[s_12_10, And[a_c02, b_c10], c_11_10] and

   s_12_12 in AdderSum  [s_12_11, And[a_c01, b_c11], c_11_11] and
   c_12_12 in AdderCarry[s_12_11, And[a_c01, b_c11], c_11_11] and

   s_12_13 in AdderSum  [s_12_12, And[a_c00, b_c12], c_11_12] and
   c_12_13 in AdderCarry[s_12_12, And[a_c00, b_c12], c_11_12] and

   s_13_0 in AdderSum  [And[a_c13,b.b31], And[a.b31, b_c13], false] and
   c_13_0 in AdderCarry[And[a_c13,b.b31], And[a.b31, b_c13], false] and

   s_13_1 in AdderSum  [s_13_0, And[a_c13, b_c00], c_12_0] and
   c_13_1 in AdderCarry[s_13_0, And[a_c13, b_c00], c_12_0] and

   s_13_2 in AdderSum  [s_13_1, And[a_c12, b_c01], c_12_1] and
   c_13_2 in AdderCarry[s_13_1, And[a_c12, b_c01], c_12_1] and

   s_13_3 in AdderSum  [s_13_2, And[a_c11, b_c02], c_12_2] and
   c_13_3 in AdderCarry[s_13_2, And[a_c11, b_c02], c_12_2] and

   s_13_4 in AdderSum  [s_13_3, And[a_c10, b_c03], c_12_3] and
   c_13_4 in AdderCarry[s_13_3, And[a_c10, b_c03], c_12_3] and

   s_13_5 in AdderSum  [s_13_4, And[a_c09, b_c04], c_12_4] and
   c_13_5 in AdderCarry[s_13_4, And[a_c09, b_c04], c_12_4] and

   s_13_6 in AdderSum  [s_13_5, And[a_c08, b_c05], c_12_5] and
   c_13_6 in AdderCarry[s_13_5, And[a_c08, b_c05], c_12_5] and

   s_13_7 in AdderSum  [s_13_6, And[a_c07, b_c06], c_12_6] and
   c_13_7 in AdderCarry[s_13_6, And[a_c07, b_c06], c_12_6] and

   s_13_8 in AdderSum  [s_13_7, And[a_c06, b_c07], c_12_7] and
   c_13_8 in AdderCarry[s_13_7, And[a_c06, b_c07], c_12_7] and

   s_13_9 in AdderSum  [s_13_8, And[a_c05, b_c08], c_12_8] and
   c_13_9 in AdderCarry[s_13_8, And[a_c05, b_c08], c_12_8] and

   s_13_10 in AdderSum  [s_13_9, And[a_c04, b_c09], c_12_9] and
   c_13_10 in AdderCarry[s_13_9, And[a_c04, b_c09], c_12_9] and

   s_13_11 in AdderSum  [s_13_10, And[a_c03, b_c10], c_12_10] and
   c_13_11 in AdderCarry[s_13_10, And[a_c03, b_c10], c_12_10] and

   s_13_12 in AdderSum  [s_13_11, And[a_c02, b_c11], c_12_11] and
   c_13_12 in AdderCarry[s_13_11, And[a_c02, b_c11], c_12_11] and

   s_13_13 in AdderSum  [s_13_12, And[a_c01, b_c12], c_12_12] and
   c_13_13 in AdderCarry[s_13_12, And[a_c01, b_c12], c_12_12] and

   s_13_14 in AdderSum  [s_13_13, And[a_c00, b_c13], c_12_13] and
   c_13_14 in AdderCarry[s_13_13, And[a_c00, b_c13], c_12_13] and

   s_14_0 in AdderSum  [And[a_c14,b.b31], And[a.b31, b_c14], false] and
   c_14_0 in AdderCarry[And[a_c14,b.b31], And[a.b31, b_c14], false] and

   s_14_1 in AdderSum  [s_14_0, And[a_c14, b_c00], c_13_0] and
   c_14_1 in AdderCarry[s_14_0, And[a_c14, b_c00], c_13_0] and

   s_14_2 in AdderSum  [s_14_1, And[a_c13, b_c01], c_13_1] and
   c_14_2 in AdderCarry[s_14_1, And[a_c13, b_c01], c_13_1] and

   s_14_3 in AdderSum  [s_14_2, And[a_c12, b_c02], c_13_2] and
   c_14_3 in AdderCarry[s_14_2, And[a_c12, b_c02], c_13_2] and

   s_14_4 in AdderSum  [s_14_3, And[a_c11, b_c03], c_13_3] and
   c_14_4 in AdderCarry[s_14_3, And[a_c11, b_c03], c_13_3] and

   s_14_5 in AdderSum  [s_14_4, And[a_c10, b_c04], c_13_4] and
   c_14_5 in AdderCarry[s_14_4, And[a_c10, b_c04], c_13_4] and

   s_14_6 in AdderSum  [s_14_5, And[a_c09, b_c05], c_13_5] and
   c_14_6 in AdderCarry[s_14_5, And[a_c09, b_c05], c_13_5] and

   s_14_7 in AdderSum  [s_14_6, And[a_c08, b_c06], c_13_6] and
   c_14_7 in AdderCarry[s_14_6, And[a_c08, b_c06], c_13_6] and

   s_14_8 in AdderSum  [s_14_7, And[a_c07, b_c07], c_13_7] and
   c_14_8 in AdderCarry[s_14_7, And[a_c07, b_c07], c_13_7] and

   s_14_9 in AdderSum  [s_14_8, And[a_c06, b_c08], c_13_8] and
   c_14_9 in AdderCarry[s_14_8, And[a_c06, b_c08], c_13_8] and

   s_14_10 in AdderSum  [s_14_9, And[a_c05, b_c09], c_13_9] and
   c_14_10 in AdderCarry[s_14_9, And[a_c05, b_c09], c_13_9] and

   s_14_11 in AdderSum  [s_14_10, And[a_c04, b_c10], c_13_10] and
   c_14_11 in AdderCarry[s_14_10, And[a_c04, b_c10], c_13_10] and

   s_14_12 in AdderSum  [s_14_11, And[a_c03, b_c11], c_13_11] and
   c_14_12 in AdderCarry[s_14_11, And[a_c03, b_c11], c_13_11] and

   s_14_13 in AdderSum  [s_14_12, And[a_c02, b_c12], c_13_12] and
   c_14_13 in AdderCarry[s_14_12, And[a_c02, b_c12], c_13_12] and

   s_14_14 in AdderSum  [s_14_13, And[a_c01, b_c13], c_13_13] and
   c_14_14 in AdderCarry[s_14_13, And[a_c01, b_c13], c_13_13] and

   s_14_15 in AdderSum  [s_14_14, And[a_c00, b_c14], c_13_14] and
   c_14_15 in AdderCarry[s_14_14, And[a_c00, b_c14], c_13_14] and

   s_15_0 in AdderSum  [And[a_c15,b.b31], And[a.b31, b_c15], false] and
   c_15_0 in AdderCarry[And[a_c15,b.b31], And[a.b31, b_c15], false] and

   s_15_1 in AdderSum  [s_15_0, And[a_c15, b_c00], c_14_0] and
   c_15_1 in AdderCarry[s_15_0, And[a_c15, b_c00], c_14_0] and

   s_15_2 in AdderSum  [s_15_1, And[a_c14, b_c01], c_14_1] and
   c_15_2 in AdderCarry[s_15_1, And[a_c14, b_c01], c_14_1] and

   s_15_3 in AdderSum  [s_15_2, And[a_c13, b_c02], c_14_2] and
   c_15_3 in AdderCarry[s_15_2, And[a_c13, b_c02], c_14_2] and

   s_15_4 in AdderSum  [s_15_3, And[a_c12, b_c03], c_14_3] and
   c_15_4 in AdderCarry[s_15_3, And[a_c12, b_c03], c_14_3] and

   s_15_5 in AdderSum  [s_15_4, And[a_c11, b_c04], c_14_4] and
   c_15_5 in AdderCarry[s_15_4, And[a_c11, b_c04], c_14_4] and

   s_15_6 in AdderSum  [s_15_5, And[a_c10, b_c05], c_14_5] and
   c_15_6 in AdderCarry[s_15_5, And[a_c10, b_c05], c_14_5] and

   s_15_7 in AdderSum  [s_15_6, And[a_c09, b_c06], c_14_6] and
   c_15_7 in AdderCarry[s_15_6, And[a_c09, b_c06], c_14_6] and

   s_15_8 in AdderSum  [s_15_7, And[a_c08, b_c07], c_14_7] and
   c_15_8 in AdderCarry[s_15_7, And[a_c08, b_c07], c_14_7] and

   s_15_9 in AdderSum  [s_15_8, And[a_c07, b_c08], c_14_8] and
   c_15_9 in AdderCarry[s_15_8, And[a_c07, b_c08], c_14_8] and

   s_15_10 in AdderSum  [s_15_9, And[a_c06, b_c09], c_14_9] and
   c_15_10 in AdderCarry[s_15_9, And[a_c06, b_c09], c_14_9] and

   s_15_11 in AdderSum  [s_15_10, And[a_c05, b_c10], c_14_10] and
   c_15_11 in AdderCarry[s_15_10, And[a_c05, b_c10], c_14_10] and

   s_15_12 in AdderSum  [s_15_11, And[a_c04, b_c11], c_14_11] and
   c_15_12 in AdderCarry[s_15_11, And[a_c04, b_c11], c_14_11] and

   s_15_13 in AdderSum  [s_15_12, And[a_c03, b_c12], c_14_12] and
   c_15_13 in AdderCarry[s_15_12, And[a_c03, b_c12], c_14_12] and

   s_15_14 in AdderSum  [s_15_13, And[a_c02, b_c13], c_14_13] and
   c_15_14 in AdderCarry[s_15_13, And[a_c02, b_c13], c_14_13] and

   s_15_15 in AdderSum  [s_15_14, And[a_c01, b_c14], c_14_14] and
   c_15_15 in AdderCarry[s_15_14, And[a_c01, b_c14], c_14_14] and

   s_15_16 in AdderSum  [s_15_15, And[a_c00, b_c15], c_14_15] and
   c_15_16 in AdderCarry[s_15_15, And[a_c00, b_c15], c_14_15] and

   s_16_0 in AdderSum  [And[a_c16,b.b31], And[a.b31, b_c16], false] and
   c_16_0 in AdderCarry[And[a_c16,b.b31], And[a.b31, b_c16], false] and

   s_16_1 in AdderSum  [s_16_0, And[a_c16, b_c00], c_15_0] and
   c_16_1 in AdderCarry[s_16_0, And[a_c16, b_c00], c_15_0] and

   s_16_2 in AdderSum  [s_16_1, And[a_c15, b_c01], c_15_1] and
   c_16_2 in AdderCarry[s_16_1, And[a_c15, b_c01], c_15_1] and

   s_16_3 in AdderSum  [s_16_2, And[a_c14, b_c02], c_15_2] and
   c_16_3 in AdderCarry[s_16_2, And[a_c14, b_c02], c_15_2] and

   s_16_4 in AdderSum  [s_16_3, And[a_c13, b_c03], c_15_3] and
   c_16_4 in AdderCarry[s_16_3, And[a_c13, b_c03], c_15_3] and

   s_16_5 in AdderSum  [s_16_4, And[a_c12, b_c04], c_15_4] and
   c_16_5 in AdderCarry[s_16_4, And[a_c12, b_c04], c_15_4] and

   s_16_6 in AdderSum  [s_16_5, And[a_c11, b_c05], c_15_5] and
   c_16_6 in AdderCarry[s_16_5, And[a_c11, b_c05], c_15_5] and

   s_16_7 in AdderSum  [s_16_6, And[a_c10, b_c06], c_15_6] and
   c_16_7 in AdderCarry[s_16_6, And[a_c10, b_c06], c_15_6] and

   s_16_8 in AdderSum  [s_16_7, And[a_c09, b_c07], c_15_7] and
   c_16_8 in AdderCarry[s_16_7, And[a_c09, b_c07], c_15_7] and

   s_16_9 in AdderSum  [s_16_8, And[a_c08, b_c08], c_15_8] and
   c_16_9 in AdderCarry[s_16_8, And[a_c08, b_c08], c_15_8] and

   s_16_10 in AdderSum  [s_16_9, And[a_c07, b_c09], c_15_9] and
   c_16_10 in AdderCarry[s_16_9, And[a_c07, b_c09], c_15_9] and

   s_16_11 in AdderSum  [s_16_10, And[a_c06, b_c10], c_15_10] and
   c_16_11 in AdderCarry[s_16_10, And[a_c06, b_c10], c_15_10] and

   s_16_12 in AdderSum  [s_16_11, And[a_c05, b_c11], c_15_11] and
   c_16_12 in AdderCarry[s_16_11, And[a_c05, b_c11], c_15_11] and

   s_16_13 in AdderSum  [s_16_12, And[a_c04, b_c12], c_15_12] and
   c_16_13 in AdderCarry[s_16_12, And[a_c04, b_c12], c_15_12] and

   s_16_14 in AdderSum  [s_16_13, And[a_c03, b_c13], c_15_13] and
   c_16_14 in AdderCarry[s_16_13, And[a_c03, b_c13], c_15_13] and

   s_16_15 in AdderSum  [s_16_14, And[a_c02, b_c14], c_15_14] and
   c_16_15 in AdderCarry[s_16_14, And[a_c02, b_c14], c_15_14] and

   s_16_16 in AdderSum  [s_16_15, And[a_c01, b_c15], c_15_15] and
   c_16_16 in AdderCarry[s_16_15, And[a_c01, b_c15], c_15_15] and

   s_16_17 in AdderSum  [s_16_16, And[a_c00, b_c16], c_15_16] and
   c_16_17 in AdderCarry[s_16_16, And[a_c00, b_c16], c_15_16] and

   s_17_0 in AdderSum  [And[a_c17,b.b31], And[a.b31, b_c17], false] and
   c_17_0 in AdderCarry[And[a_c17,b.b31], And[a.b31, b_c17], false] and

   s_17_1 in AdderSum  [s_17_0, And[a_c17, b_c00], c_16_0] and
   c_17_1 in AdderCarry[s_17_0, And[a_c17, b_c00], c_16_0] and

   s_17_2 in AdderSum  [s_17_1, And[a_c16, b_c01], c_16_1] and
   c_17_2 in AdderCarry[s_17_1, And[a_c16, b_c01], c_16_1] and

   s_17_3 in AdderSum  [s_17_2, And[a_c15, b_c02], c_16_2] and
   c_17_3 in AdderCarry[s_17_2, And[a_c15, b_c02], c_16_2] and

   s_17_4 in AdderSum  [s_17_3, And[a_c14, b_c03], c_16_3] and
   c_17_4 in AdderCarry[s_17_3, And[a_c14, b_c03], c_16_3] and

   s_17_5 in AdderSum  [s_17_4, And[a_c13, b_c04], c_16_4] and
   c_17_5 in AdderCarry[s_17_4, And[a_c13, b_c04], c_16_4] and

   s_17_6 in AdderSum  [s_17_5, And[a_c12, b_c05], c_16_5] and
   c_17_6 in AdderCarry[s_17_5, And[a_c12, b_c05], c_16_5] and

   s_17_7 in AdderSum  [s_17_6, And[a_c11, b_c06], c_16_6] and
   c_17_7 in AdderCarry[s_17_6, And[a_c11, b_c06], c_16_6] and

   s_17_8 in AdderSum  [s_17_7, And[a_c10, b_c07], c_16_7] and
   c_17_8 in AdderCarry[s_17_7, And[a_c10, b_c07], c_16_7] and

   s_17_9 in AdderSum  [s_17_8, And[a_c09, b_c08], c_16_8] and
   c_17_9 in AdderCarry[s_17_8, And[a_c09, b_c08], c_16_8] and

   s_17_10 in AdderSum  [s_17_9, And[a_c08, b_c09], c_16_9] and
   c_17_10 in AdderCarry[s_17_9, And[a_c08, b_c09], c_16_9] and

   s_17_11 in AdderSum  [s_17_10, And[a_c07, b_c10], c_16_10] and
   c_17_11 in AdderCarry[s_17_10, And[a_c07, b_c10], c_16_10] and

   s_17_12 in AdderSum  [s_17_11, And[a_c06, b_c11], c_16_11] and
   c_17_12 in AdderCarry[s_17_11, And[a_c06, b_c11], c_16_11] and

   s_17_13 in AdderSum  [s_17_12, And[a_c05, b_c12], c_16_12] and
   c_17_13 in AdderCarry[s_17_12, And[a_c05, b_c12], c_16_12] and

   s_17_14 in AdderSum  [s_17_13, And[a_c04, b_c13], c_16_13] and
   c_17_14 in AdderCarry[s_17_13, And[a_c04, b_c13], c_16_13] and

   s_17_15 in AdderSum  [s_17_14, And[a_c03, b_c14], c_16_14] and
   c_17_15 in AdderCarry[s_17_14, And[a_c03, b_c14], c_16_14] and

   s_17_16 in AdderSum  [s_17_15, And[a_c02, b_c15], c_16_15] and
   c_17_16 in AdderCarry[s_17_15, And[a_c02, b_c15], c_16_15] and

   s_17_17 in AdderSum  [s_17_16, And[a_c01, b_c16], c_16_16] and
   c_17_17 in AdderCarry[s_17_16, And[a_c01, b_c16], c_16_16] and

   s_17_18 in AdderSum  [s_17_17, And[a_c00, b_c17], c_16_17] and
   c_17_18 in AdderCarry[s_17_17, And[a_c00, b_c17], c_16_17] and

   s_18_0 in AdderSum  [And[a_c18,b.b31], And[a.b31, b_c18], false] and
   c_18_0 in AdderCarry[And[a_c18,b.b31], And[a.b31, b_c18], false] and

   s_18_1 in AdderSum  [s_18_0, And[a_c18, b_c00], c_17_0] and
   c_18_1 in AdderCarry[s_18_0, And[a_c18, b_c00], c_17_0] and

   s_18_2 in AdderSum  [s_18_1, And[a_c17, b_c01], c_17_1] and
   c_18_2 in AdderCarry[s_18_1, And[a_c17, b_c01], c_17_1] and

   s_18_3 in AdderSum  [s_18_2, And[a_c16, b_c02], c_17_2] and
   c_18_3 in AdderCarry[s_18_2, And[a_c16, b_c02], c_17_2] and

   s_18_4 in AdderSum  [s_18_3, And[a_c15, b_c03], c_17_3] and
   c_18_4 in AdderCarry[s_18_3, And[a_c15, b_c03], c_17_3] and

   s_18_5 in AdderSum  [s_18_4, And[a_c14, b_c04], c_17_4] and
   c_18_5 in AdderCarry[s_18_4, And[a_c14, b_c04], c_17_4] and

   s_18_6 in AdderSum  [s_18_5, And[a_c13, b_c05], c_17_5] and
   c_18_6 in AdderCarry[s_18_5, And[a_c13, b_c05], c_17_5] and

   s_18_7 in AdderSum  [s_18_6, And[a_c12, b_c06], c_17_6] and
   c_18_7 in AdderCarry[s_18_6, And[a_c12, b_c06], c_17_6] and

   s_18_8 in AdderSum  [s_18_7, And[a_c11, b_c07], c_17_7] and
   c_18_8 in AdderCarry[s_18_7, And[a_c11, b_c07], c_17_7] and

   s_18_9 in AdderSum  [s_18_8, And[a_c10, b_c08], c_17_8] and
   c_18_9 in AdderCarry[s_18_8, And[a_c10, b_c08], c_17_8] and

   s_18_10 in AdderSum  [s_18_9, And[a_c09, b_c09], c_17_9] and
   c_18_10 in AdderCarry[s_18_9, And[a_c09, b_c09], c_17_9] and

   s_18_11 in AdderSum  [s_18_10, And[a_c08, b_c10], c_17_10] and
   c_18_11 in AdderCarry[s_18_10, And[a_c08, b_c10], c_17_10] and

   s_18_12 in AdderSum  [s_18_11, And[a_c07, b_c11], c_17_11] and
   c_18_12 in AdderCarry[s_18_11, And[a_c07, b_c11], c_17_11] and

   s_18_13 in AdderSum  [s_18_12, And[a_c06, b_c12], c_17_12] and
   c_18_13 in AdderCarry[s_18_12, And[a_c06, b_c12], c_17_12] and

   s_18_14 in AdderSum  [s_18_13, And[a_c05, b_c13], c_17_13] and
   c_18_14 in AdderCarry[s_18_13, And[a_c05, b_c13], c_17_13] and

   s_18_15 in AdderSum  [s_18_14, And[a_c04, b_c14], c_17_14] and
   c_18_15 in AdderCarry[s_18_14, And[a_c04, b_c14], c_17_14] and

   s_18_16 in AdderSum  [s_18_15, And[a_c03, b_c15], c_17_15] and
   c_18_16 in AdderCarry[s_18_15, And[a_c03, b_c15], c_17_15] and

   s_18_17 in AdderSum  [s_18_16, And[a_c02, b_c16], c_17_16] and
   c_18_17 in AdderCarry[s_18_16, And[a_c02, b_c16], c_17_16] and

   s_18_18 in AdderSum  [s_18_17, And[a_c01, b_c17], c_17_17] and
   c_18_18 in AdderCarry[s_18_17, And[a_c01, b_c17], c_17_17] and

   s_18_19 in AdderSum  [s_18_18, And[a_c00, b_c18], c_17_18] and
   c_18_19 in AdderCarry[s_18_18, And[a_c00, b_c18], c_17_18] and

   s_19_0 in AdderSum  [And[a_c19,b.b31], And[a.b31, b_c19], false] and
   c_19_0 in AdderCarry[And[a_c19,b.b31], And[a.b31, b_c19], false] and

   s_19_1 in AdderSum  [s_19_0, And[a_c19, b_c00], c_18_0] and
   c_19_1 in AdderCarry[s_19_0, And[a_c19, b_c00], c_18_0] and

   s_19_2 in AdderSum  [s_19_1, And[a_c18, b_c01], c_18_1] and
   c_19_2 in AdderCarry[s_19_1, And[a_c18, b_c01], c_18_1] and

   s_19_3 in AdderSum  [s_19_2, And[a_c17, b_c02], c_18_2] and
   c_19_3 in AdderCarry[s_19_2, And[a_c17, b_c02], c_18_2] and

   s_19_4 in AdderSum  [s_19_3, And[a_c16, b_c03], c_18_3] and
   c_19_4 in AdderCarry[s_19_3, And[a_c16, b_c03], c_18_3] and

   s_19_5 in AdderSum  [s_19_4, And[a_c15, b_c04], c_18_4] and
   c_19_5 in AdderCarry[s_19_4, And[a_c15, b_c04], c_18_4] and

   s_19_6 in AdderSum  [s_19_5, And[a_c14, b_c05], c_18_5] and
   c_19_6 in AdderCarry[s_19_5, And[a_c14, b_c05], c_18_5] and

   s_19_7 in AdderSum  [s_19_6, And[a_c13, b_c06], c_18_6] and
   c_19_7 in AdderCarry[s_19_6, And[a_c13, b_c06], c_18_6] and

   s_19_8 in AdderSum  [s_19_7, And[a_c12, b_c07], c_18_7] and
   c_19_8 in AdderCarry[s_19_7, And[a_c12, b_c07], c_18_7] and

   s_19_9 in AdderSum  [s_19_8, And[a_c11, b_c08], c_18_8] and
   c_19_9 in AdderCarry[s_19_8, And[a_c11, b_c08], c_18_8] and

   s_19_10 in AdderSum  [s_19_9, And[a_c10, b_c09], c_18_9] and
   c_19_10 in AdderCarry[s_19_9, And[a_c10, b_c09], c_18_9] and

   s_19_11 in AdderSum  [s_19_10, And[a_c09, b_c10], c_18_10] and
   c_19_11 in AdderCarry[s_19_10, And[a_c09, b_c10], c_18_10] and

   s_19_12 in AdderSum  [s_19_11, And[a_c08, b_c11], c_18_11] and
   c_19_12 in AdderCarry[s_19_11, And[a_c08, b_c11], c_18_11] and

   s_19_13 in AdderSum  [s_19_12, And[a_c07, b_c12], c_18_12] and
   c_19_13 in AdderCarry[s_19_12, And[a_c07, b_c12], c_18_12] and

   s_19_14 in AdderSum  [s_19_13, And[a_c06, b_c13], c_18_13] and
   c_19_14 in AdderCarry[s_19_13, And[a_c06, b_c13], c_18_13] and

   s_19_15 in AdderSum  [s_19_14, And[a_c05, b_c14], c_18_14] and
   c_19_15 in AdderCarry[s_19_14, And[a_c05, b_c14], c_18_14] and

   s_19_16 in AdderSum  [s_19_15, And[a_c04, b_c15], c_18_15] and
   c_19_16 in AdderCarry[s_19_15, And[a_c04, b_c15], c_18_15] and

   s_19_17 in AdderSum  [s_19_16, And[a_c03, b_c16], c_18_16] and
   c_19_17 in AdderCarry[s_19_16, And[a_c03, b_c16], c_18_16] and

   s_19_18 in AdderSum  [s_19_17, And[a_c02, b_c17], c_18_17] and
   c_19_18 in AdderCarry[s_19_17, And[a_c02, b_c17], c_18_17] and

   s_19_19 in AdderSum  [s_19_18, And[a_c01, b_c18], c_18_18] and
   c_19_19 in AdderCarry[s_19_18, And[a_c01, b_c18], c_18_18] and

   s_19_20 in AdderSum  [s_19_19, And[a_c00, b_c19], c_18_19] and
   c_19_20 in AdderCarry[s_19_19, And[a_c00, b_c19], c_18_19] and

   s_20_0 in AdderSum  [And[a_c20,b.b31], And[a.b31, b_c20], false] and
   c_20_0 in AdderCarry[And[a_c20,b.b31], And[a.b31, b_c20], false] and

   s_20_1 in AdderSum  [s_20_0, And[a_c20, b_c00], c_19_0] and
   c_20_1 in AdderCarry[s_20_0, And[a_c20, b_c00], c_19_0] and

   s_20_2 in AdderSum  [s_20_1, And[a_c19, b_c01], c_19_1] and
   c_20_2 in AdderCarry[s_20_1, And[a_c19, b_c01], c_19_1] and

   s_20_3 in AdderSum  [s_20_2, And[a_c18, b_c02], c_19_2] and
   c_20_3 in AdderCarry[s_20_2, And[a_c18, b_c02], c_19_2] and

   s_20_4 in AdderSum  [s_20_3, And[a_c17, b_c03], c_19_3] and
   c_20_4 in AdderCarry[s_20_3, And[a_c17, b_c03], c_19_3] and

   s_20_5 in AdderSum  [s_20_4, And[a_c16, b_c04], c_19_4] and
   c_20_5 in AdderCarry[s_20_4, And[a_c16, b_c04], c_19_4] and

   s_20_6 in AdderSum  [s_20_5, And[a_c15, b_c05], c_19_5] and
   c_20_6 in AdderCarry[s_20_5, And[a_c15, b_c05], c_19_5] and

   s_20_7 in AdderSum  [s_20_6, And[a_c14, b_c06], c_19_6] and
   c_20_7 in AdderCarry[s_20_6, And[a_c14, b_c06], c_19_6] and

   s_20_8 in AdderSum  [s_20_7, And[a_c13, b_c07], c_19_7] and
   c_20_8 in AdderCarry[s_20_7, And[a_c13, b_c07], c_19_7] and

   s_20_9 in AdderSum  [s_20_8, And[a_c12, b_c08], c_19_8] and
   c_20_9 in AdderCarry[s_20_8, And[a_c12, b_c08], c_19_8] and

   s_20_10 in AdderSum  [s_20_9, And[a_c11, b_c09], c_19_9] and
   c_20_10 in AdderCarry[s_20_9, And[a_c11, b_c09], c_19_9] and

   s_20_11 in AdderSum  [s_20_10, And[a_c10, b_c10], c_19_10] and
   c_20_11 in AdderCarry[s_20_10, And[a_c10, b_c10], c_19_10] and

   s_20_12 in AdderSum  [s_20_11, And[a_c09, b_c11], c_19_11] and
   c_20_12 in AdderCarry[s_20_11, And[a_c09, b_c11], c_19_11] and

   s_20_13 in AdderSum  [s_20_12, And[a_c08, b_c12], c_19_12] and
   c_20_13 in AdderCarry[s_20_12, And[a_c08, b_c12], c_19_12] and

   s_20_14 in AdderSum  [s_20_13, And[a_c07, b_c13], c_19_13] and
   c_20_14 in AdderCarry[s_20_13, And[a_c07, b_c13], c_19_13] and

   s_20_15 in AdderSum  [s_20_14, And[a_c06, b_c14], c_19_14] and
   c_20_15 in AdderCarry[s_20_14, And[a_c06, b_c14], c_19_14] and

   s_20_16 in AdderSum  [s_20_15, And[a_c05, b_c15], c_19_15] and
   c_20_16 in AdderCarry[s_20_15, And[a_c05, b_c15], c_19_15] and

   s_20_17 in AdderSum  [s_20_16, And[a_c04, b_c16], c_19_16] and
   c_20_17 in AdderCarry[s_20_16, And[a_c04, b_c16], c_19_16] and

   s_20_18 in AdderSum  [s_20_17, And[a_c03, b_c17], c_19_17] and
   c_20_18 in AdderCarry[s_20_17, And[a_c03, b_c17], c_19_17] and

   s_20_19 in AdderSum  [s_20_18, And[a_c02, b_c18], c_19_18] and
   c_20_19 in AdderCarry[s_20_18, And[a_c02, b_c18], c_19_18] and

   s_20_20 in AdderSum  [s_20_19, And[a_c01, b_c19], c_19_19] and
   c_20_20 in AdderCarry[s_20_19, And[a_c01, b_c19], c_19_19] and

   s_20_21 in AdderSum  [s_20_20, And[a_c00, b_c20], c_19_20] and
   c_20_21 in AdderCarry[s_20_20, And[a_c00, b_c20], c_19_20] and

   s_21_0 in AdderSum  [And[a_c21,b.b31], And[a.b31, b_c21], false] and
   c_21_0 in AdderCarry[And[a_c21,b.b31], And[a.b31, b_c21], false] and

   s_21_1 in AdderSum  [s_21_0, And[a_c21, b_c00], c_20_0] and
   c_21_1 in AdderCarry[s_21_0, And[a_c21, b_c00], c_20_0] and

   s_21_2 in AdderSum  [s_21_1, And[a_c20, b_c01], c_20_1] and
   c_21_2 in AdderCarry[s_21_1, And[a_c20, b_c01], c_20_1] and

   s_21_3 in AdderSum  [s_21_2, And[a_c19, b_c02], c_20_2] and
   c_21_3 in AdderCarry[s_21_2, And[a_c19, b_c02], c_20_2] and

   s_21_4 in AdderSum  [s_21_3, And[a_c18, b_c03], c_20_3] and
   c_21_4 in AdderCarry[s_21_3, And[a_c18, b_c03], c_20_3] and

   s_21_5 in AdderSum  [s_21_4, And[a_c17, b_c04], c_20_4] and
   c_21_5 in AdderCarry[s_21_4, And[a_c17, b_c04], c_20_4] and

   s_21_6 in AdderSum  [s_21_5, And[a_c16, b_c05], c_20_5] and
   c_21_6 in AdderCarry[s_21_5, And[a_c16, b_c05], c_20_5] and

   s_21_7 in AdderSum  [s_21_6, And[a_c15, b_c06], c_20_6] and
   c_21_7 in AdderCarry[s_21_6, And[a_c15, b_c06], c_20_6] and

   s_21_8 in AdderSum  [s_21_7, And[a_c14, b_c07], c_20_7] and
   c_21_8 in AdderCarry[s_21_7, And[a_c14, b_c07], c_20_7] and

   s_21_9 in AdderSum  [s_21_8, And[a_c13, b_c08], c_20_8] and
   c_21_9 in AdderCarry[s_21_8, And[a_c13, b_c08], c_20_8] and

   s_21_10 in AdderSum  [s_21_9, And[a_c12, b_c09], c_20_9] and
   c_21_10 in AdderCarry[s_21_9, And[a_c12, b_c09], c_20_9] and

   s_21_11 in AdderSum  [s_21_10, And[a_c11, b_c10], c_20_10] and
   c_21_11 in AdderCarry[s_21_10, And[a_c11, b_c10], c_20_10] and

   s_21_12 in AdderSum  [s_21_11, And[a_c10, b_c11], c_20_11] and
   c_21_12 in AdderCarry[s_21_11, And[a_c10, b_c11], c_20_11] and

   s_21_13 in AdderSum  [s_21_12, And[a_c09, b_c12], c_20_12] and
   c_21_13 in AdderCarry[s_21_12, And[a_c09, b_c12], c_20_12] and

   s_21_14 in AdderSum  [s_21_13, And[a_c08, b_c13], c_20_13] and
   c_21_14 in AdderCarry[s_21_13, And[a_c08, b_c13], c_20_13] and

   s_21_15 in AdderSum  [s_21_14, And[a_c07, b_c14], c_20_14] and
   c_21_15 in AdderCarry[s_21_14, And[a_c07, b_c14], c_20_14] and

   s_21_16 in AdderSum  [s_21_15, And[a_c06, b_c15], c_20_15] and
   c_21_16 in AdderCarry[s_21_15, And[a_c06, b_c15], c_20_15] and

   s_21_17 in AdderSum  [s_21_16, And[a_c05, b_c16], c_20_16] and
   c_21_17 in AdderCarry[s_21_16, And[a_c05, b_c16], c_20_16] and

   s_21_18 in AdderSum  [s_21_17, And[a_c04, b_c17], c_20_17] and
   c_21_18 in AdderCarry[s_21_17, And[a_c04, b_c17], c_20_17] and

   s_21_19 in AdderSum  [s_21_18, And[a_c03, b_c18], c_20_18] and
   c_21_19 in AdderCarry[s_21_18, And[a_c03, b_c18], c_20_18] and

   s_21_20 in AdderSum  [s_21_19, And[a_c02, b_c19], c_20_19] and
   c_21_20 in AdderCarry[s_21_19, And[a_c02, b_c19], c_20_19] and

   s_21_21 in AdderSum  [s_21_20, And[a_c01, b_c20], c_20_20] and
   c_21_21 in AdderCarry[s_21_20, And[a_c01, b_c20], c_20_20] and

   s_21_22 in AdderSum  [s_21_21, And[a_c00, b_c21], c_20_21] and
   c_21_22 in AdderCarry[s_21_21, And[a_c00, b_c21], c_20_21] and

   s_22_0 in AdderSum  [And[a_c22,b.b31], And[a.b31, b_c22], false] and
   c_22_0 in AdderCarry[And[a_c22,b.b31], And[a.b31, b_c22], false] and

   s_22_1 in AdderSum  [s_22_0, And[a_c22, b_c00], c_21_0] and
   c_22_1 in AdderCarry[s_22_0, And[a_c22, b_c00], c_21_0] and

   s_22_2 in AdderSum  [s_22_1, And[a_c21, b_c01], c_21_1] and
   c_22_2 in AdderCarry[s_22_1, And[a_c21, b_c01], c_21_1] and

   s_22_3 in AdderSum  [s_22_2, And[a_c20, b_c02], c_21_2] and
   c_22_3 in AdderCarry[s_22_2, And[a_c20, b_c02], c_21_2] and

   s_22_4 in AdderSum  [s_22_3, And[a_c19, b_c03], c_21_3] and
   c_22_4 in AdderCarry[s_22_3, And[a_c19, b_c03], c_21_3] and

   s_22_5 in AdderSum  [s_22_4, And[a_c18, b_c04], c_21_4] and
   c_22_5 in AdderCarry[s_22_4, And[a_c18, b_c04], c_21_4] and

   s_22_6 in AdderSum  [s_22_5, And[a_c17, b_c05], c_21_5] and
   c_22_6 in AdderCarry[s_22_5, And[a_c17, b_c05], c_21_5] and

   s_22_7 in AdderSum  [s_22_6, And[a_c16, b_c06], c_21_6] and
   c_22_7 in AdderCarry[s_22_6, And[a_c16, b_c06], c_21_6] and

   s_22_8 in AdderSum  [s_22_7, And[a_c15, b_c07], c_21_7] and
   c_22_8 in AdderCarry[s_22_7, And[a_c15, b_c07], c_21_7] and

   s_22_9 in AdderSum  [s_22_8, And[a_c14, b_c08], c_21_8] and
   c_22_9 in AdderCarry[s_22_8, And[a_c14, b_c08], c_21_8] and

   s_22_10 in AdderSum  [s_22_9, And[a_c13, b_c09], c_21_9] and
   c_22_10 in AdderCarry[s_22_9, And[a_c13, b_c09], c_21_9] and

   s_22_11 in AdderSum  [s_22_10, And[a_c12, b_c10], c_21_10] and
   c_22_11 in AdderCarry[s_22_10, And[a_c12, b_c10], c_21_10] and

   s_22_12 in AdderSum  [s_22_11, And[a_c11, b_c11], c_21_11] and
   c_22_12 in AdderCarry[s_22_11, And[a_c11, b_c11], c_21_11] and

   s_22_13 in AdderSum  [s_22_12, And[a_c10, b_c12], c_21_12] and
   c_22_13 in AdderCarry[s_22_12, And[a_c10, b_c12], c_21_12] and

   s_22_14 in AdderSum  [s_22_13, And[a_c09, b_c13], c_21_13] and
   c_22_14 in AdderCarry[s_22_13, And[a_c09, b_c13], c_21_13] and

   s_22_15 in AdderSum  [s_22_14, And[a_c08, b_c14], c_21_14] and
   c_22_15 in AdderCarry[s_22_14, And[a_c08, b_c14], c_21_14] and

   s_22_16 in AdderSum  [s_22_15, And[a_c07, b_c15], c_21_15] and
   c_22_16 in AdderCarry[s_22_15, And[a_c07, b_c15], c_21_15] and

   s_22_17 in AdderSum  [s_22_16, And[a_c06, b_c16], c_21_16] and
   c_22_17 in AdderCarry[s_22_16, And[a_c06, b_c16], c_21_16] and

   s_22_18 in AdderSum  [s_22_17, And[a_c05, b_c17], c_21_17] and
   c_22_18 in AdderCarry[s_22_17, And[a_c05, b_c17], c_21_17] and

   s_22_19 in AdderSum  [s_22_18, And[a_c04, b_c18], c_21_18] and
   c_22_19 in AdderCarry[s_22_18, And[a_c04, b_c18], c_21_18] and

   s_22_20 in AdderSum  [s_22_19, And[a_c03, b_c19], c_21_19] and
   c_22_20 in AdderCarry[s_22_19, And[a_c03, b_c19], c_21_19] and

   s_22_21 in AdderSum  [s_22_20, And[a_c02, b_c20], c_21_20] and
   c_22_21 in AdderCarry[s_22_20, And[a_c02, b_c20], c_21_20] and

   s_22_22 in AdderSum  [s_22_21, And[a_c01, b_c21], c_21_21] and
   c_22_22 in AdderCarry[s_22_21, And[a_c01, b_c21], c_21_21] and

   s_22_23 in AdderSum  [s_22_22, And[a_c00, b_c22], c_21_22] and
   c_22_23 in AdderCarry[s_22_22, And[a_c00, b_c22], c_21_22] and

   s_23_0 in AdderSum  [And[a_c23,b.b31], And[a.b31, b_c23], false] and
   c_23_0 in AdderCarry[And[a_c23,b.b31], And[a.b31, b_c23], false] and

   s_23_1 in AdderSum  [s_23_0, And[a_c23, b_c00], c_22_0] and
   c_23_1 in AdderCarry[s_23_0, And[a_c23, b_c00], c_22_0] and

   s_23_2 in AdderSum  [s_23_1, And[a_c22, b_c01], c_22_1] and
   c_23_2 in AdderCarry[s_23_1, And[a_c22, b_c01], c_22_1] and

   s_23_3 in AdderSum  [s_23_2, And[a_c21, b_c02], c_22_2] and
   c_23_3 in AdderCarry[s_23_2, And[a_c21, b_c02], c_22_2] and

   s_23_4 in AdderSum  [s_23_3, And[a_c20, b_c03], c_22_3] and
   c_23_4 in AdderCarry[s_23_3, And[a_c20, b_c03], c_22_3] and

   s_23_5 in AdderSum  [s_23_4, And[a_c19, b_c04], c_22_4] and
   c_23_5 in AdderCarry[s_23_4, And[a_c19, b_c04], c_22_4] and

   s_23_6 in AdderSum  [s_23_5, And[a_c18, b_c05], c_22_5] and
   c_23_6 in AdderCarry[s_23_5, And[a_c18, b_c05], c_22_5] and

   s_23_7 in AdderSum  [s_23_6, And[a_c17, b_c06], c_22_6] and
   c_23_7 in AdderCarry[s_23_6, And[a_c17, b_c06], c_22_6] and

   s_23_8 in AdderSum  [s_23_7, And[a_c16, b_c07], c_22_7] and
   c_23_8 in AdderCarry[s_23_7, And[a_c16, b_c07], c_22_7] and

   s_23_9 in AdderSum  [s_23_8, And[a_c15, b_c08], c_22_8] and
   c_23_9 in AdderCarry[s_23_8, And[a_c15, b_c08], c_22_8] and

   s_23_10 in AdderSum  [s_23_9, And[a_c14, b_c09], c_22_9] and
   c_23_10 in AdderCarry[s_23_9, And[a_c14, b_c09], c_22_9] and

   s_23_11 in AdderSum  [s_23_10, And[a_c13, b_c10], c_22_10] and
   c_23_11 in AdderCarry[s_23_10, And[a_c13, b_c10], c_22_10] and

   s_23_12 in AdderSum  [s_23_11, And[a_c12, b_c11], c_22_11] and
   c_23_12 in AdderCarry[s_23_11, And[a_c12, b_c11], c_22_11] and

   s_23_13 in AdderSum  [s_23_12, And[a_c11, b_c12], c_22_12] and
   c_23_13 in AdderCarry[s_23_12, And[a_c11, b_c12], c_22_12] and

   s_23_14 in AdderSum  [s_23_13, And[a_c10, b_c13], c_22_13] and
   c_23_14 in AdderCarry[s_23_13, And[a_c10, b_c13], c_22_13] and

   s_23_15 in AdderSum  [s_23_14, And[a_c09, b_c14], c_22_14] and
   c_23_15 in AdderCarry[s_23_14, And[a_c09, b_c14], c_22_14] and

   s_23_16 in AdderSum  [s_23_15, And[a_c08, b_c15], c_22_15] and
   c_23_16 in AdderCarry[s_23_15, And[a_c08, b_c15], c_22_15] and

   s_23_17 in AdderSum  [s_23_16, And[a_c07, b_c16], c_22_16] and
   c_23_17 in AdderCarry[s_23_16, And[a_c07, b_c16], c_22_16] and

   s_23_18 in AdderSum  [s_23_17, And[a_c06, b_c17], c_22_17] and
   c_23_18 in AdderCarry[s_23_17, And[a_c06, b_c17], c_22_17] and

   s_23_19 in AdderSum  [s_23_18, And[a_c05, b_c18], c_22_18] and
   c_23_19 in AdderCarry[s_23_18, And[a_c05, b_c18], c_22_18] and

   s_23_20 in AdderSum  [s_23_19, And[a_c04, b_c19], c_22_19] and
   c_23_20 in AdderCarry[s_23_19, And[a_c04, b_c19], c_22_19] and

   s_23_21 in AdderSum  [s_23_20, And[a_c03, b_c20], c_22_20] and
   c_23_21 in AdderCarry[s_23_20, And[a_c03, b_c20], c_22_20] and

   s_23_22 in AdderSum  [s_23_21, And[a_c02, b_c21], c_22_21] and
   c_23_22 in AdderCarry[s_23_21, And[a_c02, b_c21], c_22_21] and

   s_23_23 in AdderSum  [s_23_22, And[a_c01, b_c22], c_22_22] and
   c_23_23 in AdderCarry[s_23_22, And[a_c01, b_c22], c_22_22] and

   s_23_24 in AdderSum  [s_23_23, And[a_c00, b_c23], c_22_23] and
   c_23_24 in AdderCarry[s_23_23, And[a_c00, b_c23], c_22_23] and

   s_24_0 in AdderSum  [And[a_c24,b.b31], And[a.b31, b_c24], false] and
   c_24_0 in AdderCarry[And[a_c24,b.b31], And[a.b31, b_c24], false] and

   s_24_1 in AdderSum  [s_24_0, And[a_c24, b_c00], c_23_0] and
   c_24_1 in AdderCarry[s_24_0, And[a_c24, b_c00], c_23_0] and

   s_24_2 in AdderSum  [s_24_1, And[a_c23, b_c01], c_23_1] and
   c_24_2 in AdderCarry[s_24_1, And[a_c23, b_c01], c_23_1] and

   s_24_3 in AdderSum  [s_24_2, And[a_c22, b_c02], c_23_2] and
   c_24_3 in AdderCarry[s_24_2, And[a_c22, b_c02], c_23_2] and

   s_24_4 in AdderSum  [s_24_3, And[a_c21, b_c03], c_23_3] and
   c_24_4 in AdderCarry[s_24_3, And[a_c21, b_c03], c_23_3] and

   s_24_5 in AdderSum  [s_24_4, And[a_c20, b_c04], c_23_4] and
   c_24_5 in AdderCarry[s_24_4, And[a_c20, b_c04], c_23_4] and

   s_24_6 in AdderSum  [s_24_5, And[a_c19, b_c05], c_23_5] and
   c_24_6 in AdderCarry[s_24_5, And[a_c19, b_c05], c_23_5] and

   s_24_7 in AdderSum  [s_24_6, And[a_c18, b_c06], c_23_6] and
   c_24_7 in AdderCarry[s_24_6, And[a_c18, b_c06], c_23_6] and

   s_24_8 in AdderSum  [s_24_7, And[a_c17, b_c07], c_23_7] and
   c_24_8 in AdderCarry[s_24_7, And[a_c17, b_c07], c_23_7] and

   s_24_9 in AdderSum  [s_24_8, And[a_c16, b_c08], c_23_8] and
   c_24_9 in AdderCarry[s_24_8, And[a_c16, b_c08], c_23_8] and

   s_24_10 in AdderSum  [s_24_9, And[a_c15, b_c09], c_23_9] and
   c_24_10 in AdderCarry[s_24_9, And[a_c15, b_c09], c_23_9] and

   s_24_11 in AdderSum  [s_24_10, And[a_c14, b_c10], c_23_10] and
   c_24_11 in AdderCarry[s_24_10, And[a_c14, b_c10], c_23_10] and

   s_24_12 in AdderSum  [s_24_11, And[a_c13, b_c11], c_23_11] and
   c_24_12 in AdderCarry[s_24_11, And[a_c13, b_c11], c_23_11] and

   s_24_13 in AdderSum  [s_24_12, And[a_c12, b_c12], c_23_12] and
   c_24_13 in AdderCarry[s_24_12, And[a_c12, b_c12], c_23_12] and

   s_24_14 in AdderSum  [s_24_13, And[a_c11, b_c13], c_23_13] and
   c_24_14 in AdderCarry[s_24_13, And[a_c11, b_c13], c_23_13] and

   s_24_15 in AdderSum  [s_24_14, And[a_c10, b_c14], c_23_14] and
   c_24_15 in AdderCarry[s_24_14, And[a_c10, b_c14], c_23_14] and

   s_24_16 in AdderSum  [s_24_15, And[a_c09, b_c15], c_23_15] and
   c_24_16 in AdderCarry[s_24_15, And[a_c09, b_c15], c_23_15] and

   s_24_17 in AdderSum  [s_24_16, And[a_c08, b_c16], c_23_16] and
   c_24_17 in AdderCarry[s_24_16, And[a_c08, b_c16], c_23_16] and

   s_24_18 in AdderSum  [s_24_17, And[a_c07, b_c17], c_23_17] and
   c_24_18 in AdderCarry[s_24_17, And[a_c07, b_c17], c_23_17] and

   s_24_19 in AdderSum  [s_24_18, And[a_c06, b_c18], c_23_18] and
   c_24_19 in AdderCarry[s_24_18, And[a_c06, b_c18], c_23_18] and

   s_24_20 in AdderSum  [s_24_19, And[a_c05, b_c19], c_23_19] and
   c_24_20 in AdderCarry[s_24_19, And[a_c05, b_c19], c_23_19] and

   s_24_21 in AdderSum  [s_24_20, And[a_c04, b_c20], c_23_20] and
   c_24_21 in AdderCarry[s_24_20, And[a_c04, b_c20], c_23_20] and

   s_24_22 in AdderSum  [s_24_21, And[a_c03, b_c21], c_23_21] and
   c_24_22 in AdderCarry[s_24_21, And[a_c03, b_c21], c_23_21] and

   s_24_23 in AdderSum  [s_24_22, And[a_c02, b_c22], c_23_22] and
   c_24_23 in AdderCarry[s_24_22, And[a_c02, b_c22], c_23_22] and

   s_24_24 in AdderSum  [s_24_23, And[a_c01, b_c23], c_23_23] and
   c_24_24 in AdderCarry[s_24_23, And[a_c01, b_c23], c_23_23] and

   s_24_25 in AdderSum  [s_24_24, And[a_c00, b_c24], c_23_24] and
   c_24_25 in AdderCarry[s_24_24, And[a_c00, b_c24], c_23_24] and

   s_25_0 in AdderSum  [And[a_c25,b.b31], And[a.b31, b_c25], false] and
   c_25_0 in AdderCarry[And[a_c25,b.b31], And[a.b31, b_c25], false] and

   s_25_1 in AdderSum  [s_25_0, And[a_c25, b_c00], c_24_0] and
   c_25_1 in AdderCarry[s_25_0, And[a_c25, b_c00], c_24_0] and

   s_25_2 in AdderSum  [s_25_1, And[a_c24, b_c01], c_24_1] and
   c_25_2 in AdderCarry[s_25_1, And[a_c24, b_c01], c_24_1] and

   s_25_3 in AdderSum  [s_25_2, And[a_c23, b_c02], c_24_2] and
   c_25_3 in AdderCarry[s_25_2, And[a_c23, b_c02], c_24_2] and

   s_25_4 in AdderSum  [s_25_3, And[a_c22, b_c03], c_24_3] and
   c_25_4 in AdderCarry[s_25_3, And[a_c22, b_c03], c_24_3] and

   s_25_5 in AdderSum  [s_25_4, And[a_c21, b_c04], c_24_4] and
   c_25_5 in AdderCarry[s_25_4, And[a_c21, b_c04], c_24_4] and

   s_25_6 in AdderSum  [s_25_5, And[a_c20, b_c05], c_24_5] and
   c_25_6 in AdderCarry[s_25_5, And[a_c20, b_c05], c_24_5] and

   s_25_7 in AdderSum  [s_25_6, And[a_c19, b_c06], c_24_6] and
   c_25_7 in AdderCarry[s_25_6, And[a_c19, b_c06], c_24_6] and

   s_25_8 in AdderSum  [s_25_7, And[a_c18, b_c07], c_24_7] and
   c_25_8 in AdderCarry[s_25_7, And[a_c18, b_c07], c_24_7] and

   s_25_9 in AdderSum  [s_25_8, And[a_c17, b_c08], c_24_8] and
   c_25_9 in AdderCarry[s_25_8, And[a_c17, b_c08], c_24_8] and

   s_25_10 in AdderSum  [s_25_9, And[a_c16, b_c09], c_24_9] and
   c_25_10 in AdderCarry[s_25_9, And[a_c16, b_c09], c_24_9] and

   s_25_11 in AdderSum  [s_25_10, And[a_c15, b_c10], c_24_10] and
   c_25_11 in AdderCarry[s_25_10, And[a_c15, b_c10], c_24_10] and

   s_25_12 in AdderSum  [s_25_11, And[a_c14, b_c11], c_24_11] and
   c_25_12 in AdderCarry[s_25_11, And[a_c14, b_c11], c_24_11] and

   s_25_13 in AdderSum  [s_25_12, And[a_c13, b_c12], c_24_12] and
   c_25_13 in AdderCarry[s_25_12, And[a_c13, b_c12], c_24_12] and

   s_25_14 in AdderSum  [s_25_13, And[a_c12, b_c13], c_24_13] and
   c_25_14 in AdderCarry[s_25_13, And[a_c12, b_c13], c_24_13] and

   s_25_15 in AdderSum  [s_25_14, And[a_c11, b_c14], c_24_14] and
   c_25_15 in AdderCarry[s_25_14, And[a_c11, b_c14], c_24_14] and

   s_25_16 in AdderSum  [s_25_15, And[a_c10, b_c15], c_24_15] and
   c_25_16 in AdderCarry[s_25_15, And[a_c10, b_c15], c_24_15] and

   s_25_17 in AdderSum  [s_25_16, And[a_c09, b_c16], c_24_16] and
   c_25_17 in AdderCarry[s_25_16, And[a_c09, b_c16], c_24_16] and

   s_25_18 in AdderSum  [s_25_17, And[a_c08, b_c17], c_24_17] and
   c_25_18 in AdderCarry[s_25_17, And[a_c08, b_c17], c_24_17] and

   s_25_19 in AdderSum  [s_25_18, And[a_c07, b_c18], c_24_18] and
   c_25_19 in AdderCarry[s_25_18, And[a_c07, b_c18], c_24_18] and

   s_25_20 in AdderSum  [s_25_19, And[a_c06, b_c19], c_24_19] and
   c_25_20 in AdderCarry[s_25_19, And[a_c06, b_c19], c_24_19] and

   s_25_21 in AdderSum  [s_25_20, And[a_c05, b_c20], c_24_20] and
   c_25_21 in AdderCarry[s_25_20, And[a_c05, b_c20], c_24_20] and

   s_25_22 in AdderSum  [s_25_21, And[a_c04, b_c21], c_24_21] and
   c_25_22 in AdderCarry[s_25_21, And[a_c04, b_c21], c_24_21] and

   s_25_23 in AdderSum  [s_25_22, And[a_c03, b_c22], c_24_22] and
   c_25_23 in AdderCarry[s_25_22, And[a_c03, b_c22], c_24_22] and

   s_25_24 in AdderSum  [s_25_23, And[a_c02, b_c23], c_24_23] and
   c_25_24 in AdderCarry[s_25_23, And[a_c02, b_c23], c_24_23] and

   s_25_25 in AdderSum  [s_25_24, And[a_c01, b_c24], c_24_24] and
   c_25_25 in AdderCarry[s_25_24, And[a_c01, b_c24], c_24_24] and

   s_25_26 in AdderSum  [s_25_25, And[a_c00, b_c25], c_24_25] and
   c_25_26 in AdderCarry[s_25_25, And[a_c00, b_c25], c_24_25] and

   s_26_0 in AdderSum  [And[a_c26,b.b31], And[a.b31, b_c26], false] and
   c_26_0 in AdderCarry[And[a_c26,b.b31], And[a.b31, b_c26], false] and

   s_26_1 in AdderSum  [s_26_0, And[a_c26, b_c00], c_25_0] and
   c_26_1 in AdderCarry[s_26_0, And[a_c26, b_c00], c_25_0] and

   s_26_2 in AdderSum  [s_26_1, And[a_c25, b_c01], c_25_1] and
   c_26_2 in AdderCarry[s_26_1, And[a_c25, b_c01], c_25_1] and

   s_26_3 in AdderSum  [s_26_2, And[a_c24, b_c02], c_25_2] and
   c_26_3 in AdderCarry[s_26_2, And[a_c24, b_c02], c_25_2] and

   s_26_4 in AdderSum  [s_26_3, And[a_c23, b_c03], c_25_3] and
   c_26_4 in AdderCarry[s_26_3, And[a_c23, b_c03], c_25_3] and

   s_26_5 in AdderSum  [s_26_4, And[a_c22, b_c04], c_25_4] and
   c_26_5 in AdderCarry[s_26_4, And[a_c22, b_c04], c_25_4] and

   s_26_6 in AdderSum  [s_26_5, And[a_c21, b_c05], c_25_5] and
   c_26_6 in AdderCarry[s_26_5, And[a_c21, b_c05], c_25_5] and

   s_26_7 in AdderSum  [s_26_6, And[a_c20, b_c06], c_25_6] and
   c_26_7 in AdderCarry[s_26_6, And[a_c20, b_c06], c_25_6] and

   s_26_8 in AdderSum  [s_26_7, And[a_c19, b_c07], c_25_7] and
   c_26_8 in AdderCarry[s_26_7, And[a_c19, b_c07], c_25_7] and

   s_26_9 in AdderSum  [s_26_8, And[a_c18, b_c08], c_25_8] and
   c_26_9 in AdderCarry[s_26_8, And[a_c18, b_c08], c_25_8] and

   s_26_10 in AdderSum  [s_26_9, And[a_c17, b_c09], c_25_9] and
   c_26_10 in AdderCarry[s_26_9, And[a_c17, b_c09], c_25_9] and

   s_26_11 in AdderSum  [s_26_10, And[a_c16, b_c10], c_25_10] and
   c_26_11 in AdderCarry[s_26_10, And[a_c16, b_c10], c_25_10] and

   s_26_12 in AdderSum  [s_26_11, And[a_c15, b_c11], c_25_11] and
   c_26_12 in AdderCarry[s_26_11, And[a_c15, b_c11], c_25_11] and

   s_26_13 in AdderSum  [s_26_12, And[a_c14, b_c12], c_25_12] and
   c_26_13 in AdderCarry[s_26_12, And[a_c14, b_c12], c_25_12] and

   s_26_14 in AdderSum  [s_26_13, And[a_c13, b_c13], c_25_13] and
   c_26_14 in AdderCarry[s_26_13, And[a_c13, b_c13], c_25_13] and

   s_26_15 in AdderSum  [s_26_14, And[a_c12, b_c14], c_25_14] and
   c_26_15 in AdderCarry[s_26_14, And[a_c12, b_c14], c_25_14] and

   s_26_16 in AdderSum  [s_26_15, And[a_c11, b_c15], c_25_15] and
   c_26_16 in AdderCarry[s_26_15, And[a_c11, b_c15], c_25_15] and

   s_26_17 in AdderSum  [s_26_16, And[a_c10, b_c16], c_25_16] and
   c_26_17 in AdderCarry[s_26_16, And[a_c10, b_c16], c_25_16] and

   s_26_18 in AdderSum  [s_26_17, And[a_c09, b_c17], c_25_17] and
   c_26_18 in AdderCarry[s_26_17, And[a_c09, b_c17], c_25_17] and

   s_26_19 in AdderSum  [s_26_18, And[a_c08, b_c18], c_25_18] and
   c_26_19 in AdderCarry[s_26_18, And[a_c08, b_c18], c_25_18] and

   s_26_20 in AdderSum  [s_26_19, And[a_c07, b_c19], c_25_19] and
   c_26_20 in AdderCarry[s_26_19, And[a_c07, b_c19], c_25_19] and

   s_26_21 in AdderSum  [s_26_20, And[a_c06, b_c20], c_25_20] and
   c_26_21 in AdderCarry[s_26_20, And[a_c06, b_c20], c_25_20] and

   s_26_22 in AdderSum  [s_26_21, And[a_c05, b_c21], c_25_21] and
   c_26_22 in AdderCarry[s_26_21, And[a_c05, b_c21], c_25_21] and

   s_26_23 in AdderSum  [s_26_22, And[a_c04, b_c22], c_25_22] and
   c_26_23 in AdderCarry[s_26_22, And[a_c04, b_c22], c_25_22] and

   s_26_24 in AdderSum  [s_26_23, And[a_c03, b_c23], c_25_23] and
   c_26_24 in AdderCarry[s_26_23, And[a_c03, b_c23], c_25_23] and

   s_26_25 in AdderSum  [s_26_24, And[a_c02, b_c24], c_25_24] and
   c_26_25 in AdderCarry[s_26_24, And[a_c02, b_c24], c_25_24] and

   s_26_26 in AdderSum  [s_26_25, And[a_c01, b_c25], c_25_25] and
   c_26_26 in AdderCarry[s_26_25, And[a_c01, b_c25], c_25_25] and

   s_26_27 in AdderSum  [s_26_26, And[a_c00, b_c26], c_25_26] and
   c_26_27 in AdderCarry[s_26_26, And[a_c00, b_c26], c_25_26] and

   s_27_0 in AdderSum  [And[a_c27,b.b31], And[a.b31, b_c27], false] and
   c_27_0 in AdderCarry[And[a_c27,b.b31], And[a.b31, b_c27], false] and

   s_27_1 in AdderSum  [s_27_0, And[a_c27, b_c00], c_26_0] and
   c_27_1 in AdderCarry[s_27_0, And[a_c27, b_c00], c_26_0] and

   s_27_2 in AdderSum  [s_27_1, And[a_c26, b_c01], c_26_1] and
   c_27_2 in AdderCarry[s_27_1, And[a_c26, b_c01], c_26_1] and

   s_27_3 in AdderSum  [s_27_2, And[a_c25, b_c02], c_26_2] and
   c_27_3 in AdderCarry[s_27_2, And[a_c25, b_c02], c_26_2] and

   s_27_4 in AdderSum  [s_27_3, And[a_c24, b_c03], c_26_3] and
   c_27_4 in AdderCarry[s_27_3, And[a_c24, b_c03], c_26_3] and

   s_27_5 in AdderSum  [s_27_4, And[a_c23, b_c04], c_26_4] and
   c_27_5 in AdderCarry[s_27_4, And[a_c23, b_c04], c_26_4] and

   s_27_6 in AdderSum  [s_27_5, And[a_c22, b_c05], c_26_5] and
   c_27_6 in AdderCarry[s_27_5, And[a_c22, b_c05], c_26_5] and

   s_27_7 in AdderSum  [s_27_6, And[a_c21, b_c06], c_26_6] and
   c_27_7 in AdderCarry[s_27_6, And[a_c21, b_c06], c_26_6] and

   s_27_8 in AdderSum  [s_27_7, And[a_c20, b_c07], c_26_7] and
   c_27_8 in AdderCarry[s_27_7, And[a_c20, b_c07], c_26_7] and

   s_27_9 in AdderSum  [s_27_8, And[a_c19, b_c08], c_26_8] and
   c_27_9 in AdderCarry[s_27_8, And[a_c19, b_c08], c_26_8] and

   s_27_10 in AdderSum  [s_27_9, And[a_c18, b_c09], c_26_9] and
   c_27_10 in AdderCarry[s_27_9, And[a_c18, b_c09], c_26_9] and

   s_27_11 in AdderSum  [s_27_10, And[a_c17, b_c10], c_26_10] and
   c_27_11 in AdderCarry[s_27_10, And[a_c17, b_c10], c_26_10] and

   s_27_12 in AdderSum  [s_27_11, And[a_c16, b_c11], c_26_11] and
   c_27_12 in AdderCarry[s_27_11, And[a_c16, b_c11], c_26_11] and

   s_27_13 in AdderSum  [s_27_12, And[a_c15, b_c12], c_26_12] and
   c_27_13 in AdderCarry[s_27_12, And[a_c15, b_c12], c_26_12] and

   s_27_14 in AdderSum  [s_27_13, And[a_c14, b_c13], c_26_13] and
   c_27_14 in AdderCarry[s_27_13, And[a_c14, b_c13], c_26_13] and

   s_27_15 in AdderSum  [s_27_14, And[a_c13, b_c14], c_26_14] and
   c_27_15 in AdderCarry[s_27_14, And[a_c13, b_c14], c_26_14] and

   s_27_16 in AdderSum  [s_27_15, And[a_c12, b_c15], c_26_15] and
   c_27_16 in AdderCarry[s_27_15, And[a_c12, b_c15], c_26_15] and

   s_27_17 in AdderSum  [s_27_16, And[a_c11, b_c16], c_26_16] and
   c_27_17 in AdderCarry[s_27_16, And[a_c11, b_c16], c_26_16] and

   s_27_18 in AdderSum  [s_27_17, And[a_c10, b_c17], c_26_17] and
   c_27_18 in AdderCarry[s_27_17, And[a_c10, b_c17], c_26_17] and

   s_27_19 in AdderSum  [s_27_18, And[a_c09, b_c18], c_26_18] and
   c_27_19 in AdderCarry[s_27_18, And[a_c09, b_c18], c_26_18] and

   s_27_20 in AdderSum  [s_27_19, And[a_c08, b_c19], c_26_19] and
   c_27_20 in AdderCarry[s_27_19, And[a_c08, b_c19], c_26_19] and

   s_27_21 in AdderSum  [s_27_20, And[a_c07, b_c20], c_26_20] and
   c_27_21 in AdderCarry[s_27_20, And[a_c07, b_c20], c_26_20] and

   s_27_22 in AdderSum  [s_27_21, And[a_c06, b_c21], c_26_21] and
   c_27_22 in AdderCarry[s_27_21, And[a_c06, b_c21], c_26_21] and

   s_27_23 in AdderSum  [s_27_22, And[a_c05, b_c22], c_26_22] and
   c_27_23 in AdderCarry[s_27_22, And[a_c05, b_c22], c_26_22] and

   s_27_24 in AdderSum  [s_27_23, And[a_c04, b_c23], c_26_23] and
   c_27_24 in AdderCarry[s_27_23, And[a_c04, b_c23], c_26_23] and

   s_27_25 in AdderSum  [s_27_24, And[a_c03, b_c24], c_26_24] and
   c_27_25 in AdderCarry[s_27_24, And[a_c03, b_c24], c_26_24] and

   s_27_26 in AdderSum  [s_27_25, And[a_c02, b_c25], c_26_25] and
   c_27_26 in AdderCarry[s_27_25, And[a_c02, b_c25], c_26_25] and

   s_27_27 in AdderSum  [s_27_26, And[a_c01, b_c26], c_26_26] and
   c_27_27 in AdderCarry[s_27_26, And[a_c01, b_c26], c_26_26] and

   s_27_28 in AdderSum  [s_27_27, And[a_c00, b_c27], c_26_27] and
   c_27_28 in AdderCarry[s_27_27, And[a_c00, b_c27], c_26_27] and

   s_28_0 in AdderSum  [And[a_c28,b.b31], And[a.b31, b_c28], false] and
   c_28_0 in AdderCarry[And[a_c28,b.b31], And[a.b31, b_c28], false] and

   s_28_1 in AdderSum  [s_28_0, And[a_c28, b_c00], c_27_0] and
   c_28_1 in AdderCarry[s_28_0, And[a_c28, b_c00], c_27_0] and

   s_28_2 in AdderSum  [s_28_1, And[a_c27, b_c01], c_27_1] and
   c_28_2 in AdderCarry[s_28_1, And[a_c27, b_c01], c_27_1] and

   s_28_3 in AdderSum  [s_28_2, And[a_c26, b_c02], c_27_2] and
   c_28_3 in AdderCarry[s_28_2, And[a_c26, b_c02], c_27_2] and

   s_28_4 in AdderSum  [s_28_3, And[a_c25, b_c03], c_27_3] and
   c_28_4 in AdderCarry[s_28_3, And[a_c25, b_c03], c_27_3] and

   s_28_5 in AdderSum  [s_28_4, And[a_c24, b_c04], c_27_4] and
   c_28_5 in AdderCarry[s_28_4, And[a_c24, b_c04], c_27_4] and

   s_28_6 in AdderSum  [s_28_5, And[a_c23, b_c05], c_27_5] and
   c_28_6 in AdderCarry[s_28_5, And[a_c23, b_c05], c_27_5] and

   s_28_7 in AdderSum  [s_28_6, And[a_c22, b_c06], c_27_6] and
   c_28_7 in AdderCarry[s_28_6, And[a_c22, b_c06], c_27_6] and

   s_28_8 in AdderSum  [s_28_7, And[a_c21, b_c07], c_27_7] and
   c_28_8 in AdderCarry[s_28_7, And[a_c21, b_c07], c_27_7] and

   s_28_9 in AdderSum  [s_28_8, And[a_c20, b_c08], c_27_8] and
   c_28_9 in AdderCarry[s_28_8, And[a_c20, b_c08], c_27_8] and

   s_28_10 in AdderSum  [s_28_9, And[a_c19, b_c09], c_27_9] and
   c_28_10 in AdderCarry[s_28_9, And[a_c19, b_c09], c_27_9] and

   s_28_11 in AdderSum  [s_28_10, And[a_c18, b_c10], c_27_10] and
   c_28_11 in AdderCarry[s_28_10, And[a_c18, b_c10], c_27_10] and

   s_28_12 in AdderSum  [s_28_11, And[a_c17, b_c11], c_27_11] and
   c_28_12 in AdderCarry[s_28_11, And[a_c17, b_c11], c_27_11] and

   s_28_13 in AdderSum  [s_28_12, And[a_c16, b_c12], c_27_12] and
   c_28_13 in AdderCarry[s_28_12, And[a_c16, b_c12], c_27_12] and

   s_28_14 in AdderSum  [s_28_13, And[a_c15, b_c13], c_27_13] and
   c_28_14 in AdderCarry[s_28_13, And[a_c15, b_c13], c_27_13] and

   s_28_15 in AdderSum  [s_28_14, And[a_c14, b_c14], c_27_14] and
   c_28_15 in AdderCarry[s_28_14, And[a_c14, b_c14], c_27_14] and

   s_28_16 in AdderSum  [s_28_15, And[a_c13, b_c15], c_27_15] and
   c_28_16 in AdderCarry[s_28_15, And[a_c13, b_c15], c_27_15] and

   s_28_17 in AdderSum  [s_28_16, And[a_c12, b_c16], c_27_16] and
   c_28_17 in AdderCarry[s_28_16, And[a_c12, b_c16], c_27_16] and

   s_28_18 in AdderSum  [s_28_17, And[a_c11, b_c17], c_27_17] and
   c_28_18 in AdderCarry[s_28_17, And[a_c11, b_c17], c_27_17] and

   s_28_19 in AdderSum  [s_28_18, And[a_c10, b_c18], c_27_18] and
   c_28_19 in AdderCarry[s_28_18, And[a_c10, b_c18], c_27_18] and

   s_28_20 in AdderSum  [s_28_19, And[a_c09, b_c19], c_27_19] and
   c_28_20 in AdderCarry[s_28_19, And[a_c09, b_c19], c_27_19] and

   s_28_21 in AdderSum  [s_28_20, And[a_c08, b_c20], c_27_20] and
   c_28_21 in AdderCarry[s_28_20, And[a_c08, b_c20], c_27_20] and

   s_28_22 in AdderSum  [s_28_21, And[a_c07, b_c21], c_27_21] and
   c_28_22 in AdderCarry[s_28_21, And[a_c07, b_c21], c_27_21] and

   s_28_23 in AdderSum  [s_28_22, And[a_c06, b_c22], c_27_22] and
   c_28_23 in AdderCarry[s_28_22, And[a_c06, b_c22], c_27_22] and

   s_28_24 in AdderSum  [s_28_23, And[a_c05, b_c23], c_27_23] and
   c_28_24 in AdderCarry[s_28_23, And[a_c05, b_c23], c_27_23] and

   s_28_25 in AdderSum  [s_28_24, And[a_c04, b_c24], c_27_24] and
   c_28_25 in AdderCarry[s_28_24, And[a_c04, b_c24], c_27_24] and

   s_28_26 in AdderSum  [s_28_25, And[a_c03, b_c25], c_27_25] and
   c_28_26 in AdderCarry[s_28_25, And[a_c03, b_c25], c_27_25] and

   s_28_27 in AdderSum  [s_28_26, And[a_c02, b_c26], c_27_26] and
   c_28_27 in AdderCarry[s_28_26, And[a_c02, b_c26], c_27_26] and

   s_28_28 in AdderSum  [s_28_27, And[a_c01, b_c27], c_27_27] and
   c_28_28 in AdderCarry[s_28_27, And[a_c01, b_c27], c_27_27] and

   s_28_29 in AdderSum  [s_28_28, And[a_c00, b_c28], c_27_28] and
   c_28_29 in AdderCarry[s_28_28, And[a_c00, b_c28], c_27_28] and

   s_29_0 in AdderSum  [And[a_c29,b.b31], And[a.b31, b_c29], false] and
   c_29_0 in AdderCarry[And[a_c29,b.b31], And[a.b31, b_c29], false] and

   s_29_1 in AdderSum  [s_29_0, And[a_c29, b_c00], c_28_0] and
   c_29_1 in AdderCarry[s_29_0, And[a_c29, b_c00], c_28_0] and

   s_29_2 in AdderSum  [s_29_1, And[a_c28, b_c01], c_28_1] and
   c_29_2 in AdderCarry[s_29_1, And[a_c28, b_c01], c_28_1] and

   s_29_3 in AdderSum  [s_29_2, And[a_c27, b_c02], c_28_2] and
   c_29_3 in AdderCarry[s_29_2, And[a_c27, b_c02], c_28_2] and

   s_29_4 in AdderSum  [s_29_3, And[a_c26, b_c03], c_28_3] and
   c_29_4 in AdderCarry[s_29_3, And[a_c26, b_c03], c_28_3] and

   s_29_5 in AdderSum  [s_29_4, And[a_c25, b_c04], c_28_4] and
   c_29_5 in AdderCarry[s_29_4, And[a_c25, b_c04], c_28_4] and

   s_29_6 in AdderSum  [s_29_5, And[a_c24, b_c05], c_28_5] and
   c_29_6 in AdderCarry[s_29_5, And[a_c24, b_c05], c_28_5] and

   s_29_7 in AdderSum  [s_29_6, And[a_c23, b_c06], c_28_6] and
   c_29_7 in AdderCarry[s_29_6, And[a_c23, b_c06], c_28_6] and

   s_29_8 in AdderSum  [s_29_7, And[a_c22, b_c07], c_28_7] and
   c_29_8 in AdderCarry[s_29_7, And[a_c22, b_c07], c_28_7] and

   s_29_9 in AdderSum  [s_29_8, And[a_c21, b_c08], c_28_8] and
   c_29_9 in AdderCarry[s_29_8, And[a_c21, b_c08], c_28_8] and

   s_29_10 in AdderSum  [s_29_9, And[a_c20, b_c09], c_28_9] and
   c_29_10 in AdderCarry[s_29_9, And[a_c20, b_c09], c_28_9] and

   s_29_11 in AdderSum  [s_29_10, And[a_c19, b_c10], c_28_10] and
   c_29_11 in AdderCarry[s_29_10, And[a_c19, b_c10], c_28_10] and

   s_29_12 in AdderSum  [s_29_11, And[a_c18, b_c11], c_28_11] and
   c_29_12 in AdderCarry[s_29_11, And[a_c18, b_c11], c_28_11] and

   s_29_13 in AdderSum  [s_29_12, And[a_c17, b_c12], c_28_12] and
   c_29_13 in AdderCarry[s_29_12, And[a_c17, b_c12], c_28_12] and

   s_29_14 in AdderSum  [s_29_13, And[a_c16, b_c13], c_28_13] and
   c_29_14 in AdderCarry[s_29_13, And[a_c16, b_c13], c_28_13] and

   s_29_15 in AdderSum  [s_29_14, And[a_c15, b_c14], c_28_14] and
   c_29_15 in AdderCarry[s_29_14, And[a_c15, b_c14], c_28_14] and

   s_29_16 in AdderSum  [s_29_15, And[a_c14, b_c15], c_28_15] and
   c_29_16 in AdderCarry[s_29_15, And[a_c14, b_c15], c_28_15] and

   s_29_17 in AdderSum  [s_29_16, And[a_c13, b_c16], c_28_16] and
   c_29_17 in AdderCarry[s_29_16, And[a_c13, b_c16], c_28_16] and

   s_29_18 in AdderSum  [s_29_17, And[a_c12, b_c17], c_28_17] and
   c_29_18 in AdderCarry[s_29_17, And[a_c12, b_c17], c_28_17] and

   s_29_19 in AdderSum  [s_29_18, And[a_c11, b_c18], c_28_18] and
   c_29_19 in AdderCarry[s_29_18, And[a_c11, b_c18], c_28_18] and

   s_29_20 in AdderSum  [s_29_19, And[a_c10, b_c19], c_28_19] and
   c_29_20 in AdderCarry[s_29_19, And[a_c10, b_c19], c_28_19] and

   s_29_21 in AdderSum  [s_29_20, And[a_c09, b_c20], c_28_20] and
   c_29_21 in AdderCarry[s_29_20, And[a_c09, b_c20], c_28_20] and

   s_29_22 in AdderSum  [s_29_21, And[a_c08, b_c21], c_28_21] and
   c_29_22 in AdderCarry[s_29_21, And[a_c08, b_c21], c_28_21] and

   s_29_23 in AdderSum  [s_29_22, And[a_c07, b_c22], c_28_22] and
   c_29_23 in AdderCarry[s_29_22, And[a_c07, b_c22], c_28_22] and

   s_29_24 in AdderSum  [s_29_23, And[a_c06, b_c23], c_28_23] and
   c_29_24 in AdderCarry[s_29_23, And[a_c06, b_c23], c_28_23] and

   s_29_25 in AdderSum  [s_29_24, And[a_c05, b_c24], c_28_24] and
   c_29_25 in AdderCarry[s_29_24, And[a_c05, b_c24], c_28_24] and

   s_29_26 in AdderSum  [s_29_25, And[a_c04, b_c25], c_28_25] and
   c_29_26 in AdderCarry[s_29_25, And[a_c04, b_c25], c_28_25] and

   s_29_27 in AdderSum  [s_29_26, And[a_c03, b_c26], c_28_26] and
   c_29_27 in AdderCarry[s_29_26, And[a_c03, b_c26], c_28_26] and

   s_29_28 in AdderSum  [s_29_27, And[a_c02, b_c27], c_28_27] and
   c_29_28 in AdderCarry[s_29_27, And[a_c02, b_c27], c_28_27] and

   s_29_29 in AdderSum  [s_29_28, And[a_c01, b_c28], c_28_28] and
   c_29_29 in AdderCarry[s_29_28, And[a_c01, b_c28], c_28_28] and

   s_29_30 in AdderSum  [s_29_29, And[a_c00, b_c29], c_28_29] and
   c_29_30 in AdderCarry[s_29_29, And[a_c00, b_c29], c_28_29] and

   s_30_0 in AdderSum  [And[a_c30,b.b31], And[a.b31, b_c30], false] and
   c_30_0 in AdderCarry[And[a_c30,b.b31], And[a.b31, b_c30], false] and

   s_30_1 in AdderSum  [s_30_0, And[a_c30, b_c00], c_29_0] and
   c_30_1 in AdderCarry[s_30_0, And[a_c30, b_c00], c_29_0] and

   s_30_2 in AdderSum  [s_30_1, And[a_c29, b_c01], c_29_1] and
   c_30_2 in AdderCarry[s_30_1, And[a_c29, b_c01], c_29_1] and

   s_30_3 in AdderSum  [s_30_2, And[a_c28, b_c02], c_29_2] and
   c_30_3 in AdderCarry[s_30_2, And[a_c28, b_c02], c_29_2] and

   s_30_4 in AdderSum  [s_30_3, And[a_c27, b_c03], c_29_3] and
   c_30_4 in AdderCarry[s_30_3, And[a_c27, b_c03], c_29_3] and

   s_30_5 in AdderSum  [s_30_4, And[a_c26, b_c04], c_29_4] and
   c_30_5 in AdderCarry[s_30_4, And[a_c26, b_c04], c_29_4] and

   s_30_6 in AdderSum  [s_30_5, And[a_c25, b_c05], c_29_5] and
   c_30_6 in AdderCarry[s_30_5, And[a_c25, b_c05], c_29_5] and

   s_30_7 in AdderSum  [s_30_6, And[a_c24, b_c06], c_29_6] and
   c_30_7 in AdderCarry[s_30_6, And[a_c24, b_c06], c_29_6] and

   s_30_8 in AdderSum  [s_30_7, And[a_c23, b_c07], c_29_7] and
   c_30_8 in AdderCarry[s_30_7, And[a_c23, b_c07], c_29_7] and

   s_30_9 in AdderSum  [s_30_8, And[a_c22, b_c08], c_29_8] and
   c_30_9 in AdderCarry[s_30_8, And[a_c22, b_c08], c_29_8] and

   s_30_10 in AdderSum  [s_30_9, And[a_c21, b_c09], c_29_9] and
   c_30_10 in AdderCarry[s_30_9, And[a_c21, b_c09], c_29_9] and

   s_30_11 in AdderSum  [s_30_10, And[a_c20, b_c10], c_29_10] and
   c_30_11 in AdderCarry[s_30_10, And[a_c20, b_c10], c_29_10] and

   s_30_12 in AdderSum  [s_30_11, And[a_c19, b_c11], c_29_11] and
   c_30_12 in AdderCarry[s_30_11, And[a_c19, b_c11], c_29_11] and

   s_30_13 in AdderSum  [s_30_12, And[a_c18, b_c12], c_29_12] and
   c_30_13 in AdderCarry[s_30_12, And[a_c18, b_c12], c_29_12] and

   s_30_14 in AdderSum  [s_30_13, And[a_c17, b_c13], c_29_13] and
   c_30_14 in AdderCarry[s_30_13, And[a_c17, b_c13], c_29_13] and

   s_30_15 in AdderSum  [s_30_14, And[a_c16, b_c14], c_29_14] and
   c_30_15 in AdderCarry[s_30_14, And[a_c16, b_c14], c_29_14] and

   s_30_16 in AdderSum  [s_30_15, And[a_c15, b_c15], c_29_15] and
   c_30_16 in AdderCarry[s_30_15, And[a_c15, b_c15], c_29_15] and

   s_30_17 in AdderSum  [s_30_16, And[a_c14, b_c16], c_29_16] and
   c_30_17 in AdderCarry[s_30_16, And[a_c14, b_c16], c_29_16] and

   s_30_18 in AdderSum  [s_30_17, And[a_c13, b_c17], c_29_17] and
   c_30_18 in AdderCarry[s_30_17, And[a_c13, b_c17], c_29_17] and

   s_30_19 in AdderSum  [s_30_18, And[a_c12, b_c18], c_29_18] and
   c_30_19 in AdderCarry[s_30_18, And[a_c12, b_c18], c_29_18] and

   s_30_20 in AdderSum  [s_30_19, And[a_c11, b_c19], c_29_19] and
   c_30_20 in AdderCarry[s_30_19, And[a_c11, b_c19], c_29_19] and

   s_30_21 in AdderSum  [s_30_20, And[a_c10, b_c20], c_29_20] and
   c_30_21 in AdderCarry[s_30_20, And[a_c10, b_c20], c_29_20] and

   s_30_22 in AdderSum  [s_30_21, And[a_c09, b_c21], c_29_21] and
   c_30_22 in AdderCarry[s_30_21, And[a_c09, b_c21], c_29_21] and

   s_30_23 in AdderSum  [s_30_22, And[a_c08, b_c22], c_29_22] and
   c_30_23 in AdderCarry[s_30_22, And[a_c08, b_c22], c_29_22] and

   s_30_24 in AdderSum  [s_30_23, And[a_c07, b_c23], c_29_23] and
   c_30_24 in AdderCarry[s_30_23, And[a_c07, b_c23], c_29_23] and

   s_30_25 in AdderSum  [s_30_24, And[a_c06, b_c24], c_29_24] and
   c_30_25 in AdderCarry[s_30_24, And[a_c06, b_c24], c_29_24] and

   s_30_26 in AdderSum  [s_30_25, And[a_c05, b_c25], c_29_25] and
   c_30_26 in AdderCarry[s_30_25, And[a_c05, b_c25], c_29_25] and

   s_30_27 in AdderSum  [s_30_26, And[a_c04, b_c26], c_29_26] and
   c_30_27 in AdderCarry[s_30_26, And[a_c04, b_c26], c_29_26] and

   s_30_28 in AdderSum  [s_30_27, And[a_c03, b_c27], c_29_27] and
   c_30_28 in AdderCarry[s_30_27, And[a_c03, b_c27], c_29_27] and

   s_30_29 in AdderSum  [s_30_28, And[a_c02, b_c28], c_29_28] and
   c_30_29 in AdderCarry[s_30_28, And[a_c02, b_c28], c_29_28] and

   s_30_30 in AdderSum  [s_30_29, And[a_c01, b_c29], c_29_29] and
   c_30_30 in AdderCarry[s_30_29, And[a_c01, b_c29], c_29_29] and

   s_30_31 in AdderSum  [s_30_30, And[a_c00, b_c30], c_29_30] and
   c_30_31 in AdderCarry[s_30_30, And[a_c00, b_c30], c_29_30] and
   s_31_0 in false and
   s_31_1 in AdderSum  [s_31_0, And[a_c30, b_c01], c_30_0] and
   c_31_1 in AdderCarry[s_31_0, And[a_c30, b_c01], c_30_0] and
   s_31_2 in AdderSum  [s_31_1, And[a_c29, b_c02], c_30_1] and
   c_31_2 in AdderCarry[s_31_1, And[a_c29, b_c02], c_30_1] and
   s_31_3 in AdderSum  [s_31_2, And[a_c28, b_c03], c_30_2] and
   c_31_3 in AdderCarry[s_31_2, And[a_c28, b_c03], c_30_2] and
   s_31_4 in AdderSum  [s_31_3, And[a_c27, b_c04], c_30_3] and
   c_31_4 in AdderCarry[s_31_3, And[a_c27, b_c04], c_30_3] and
   s_31_5 in AdderSum  [s_31_4, And[a_c26, b_c05], c_30_4] and
   c_31_5 in AdderCarry[s_31_4, And[a_c26, b_c05], c_30_4] and
   s_31_6 in AdderSum  [s_31_5, And[a_c25, b_c06], c_30_5] and
   c_31_6 in AdderCarry[s_31_5, And[a_c25, b_c06], c_30_5] and
   s_31_7 in AdderSum  [s_31_6, And[a_c24, b_c07], c_30_6] and
   c_31_7 in AdderCarry[s_31_6, And[a_c24, b_c07], c_30_6] and
   s_31_8 in AdderSum  [s_31_7, And[a_c23, b_c08], c_30_7] and
   c_31_8 in AdderCarry[s_31_7, And[a_c23, b_c08], c_30_7] and
   s_31_9 in AdderSum  [s_31_8, And[a_c22, b_c09], c_30_8] and
   c_31_9 in AdderCarry[s_31_8, And[a_c22, b_c09], c_30_8] and
   s_31_10 in AdderSum  [s_31_9, And[a_c21, b_c10], c_30_9] and
   c_31_10 in AdderCarry[s_31_9, And[a_c21, b_c10], c_30_9] and
   s_31_11 in AdderSum  [s_31_10, And[a_c20, b_c11], c_30_10] and
   c_31_11 in AdderCarry[s_31_10, And[a_c20, b_c11], c_30_10] and
   s_31_12 in AdderSum  [s_31_11, And[a_c19, b_c12], c_30_11] and
   c_31_12 in AdderCarry[s_31_11, And[a_c19, b_c12], c_30_11] and
   s_31_13 in AdderSum  [s_31_12, And[a_c18, b_c13], c_30_12] and
   c_31_13 in AdderCarry[s_31_12, And[a_c18, b_c13], c_30_12] and
   s_31_14 in AdderSum  [s_31_13, And[a_c17, b_c14], c_30_13] and
   c_31_14 in AdderCarry[s_31_13, And[a_c17, b_c14], c_30_13] and
   s_31_15 in AdderSum  [s_31_14, And[a_c16, b_c15], c_30_14] and
   c_31_15 in AdderCarry[s_31_14, And[a_c16, b_c15], c_30_14] and
   s_31_16 in AdderSum  [s_31_15, And[a_c15, b_c16], c_30_15] and
   c_31_16 in AdderCarry[s_31_15, And[a_c15, b_c16], c_30_15] and
   s_31_17 in AdderSum  [s_31_16, And[a_c14, b_c17], c_30_16] and
   c_31_17 in AdderCarry[s_31_16, And[a_c14, b_c17], c_30_16] and
   s_31_18 in AdderSum  [s_31_17, And[a_c13, b_c18], c_30_17] and
   c_31_18 in AdderCarry[s_31_17, And[a_c13, b_c18], c_30_17] and
   s_31_19 in AdderSum  [s_31_18, And[a_c12, b_c19], c_30_18] and
   c_31_19 in AdderCarry[s_31_18, And[a_c12, b_c19], c_30_18] and
   s_31_20 in AdderSum  [s_31_19, And[a_c11, b_c20], c_30_19] and
   c_31_20 in AdderCarry[s_31_19, And[a_c11, b_c20], c_30_19] and
   s_31_21 in AdderSum  [s_31_20, And[a_c10, b_c21], c_30_20] and
   c_31_21 in AdderCarry[s_31_20, And[a_c10, b_c21], c_30_20] and
   s_31_22 in AdderSum  [s_31_21, And[a_c09, b_c22], c_30_21] and
   c_31_22 in AdderCarry[s_31_21, And[a_c09, b_c22], c_30_21] and
   s_31_23 in AdderSum  [s_31_22, And[a_c08, b_c23], c_30_22] and
   c_31_23 in AdderCarry[s_31_22, And[a_c08, b_c23], c_30_22] and
   s_31_24 in AdderSum  [s_31_23, And[a_c07, b_c24], c_30_23] and
   c_31_24 in AdderCarry[s_31_23, And[a_c07, b_c24], c_30_23] and
   s_31_25 in AdderSum  [s_31_24, And[a_c06, b_c25], c_30_24] and
   c_31_25 in AdderCarry[s_31_24, And[a_c06, b_c25], c_30_24] and
   s_31_26 in AdderSum  [s_31_25, And[a_c05, b_c26], c_30_25] and
   c_31_26 in AdderCarry[s_31_25, And[a_c05, b_c26], c_30_25] and
   s_31_27 in AdderSum  [s_31_26, And[a_c04, b_c27], c_30_26] and
   c_31_27 in AdderCarry[s_31_26, And[a_c04, b_c27], c_30_26] and
   s_31_28 in AdderSum  [s_31_27, And[a_c03, b_c28], c_30_27] and
   c_31_28 in AdderCarry[s_31_27, And[a_c03, b_c28], c_30_27] and
   s_31_29 in AdderSum  [s_31_28, And[a_c02, b_c29], c_30_28] and
   c_31_29 in AdderCarry[s_31_28, And[a_c02, b_c29], c_30_28] and
   s_31_30 in AdderSum  [s_31_29, And[a_c01, b_c30], c_30_29] and
   c_31_30 in AdderCarry[s_31_29, And[a_c01, b_c30], c_30_29] and
   s_31_31 in AdderSum  [s_31_30, c_30_30, c_30_31] and
   c_31_31 in AdderCarry[s_31_30, c_30_30, c_30_31] and
   s_31_32 in s_31_31 and
   (
      t in false => (
         result.b00 in s_0_1 and
         result.b01 in s_1_2 and
         result.b02 in s_2_3 and
         result.b03 in s_3_4 and
         result.b04 in s_4_5 and
         result.b05 in s_5_6 and
         result.b06 in s_6_7 and
         result.b07 in s_7_8 and
         result.b08 in s_8_9 and
         result.b09 in s_9_10 and
         result.b10 in s_10_11 and
         result.b11 in s_11_12 and
         result.b12 in s_12_13 and
         result.b13 in s_13_14 and
         result.b14 in s_14_15 and
         result.b15 in s_15_16 and
         result.b16 in s_16_17 and
         result.b17 in s_17_18 and
         result.b18 in s_18_19 and
         result.b19 in s_19_20 and
         result.b20 in s_20_21 and
         result.b21 in s_21_22 and
         result.b22 in s_22_23 and
         result.b23 in s_23_24 and
         result.b24 in s_24_25 and
         result.b25 in s_25_26 and
         result.b26 in s_26_27 and
         result.b27 in s_27_28 and
         result.b28 in s_28_29 and
         result.b29 in s_29_30 and
         result.b30 in s_30_31 and
         result.b31 in s_31_32 
      ) else (
         result.b00 in s_0_1 and
         result.b01 in Xor[Not[s_1_2], Not[s_0_1]] and
         result.b02 in Xor[Not[s_2_3], And[Not[s_1_2], Xor[Not[s_1_2], result.b01]]] and
         result.b03 in Xor[Not[s_3_4], And[Not[s_2_3], Xor[Not[s_2_3], result.b02]]] and
         result.b04 in Xor[Not[s_4_5], And[Not[s_3_4], Xor[Not[s_3_4], result.b03]]] and
         result.b05 in Xor[Not[s_5_6], And[Not[s_4_5], Xor[Not[s_4_5], result.b04]]] and
         result.b06 in Xor[Not[s_6_7], And[Not[s_5_6], Xor[Not[s_5_6], result.b05]]] and
         result.b07 in Xor[Not[s_7_8], And[Not[s_6_7], Xor[Not[s_6_7], result.b06]]] and
         result.b08 in Xor[Not[s_8_9], And[Not[s_7_8], Xor[Not[s_7_8], result.b07]]] and
         result.b09 in Xor[Not[s_9_10], And[Not[s_8_9], Xor[Not[s_8_9], result.b08]]] and
         result.b10 in Xor[Not[s_10_11], And[Not[s_9_10], Xor[Not[s_9_10], result.b09]]] and
         result.b11 in Xor[Not[s_11_12], And[Not[s_10_11], Xor[Not[s_10_11], result.b10]]] and
         result.b12 in Xor[Not[s_12_13], And[Not[s_11_12], Xor[Not[s_11_12], result.b11]]] and
         result.b13 in Xor[Not[s_13_14], And[Not[s_12_13], Xor[Not[s_12_13], result.b12]]] and
         result.b14 in Xor[Not[s_14_15], And[Not[s_13_14], Xor[Not[s_13_14], result.b13]]] and
         result.b15 in Xor[Not[s_15_16], And[Not[s_14_15], Xor[Not[s_14_15], result.b14]]] and
         result.b16 in Xor[Not[s_16_17], And[Not[s_15_16], Xor[Not[s_15_16], result.b15]]] and
         result.b17 in Xor[Not[s_17_18], And[Not[s_16_17], Xor[Not[s_16_17], result.b16]]] and
         result.b18 in Xor[Not[s_18_19], And[Not[s_17_18], Xor[Not[s_17_18], result.b17]]] and
         result.b19 in Xor[Not[s_19_20], And[Not[s_18_19], Xor[Not[s_18_19], result.b18]]] and
         result.b20 in Xor[Not[s_20_21], And[Not[s_19_20], Xor[Not[s_19_20], result.b19]]] and
         result.b21 in Xor[Not[s_21_22], And[Not[s_20_21], Xor[Not[s_20_21], result.b20]]] and
         result.b22 in Xor[Not[s_22_23], And[Not[s_21_22], Xor[Not[s_21_22], result.b21]]] and
         result.b23 in Xor[Not[s_23_24], And[Not[s_22_23], Xor[Not[s_22_23], result.b22]]] and
         result.b24 in Xor[Not[s_24_25], And[Not[s_23_24], Xor[Not[s_23_24], result.b23]]] and
         result.b25 in Xor[Not[s_25_26], And[Not[s_24_25], Xor[Not[s_24_25], result.b24]]] and
         result.b26 in Xor[Not[s_26_27], And[Not[s_25_26], Xor[Not[s_25_26], result.b25]]] and
         result.b27 in Xor[Not[s_27_28], And[Not[s_26_27], Xor[Not[s_26_27], result.b26]]] and
         result.b28 in Xor[Not[s_28_29], And[Not[s_27_28], Xor[Not[s_27_28], result.b27]]] and
         result.b29 in Xor[Not[s_29_30], And[Not[s_28_29], Xor[Not[s_28_29], result.b28]]] and
         result.b30 in Xor[Not[s_30_31], And[Not[s_29_30], Xor[Not[s_29_30], result.b29]]] and
         result.b31 in Xor[Not[s_31_32], And[Not[s_30_31], Xor[Not[s_30_31], result.b30]]] 
      )
   )
   and overflow in (true in (
      c_31_1 + c_31_2 + c_31_3 + c_31_4 + c_31_5 + c_31_6 + c_31_7 + c_31_8 + c_31_9 + c_31_10 + c_31_11 + c_31_12 + c_31_13 + c_31_14 + c_31_15 + c_31_16 + c_31_17 + c_31_18 + c_31_19 + c_31_20 + c_31_21 + c_31_22 + c_31_23 + c_31_24 + c_31_25 + c_31_26 + c_31_27 + c_31_28 + c_31_29 + c_31_30 + c_31_31
    + And[a_c02, b_c30]
    + And[a_c03, b_c29] + And[a_c03, b_c30]
    + And[a_c04, b_c28] + And[a_c04, b_c29] + And[a_c04, b_c30]
    + And[a_c05, b_c27] + And[a_c05, b_c28] + And[a_c05, b_c29] + And[a_c05, b_c30]
    + And[a_c06, b_c26] + And[a_c06, b_c27] + And[a_c06, b_c28] + And[a_c06, b_c29] + And[a_c06, b_c30]
    + And[a_c07, b_c25] + And[a_c07, b_c26] + And[a_c07, b_c27] + And[a_c07, b_c28] + And[a_c07, b_c29] + And[a_c07, b_c30]
    + And[a_c08, b_c24] + And[a_c08, b_c25] + And[a_c08, b_c26] + And[a_c08, b_c27] + And[a_c08, b_c28] + And[a_c08, b_c29] + And[a_c08, b_c30]
    + And[a_c09, b_c23] + And[a_c09, b_c24] + And[a_c09, b_c25] + And[a_c09, b_c26] + And[a_c09, b_c27] + And[a_c09, b_c28] + And[a_c09, b_c29] + And[a_c09, b_c30]
    + And[a_c10, b_c22] + And[a_c10, b_c23] + And[a_c10, b_c24] + And[a_c10, b_c25] + And[a_c10, b_c26] + And[a_c10, b_c27] + And[a_c10, b_c28] + And[a_c10, b_c29] + And[a_c10, b_c30]
    + And[a_c11, b_c21] + And[a_c11, b_c22] + And[a_c11, b_c23] + And[a_c11, b_c24] + And[a_c11, b_c25] + And[a_c11, b_c26] + And[a_c11, b_c27] + And[a_c11, b_c28] + And[a_c11, b_c29] + And[a_c11, b_c30]
    + And[a_c12, b_c20] + And[a_c12, b_c21] + And[a_c12, b_c22] + And[a_c12, b_c23] + And[a_c12, b_c24] + And[a_c12, b_c25] + And[a_c12, b_c26] + And[a_c12, b_c27] + And[a_c12, b_c28] + And[a_c12, b_c29] + And[a_c12, b_c30]
    + And[a_c13, b_c19] + And[a_c13, b_c20] + And[a_c13, b_c21] + And[a_c13, b_c22] + And[a_c13, b_c23] + And[a_c13, b_c24] + And[a_c13, b_c25] + And[a_c13, b_c26] + And[a_c13, b_c27] + And[a_c13, b_c28] + And[a_c13, b_c29] + And[a_c13, b_c30]
    + And[a_c14, b_c18] + And[a_c14, b_c19] + And[a_c14, b_c20] + And[a_c14, b_c21] + And[a_c14, b_c22] + And[a_c14, b_c23] + And[a_c14, b_c24] + And[a_c14, b_c25] + And[a_c14, b_c26] + And[a_c14, b_c27] + And[a_c14, b_c28] + And[a_c14, b_c29] + And[a_c14, b_c30]
    + And[a_c15, b_c17] + And[a_c15, b_c18] + And[a_c15, b_c19] + And[a_c15, b_c20] + And[a_c15, b_c21] + And[a_c15, b_c22] + And[a_c15, b_c23] + And[a_c15, b_c24] + And[a_c15, b_c25] + And[a_c15, b_c26] + And[a_c15, b_c27] + And[a_c15, b_c28] + And[a_c15, b_c29] + And[a_c15, b_c30]
    + And[a_c16, b_c16] + And[a_c16, b_c17] + And[a_c16, b_c18] + And[a_c16, b_c19] + And[a_c16, b_c20] + And[a_c16, b_c21] + And[a_c16, b_c22] + And[a_c16, b_c23] + And[a_c16, b_c24] + And[a_c16, b_c25] + And[a_c16, b_c26] + And[a_c16, b_c27] + And[a_c16, b_c28] + And[a_c16, b_c29] + And[a_c16, b_c30]
    + And[a_c17, b_c15] + And[a_c17, b_c16] + And[a_c17, b_c17] + And[a_c17, b_c18] + And[a_c17, b_c19] + And[a_c17, b_c20] + And[a_c17, b_c21] + And[a_c17, b_c22] + And[a_c17, b_c23] + And[a_c17, b_c24] + And[a_c17, b_c25] + And[a_c17, b_c26] + And[a_c17, b_c27] + And[a_c17, b_c28] + And[a_c17, b_c29] + And[a_c17, b_c30]
    + And[a_c18, b_c14] + And[a_c18, b_c15] + And[a_c18, b_c16] + And[a_c18, b_c17] + And[a_c18, b_c18] + And[a_c18, b_c19] + And[a_c18, b_c20] + And[a_c18, b_c21] + And[a_c18, b_c22] + And[a_c18, b_c23] + And[a_c18, b_c24] + And[a_c18, b_c25] + And[a_c18, b_c26] + And[a_c18, b_c27] + And[a_c18, b_c28] + And[a_c18, b_c29] + And[a_c18, b_c30]
    + And[a_c19, b_c13] + And[a_c19, b_c14] + And[a_c19, b_c15] + And[a_c19, b_c16] + And[a_c19, b_c17] + And[a_c19, b_c18] + And[a_c19, b_c19] + And[a_c19, b_c20] + And[a_c19, b_c21] + And[a_c19, b_c22] + And[a_c19, b_c23] + And[a_c19, b_c24] + And[a_c19, b_c25] + And[a_c19, b_c26] + And[a_c19, b_c27] + And[a_c19, b_c28] + And[a_c19, b_c29] + And[a_c19, b_c30]
    + And[a_c20, b_c12] + And[a_c20, b_c13] + And[a_c20, b_c14] + And[a_c20, b_c15] + And[a_c20, b_c16] + And[a_c20, b_c17] + And[a_c20, b_c18] + And[a_c20, b_c19] + And[a_c20, b_c20] + And[a_c20, b_c21] + And[a_c20, b_c22] + And[a_c20, b_c23] + And[a_c20, b_c24] + And[a_c20, b_c25] + And[a_c20, b_c26] + And[a_c20, b_c27] + And[a_c20, b_c28] + And[a_c20, b_c29] + And[a_c20, b_c30]
    + And[a_c21, b_c11] + And[a_c21, b_c12] + And[a_c21, b_c13] + And[a_c21, b_c14] + And[a_c21, b_c15] + And[a_c21, b_c16] + And[a_c21, b_c17] + And[a_c21, b_c18] + And[a_c21, b_c19] + And[a_c21, b_c20] + And[a_c21, b_c21] + And[a_c21, b_c22] + And[a_c21, b_c23] + And[a_c21, b_c24] + And[a_c21, b_c25] + And[a_c21, b_c26] + And[a_c21, b_c27] + And[a_c21, b_c28] + And[a_c21, b_c29] + And[a_c21, b_c30]
    + And[a_c22, b_c10] + And[a_c22, b_c11] + And[a_c22, b_c12] + And[a_c22, b_c13] + And[a_c22, b_c14] + And[a_c22, b_c15] + And[a_c22, b_c16] + And[a_c22, b_c17] + And[a_c22, b_c18] + And[a_c22, b_c19] + And[a_c22, b_c20] + And[a_c22, b_c21] + And[a_c22, b_c22] + And[a_c22, b_c23] + And[a_c22, b_c24] + And[a_c22, b_c25] + And[a_c22, b_c26] + And[a_c22, b_c27] + And[a_c22, b_c28] + And[a_c22, b_c29] + And[a_c22, b_c30]
    + And[a_c23, b_c09] + And[a_c23, b_c10] + And[a_c23, b_c11] + And[a_c23, b_c12] + And[a_c23, b_c13] + And[a_c23, b_c14] + And[a_c23, b_c15] + And[a_c23, b_c16] + And[a_c23, b_c17] + And[a_c23, b_c18] + And[a_c23, b_c19] + And[a_c23, b_c20] + And[a_c23, b_c21] + And[a_c23, b_c22] + And[a_c23, b_c23] + And[a_c23, b_c24] + And[a_c23, b_c25] + And[a_c23, b_c26] + And[a_c23, b_c27] + And[a_c23, b_c28] + And[a_c23, b_c29] + And[a_c23, b_c30]
    + And[a_c24, b_c08] + And[a_c24, b_c09] + And[a_c24, b_c10] + And[a_c24, b_c11] + And[a_c24, b_c12] + And[a_c24, b_c13] + And[a_c24, b_c14] + And[a_c24, b_c15] + And[a_c24, b_c16] + And[a_c24, b_c17] + And[a_c24, b_c18] + And[a_c24, b_c19] + And[a_c24, b_c20] + And[a_c24, b_c21] + And[a_c24, b_c22] + And[a_c24, b_c23] + And[a_c24, b_c24] + And[a_c24, b_c25] + And[a_c24, b_c26] + And[a_c24, b_c27] + And[a_c24, b_c28] + And[a_c24, b_c29] + And[a_c24, b_c30]
    + And[a_c25, b_c07] + And[a_c25, b_c08] + And[a_c25, b_c09] + And[a_c25, b_c10] + And[a_c25, b_c11] + And[a_c25, b_c12] + And[a_c25, b_c13] + And[a_c25, b_c14] + And[a_c25, b_c15] + And[a_c25, b_c16] + And[a_c25, b_c17] + And[a_c25, b_c18] + And[a_c25, b_c19] + And[a_c25, b_c20] + And[a_c25, b_c21] + And[a_c25, b_c22] + And[a_c25, b_c23] + And[a_c25, b_c24] + And[a_c25, b_c25] + And[a_c25, b_c26] + And[a_c25, b_c27] + And[a_c25, b_c28] + And[a_c25, b_c29] + And[a_c25, b_c30]
    + And[a_c26, b_c06] + And[a_c26, b_c07] + And[a_c26, b_c08] + And[a_c26, b_c09] + And[a_c26, b_c10] + And[a_c26, b_c11] + And[a_c26, b_c12] + And[a_c26, b_c13] + And[a_c26, b_c14] + And[a_c26, b_c15] + And[a_c26, b_c16] + And[a_c26, b_c17] + And[a_c26, b_c18] + And[a_c26, b_c19] + And[a_c26, b_c20] + And[a_c26, b_c21] + And[a_c26, b_c22] + And[a_c26, b_c23] + And[a_c26, b_c24] + And[a_c26, b_c25] + And[a_c26, b_c26] + And[a_c26, b_c27] + And[a_c26, b_c28] + And[a_c26, b_c29] + And[a_c26, b_c30]
    + And[a_c27, b_c05] + And[a_c27, b_c06] + And[a_c27, b_c07] + And[a_c27, b_c08] + And[a_c27, b_c09] + And[a_c27, b_c10] + And[a_c27, b_c11] + And[a_c27, b_c12] + And[a_c27, b_c13] + And[a_c27, b_c14] + And[a_c27, b_c15] + And[a_c27, b_c16] + And[a_c27, b_c17] + And[a_c27, b_c18] + And[a_c27, b_c19] + And[a_c27, b_c20] + And[a_c27, b_c21] + And[a_c27, b_c22] + And[a_c27, b_c23] + And[a_c27, b_c24] + And[a_c27, b_c25] + And[a_c27, b_c26] + And[a_c27, b_c27] + And[a_c27, b_c28] + And[a_c27, b_c29] + And[a_c27, b_c30]
    + And[a_c28, b_c04] + And[a_c28, b_c05] + And[a_c28, b_c06] + And[a_c28, b_c07] + And[a_c28, b_c08] + And[a_c28, b_c09] + And[a_c28, b_c10] + And[a_c28, b_c11] + And[a_c28, b_c12] + And[a_c28, b_c13] + And[a_c28, b_c14] + And[a_c28, b_c15] + And[a_c28, b_c16] + And[a_c28, b_c17] + And[a_c28, b_c18] + And[a_c28, b_c19] + And[a_c28, b_c20] + And[a_c28, b_c21] + And[a_c28, b_c22] + And[a_c28, b_c23] + And[a_c28, b_c24] + And[a_c28, b_c25] + And[a_c28, b_c26] + And[a_c28, b_c27] + And[a_c28, b_c28] + And[a_c28, b_c29] + And[a_c28, b_c30]
    + And[a_c29, b_c03] + And[a_c29, b_c04] + And[a_c29, b_c05] + And[a_c29, b_c06] + And[a_c29, b_c07] + And[a_c29, b_c08] + And[a_c29, b_c09] + And[a_c29, b_c10] + And[a_c29, b_c11] + And[a_c29, b_c12] + And[a_c29, b_c13] + And[a_c29, b_c14] + And[a_c29, b_c15] + And[a_c29, b_c16] + And[a_c29, b_c17] + And[a_c29, b_c18] + And[a_c29, b_c19] + And[a_c29, b_c20] + And[a_c29, b_c21] + And[a_c29, b_c22] + And[a_c29, b_c23] + And[a_c29, b_c24] + And[a_c29, b_c25] + And[a_c29, b_c26] + And[a_c29, b_c27] + And[a_c29, b_c28] + And[a_c29, b_c29] + And[a_c29, b_c30]
    + And[a_c30, b_c02] + And[a_c30, b_c03] + And[a_c30, b_c04] + And[a_c30, b_c05] + And[a_c30, b_c06] + And[a_c30, b_c07] + And[a_c30, b_c08] + And[a_c30, b_c09] + And[a_c30, b_c10] + And[a_c30, b_c11] + And[a_c30, b_c12] + And[a_c30, b_c13] + And[a_c30, b_c14] + And[a_c30, b_c15] + And[a_c30, b_c16] + And[a_c30, b_c17] + And[a_c30, b_c18] + And[a_c30, b_c19] + And[a_c30, b_c20] + And[a_c30, b_c21] + And[a_c30, b_c22] + And[a_c30, b_c23] + And[a_c30, b_c24] + And[a_c30, b_c25] + And[a_c30, b_c26] + And[a_c30, b_c27] + And[a_c30, b_c28] + And[a_c30, b_c29] + And[a_c30, b_c30]
	+ (t in false => result.b31 else And[Not[result.b31], Not[And[Not[s_31_32], Xor[Not[s_31_32], result.b31]]]] )
   ) => true else false)
}

pred pred_java_primitive_integer_value_lte_zero[a: JavaPrimitiveIntegerValue] {
   pred_java_primitive_integer_value_lt_zero[a] or pred_java_primitive_integer_value_eq_zero[a] 
}

pred pred_java_primitive_integer_value_gte_zero[a: JavaPrimitiveIntegerValue] {
   pred_java_primitive_integer_value_gt_zero[a] or pred_java_primitive_integer_value_eq_zero[a] 
}

pred pred_java_primitive_integer_value_gt_zero[a: JavaPrimitiveIntegerValue] {
   a.b31 in false and not pred_java_primitive_integer_value_eq_zero[a] 
}

pred pred_java_primitive_integer_value_gte[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue] {
  pred_java_primitive_integer_value_gt[a, b] or pred_java_primitive_integer_value_eq[a, b]
}

pred pred_java_primitive_integer_value_lt[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue] { 
  not pred_java_primitive_integer_value_gte[a, b] 
} 

pred pred_java_primitive_integer_value_lt_zero[a: JavaPrimitiveIntegerValue] {
  a.b31 in true
}

pred pred_java_primitive_integer_value_lte[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue] {
  not pred_java_primitive_integer_value_gt[a, b]
}

pred pred_java_primitive_integer_value_neq[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue] {
  not pred_java_primitive_integer_value_eq[a, b]
}

pred pred_java_primitive_integer_value_gt[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue] {
   (a.b31 in false and b.b31 in true)
   or (a.b31 = b.b31) and (a.b30 in true and b.b30 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 in true and b.b29 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 in true and b.b28 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 in true and b.b27 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 in true and b.b26 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 in true and b.b25 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 in true and b.b24 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 in true and b.b23 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 in true and b.b22 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 in true and b.b21 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 in true and b.b20 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 in true and b.b19 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 in true and b.b18 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 in true and b.b17 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 in true and b.b16 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 in true and b.b15 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 in true and b.b14 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 in true and b.b13 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 = b.b13) and (a.b12 in true and b.b12 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 = b.b13) and (a.b12 = b.b12) and (a.b11 in true and b.b11 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 = b.b13) and (a.b12 = b.b12) and (a.b11 = b.b11) and (a.b10 in true and b.b10 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 = b.b13) and (a.b12 = b.b12) and (a.b11 = b.b11) and (a.b10 = b.b10) and (a.b09 in true and b.b09 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 = b.b13) and (a.b12 = b.b12) and (a.b11 = b.b11) and (a.b10 = b.b10) and (a.b09 = b.b09) and (a.b08 in true and b.b08 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 = b.b13) and (a.b12 = b.b12) and (a.b11 = b.b11) and (a.b10 = b.b10) and (a.b09 = b.b09) and (a.b08 = b.b08) and (a.b07 in true and b.b07 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 = b.b13) and (a.b12 = b.b12) and (a.b11 = b.b11) and (a.b10 = b.b10) and (a.b09 = b.b09) and (a.b08 = b.b08) and (a.b07 = b.b07) and (a.b06 in true and b.b06 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 = b.b13) and (a.b12 = b.b12) and (a.b11 = b.b11) and (a.b10 = b.b10) and (a.b09 = b.b09) and (a.b08 = b.b08) and (a.b07 = b.b07) and (a.b06 = b.b06) and (a.b05 in true and b.b05 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 = b.b13) and (a.b12 = b.b12) and (a.b11 = b.b11) and (a.b10 = b.b10) and (a.b09 = b.b09) and (a.b08 = b.b08) and (a.b07 = b.b07) and (a.b06 = b.b06) and (a.b05 = b.b05) and (a.b04 in true and b.b04 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 = b.b13) and (a.b12 = b.b12) and (a.b11 = b.b11) and (a.b10 = b.b10) and (a.b09 = b.b09) and (a.b08 = b.b08) and (a.b07 = b.b07) and (a.b06 = b.b06) and (a.b05 = b.b05) and (a.b04 = b.b04) and (a.b03 in true and b.b03 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 = b.b13) and (a.b12 = b.b12) and (a.b11 = b.b11) and (a.b10 = b.b10) and (a.b09 = b.b09) and (a.b08 = b.b08) and (a.b07 = b.b07) and (a.b06 = b.b06) and (a.b05 = b.b05) and (a.b04 = b.b04) and (a.b03 = b.b03) and (a.b02 in true and b.b02 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 = b.b13) and (a.b12 = b.b12) and (a.b11 = b.b11) and (a.b10 = b.b10) and (a.b09 = b.b09) and (a.b08 = b.b08) and (a.b07 = b.b07) and (a.b06 = b.b06) and (a.b05 = b.b05) and (a.b04 = b.b04) and (a.b03 = b.b03) and (a.b02 = b.b02) and (a.b01 in true and b.b01 in false) 
   or (a.b31 = b.b31) and (a.b30 = b.b30) and (a.b29 = b.b29) and (a.b28 = b.b28) and (a.b27 = b.b27) and (a.b26 = b.b26) and (a.b25 = b.b25) and (a.b24 = b.b24) and (a.b23 = b.b23) and (a.b22 = b.b22) and (a.b21 = b.b21) and (a.b20 = b.b20) and (a.b19 = b.b19) and (a.b18 = b.b18) and (a.b17 = b.b17) and (a.b16 = b.b16) and (a.b15 = b.b15) and (a.b14 = b.b14) and (a.b13 = b.b13) and (a.b12 = b.b12) and (a.b11 = b.b11) and (a.b10 = b.b10) and (a.b09 = b.b09) and (a.b08 = b.b08) and (a.b07 = b.b07) and (a.b06 = b.b06) and (a.b05 = b.b05) and (a.b04 = b.b04) and (a.b03 = b.b03) and (a.b02 = b.b02) and (a.b01 = b.b01) and (a.b00 in true and b.b00 in false) 
}


pred pred_java_primitive_integer_value_eq_zero[a: JavaPrimitiveIntegerValue] {
   a.b00 in false 
   a.b01 in false 
   a.b02 in false 
   a.b03 in false 
   a.b04 in false 
   a.b05 in false 
   a.b06 in false 
   a.b07 in false 
   a.b08 in false 
   a.b09 in false 
   a.b10 in false 
   a.b11 in false 
   a.b12 in false 
   a.b13 in false 
   a.b14 in false 
   a.b15 in false 
   a.b16 in false 
   a.b17 in false 
   a.b18 in false 
   a.b19 in false 
   a.b20 in false 
   a.b21 in false 
   a.b22 in false 
   a.b23 in false 
   a.b24 in false 
   a.b25 in false 
   a.b26 in false 
   a.b27 in false 
   a.b28 in false 
   a.b29 in false 
   a.b30 in false 
   a.b31 in false 
}


pred pred_java_primitive_integer_value_eq[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue] {
   a.b00 = b.b00
   a.b01 = b.b01
   a.b02 = b.b02
   a.b03 = b.b03
   a.b04 = b.b04
   a.b05 = b.b05
   a.b06 = b.b06
   a.b07 = b.b07
   a.b08 = b.b08
   a.b09 = b.b09
   a.b10 = b.b10
   a.b11 = b.b11
   a.b12 = b.b12
   a.b13 = b.b13
   a.b14 = b.b14
   a.b15 = b.b15
   a.b16 = b.b16
   a.b17 = b.b17
   a.b18 = b.b18
   a.b19 = b.b19
   a.b20 = b.b20
   a.b21 = b.b21
   a.b22 = b.b22
   a.b23 = b.b23
   a.b24 = b.b24
   a.b25 = b.b25
   a.b26 = b.b26
   a.b27 = b.b27
   a.b28 = b.b28
   a.b29 = b.b29
   a.b30 = b.b30
   a.b31 = b.b31
}


pred pred_java_primitive_integer_value_abs[a: JavaPrimitiveIntegerValue, abs: JavaPrimitiveIntegerValue] {
  pred_java_primitive_integer_value_lt_zero[a] 
  => pred_java_primitive_integer_decrement[a, abs] 
  else pred_java_primitive_integer_value_eq[a, abs]
}

pred pred_java_primitive_integer_value_sub[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue, result: JavaPrimitiveIntegerValue, overflow: boolean] { 
	pred_java_primitive_integer_value_add[result, b, a, overflow]
}

pred pred_java_primitive_integer_value_add[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue, result: JavaPrimitiveIntegerValue, overflow: boolean] { 
   let c_0 = false | 
   let s_0 = AdderSum[a.b00, b.b00, c_0] | 
   let c_1 = AdderCarry[a.b00, b.b00, c_0] | 
   let s_1 = AdderSum[a.b01, b.b01, c_1] | 
   let c_2 = AdderCarry[a.b01, b.b01, c_1] | 
   let s_2 = AdderSum[a.b02, b.b02, c_2] | 
   let c_3 = AdderCarry[a.b02, b.b02, c_2] | 
   let s_3 = AdderSum[a.b03, b.b03, c_3] | 
   let c_4 = AdderCarry[a.b03, b.b03, c_3] | 
   let s_4 = AdderSum[a.b04, b.b04, c_4] | 
   let c_5 = AdderCarry[a.b04, b.b04, c_4] | 
   let s_5 = AdderSum[a.b05, b.b05, c_5] | 
   let c_6 = AdderCarry[a.b05, b.b05, c_5] | 
   let s_6 = AdderSum[a.b06, b.b06, c_6] | 
   let c_7 = AdderCarry[a.b06, b.b06, c_6] | 
   let s_7 = AdderSum[a.b07, b.b07, c_7] | 
   let c_8 = AdderCarry[a.b07, b.b07, c_7] | 
   let s_8 = AdderSum[a.b08, b.b08, c_8] | 
   let c_9 = AdderCarry[a.b08, b.b08, c_8] | 
   let s_9 = AdderSum[a.b09, b.b09, c_9] | 
   let c_10 = AdderCarry[a.b09, b.b09, c_9] | 
   let s_10 = AdderSum[a.b10, b.b10, c_10] | 
   let c_11 = AdderCarry[a.b10, b.b10, c_10] | 
   let s_11 = AdderSum[a.b11, b.b11, c_11] | 
   let c_12 = AdderCarry[a.b11, b.b11, c_11] | 
   let s_12 = AdderSum[a.b12, b.b12, c_12] | 
   let c_13 = AdderCarry[a.b12, b.b12, c_12] | 
   let s_13 = AdderSum[a.b13, b.b13, c_13] | 
   let c_14 = AdderCarry[a.b13, b.b13, c_13] | 
   let s_14 = AdderSum[a.b14, b.b14, c_14] | 
   let c_15 = AdderCarry[a.b14, b.b14, c_14] | 
   let s_15 = AdderSum[a.b15, b.b15, c_15] | 
   let c_16 = AdderCarry[a.b15, b.b15, c_15] | 
   let s_16 = AdderSum[a.b16, b.b16, c_16] | 
   let c_17 = AdderCarry[a.b16, b.b16, c_16] | 
   let s_17 = AdderSum[a.b17, b.b17, c_17] | 
   let c_18 = AdderCarry[a.b17, b.b17, c_17] | 
   let s_18 = AdderSum[a.b18, b.b18, c_18] | 
   let c_19 = AdderCarry[a.b18, b.b18, c_18] | 
   let s_19 = AdderSum[a.b19, b.b19, c_19] | 
   let c_20 = AdderCarry[a.b19, b.b19, c_19] | 
   let s_20 = AdderSum[a.b20, b.b20, c_20] | 
   let c_21 = AdderCarry[a.b20, b.b20, c_20] | 
   let s_21 = AdderSum[a.b21, b.b21, c_21] | 
   let c_22 = AdderCarry[a.b21, b.b21, c_21] | 
   let s_22 = AdderSum[a.b22, b.b22, c_22] | 
   let c_23 = AdderCarry[a.b22, b.b22, c_22] | 
   let s_23 = AdderSum[a.b23, b.b23, c_23] | 
   let c_24 = AdderCarry[a.b23, b.b23, c_23] | 
   let s_24 = AdderSum[a.b24, b.b24, c_24] | 
   let c_25 = AdderCarry[a.b24, b.b24, c_24] | 
   let s_25 = AdderSum[a.b25, b.b25, c_25] | 
   let c_26 = AdderCarry[a.b25, b.b25, c_25] | 
   let s_26 = AdderSum[a.b26, b.b26, c_26] | 
   let c_27 = AdderCarry[a.b26, b.b26, c_26] | 
   let s_27 = AdderSum[a.b27, b.b27, c_27] | 
   let c_28 = AdderCarry[a.b27, b.b27, c_27] | 
   let s_28 = AdderSum[a.b28, b.b28, c_28] | 
   let c_29 = AdderCarry[a.b28, b.b28, c_28] | 
   let s_29 = AdderSum[a.b29, b.b29, c_29] | 
   let c_30 = AdderCarry[a.b29, b.b29, c_29] | 
   let s_30 = AdderSum[a.b30, b.b30, c_30] | 
   let c_31 = AdderCarry[a.b30, b.b30, c_30] | 
   let s_31 = AdderSum[a.b31, b.b31, c_31] | 
   let c_32 = AdderCarry[a.b31, b.b31, c_31] | 
      result.b00 in s_0 and
      result.b01 in s_1 and
      result.b02 in s_2 and
      result.b03 in s_3 and
      result.b04 in s_4 and
      result.b05 in s_5 and
      result.b06 in s_6 and
      result.b07 in s_7 and
      result.b08 in s_8 and
      result.b09 in s_9 and
      result.b10 in s_10 and
      result.b11 in s_11 and
      result.b12 in s_12 and
      result.b13 in s_13 and
      result.b14 in s_14 and
      result.b15 in s_15 and
      result.b16 in s_16 and
      result.b17 in s_17 and
      result.b18 in s_18 and
      result.b19 in s_19 and
      result.b20 in s_20 and
      result.b21 in s_21 and
      result.b22 in s_22 and
      result.b23 in s_23 and
      result.b24 in s_24 and
      result.b25 in s_25 and
      result.b26 in s_26 and
      result.b27 in s_27 and
      result.b28 in s_28 and
      result.b29 in s_29 and
      result.b30 in s_30 and
      result.b31 in s_31 and
      overflow = (Xor[c_32, c_31])
}

pred pred_java_primitive_integer_value_decrement[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue] {
   a.b00 in b.b00 
   a.b01 in Xor [ Not[b.b01]  , And[Not[b.b00], Xor[Not[b.b00], a.b00]]] 
   a.b02 in Xor [ Not[b.b02]  , And[Not[b.b01], Xor[Not[b.b01], a.b01]]] 
   a.b03 in Xor [ Not[b.b03]  , And[Not[b.b02], Xor[Not[b.b02], a.b02]]] 
   a.b04 in Xor [ Not[b.b04]  , And[Not[b.b03], Xor[Not[b.b03], a.b03]]] 
   a.b05 in Xor [ Not[b.b05]  , And[Not[b.b04], Xor[Not[b.b04], a.b04]]] 
   a.b06 in Xor [ Not[b.b06]  , And[Not[b.b05], Xor[Not[b.b05], a.b05]]] 
   a.b07 in Xor [ Not[b.b07]  , And[Not[b.b06], Xor[Not[b.b06], a.b06]]] 
   a.b08 in Xor [ Not[b.b08]  , And[Not[b.b07], Xor[Not[b.b07], a.b07]]] 
   a.b09 in Xor [ Not[b.b09]  , And[Not[b.b08], Xor[Not[b.b08], a.b08]]] 
   a.b10 in Xor [ Not[b.b10]  , And[Not[b.b09], Xor[Not[b.b09], a.b09]]] 
   a.b11 in Xor [ Not[b.b11]  , And[Not[b.b10], Xor[Not[b.b10], a.b10]]] 
   a.b12 in Xor [ Not[b.b12]  , And[Not[b.b11], Xor[Not[b.b11], a.b11]]] 
   a.b13 in Xor [ Not[b.b13]  , And[Not[b.b12], Xor[Not[b.b12], a.b12]]] 
   a.b14 in Xor [ Not[b.b14]  , And[Not[b.b13], Xor[Not[b.b13], a.b13]]] 
   a.b15 in Xor [ Not[b.b15]  , And[Not[b.b14], Xor[Not[b.b14], a.b14]]] 
   a.b16 in Xor [ Not[b.b16]  , And[Not[b.b15], Xor[Not[b.b15], a.b15]]] 
   a.b17 in Xor [ Not[b.b17]  , And[Not[b.b16], Xor[Not[b.b16], a.b16]]] 
   a.b18 in Xor [ Not[b.b18]  , And[Not[b.b17], Xor[Not[b.b17], a.b17]]] 
   a.b19 in Xor [ Not[b.b19]  , And[Not[b.b18], Xor[Not[b.b18], a.b18]]] 
   a.b20 in Xor [ Not[b.b20]  , And[Not[b.b19], Xor[Not[b.b19], a.b19]]] 
   a.b21 in Xor [ Not[b.b21]  , And[Not[b.b20], Xor[Not[b.b20], a.b20]]] 
   a.b22 in Xor [ Not[b.b22]  , And[Not[b.b21], Xor[Not[b.b21], a.b21]]] 
   a.b23 in Xor [ Not[b.b23]  , And[Not[b.b22], Xor[Not[b.b22], a.b22]]] 
   a.b24 in Xor [ Not[b.b24]  , And[Not[b.b23], Xor[Not[b.b23], a.b23]]] 
   a.b25 in Xor [ Not[b.b25]  , And[Not[b.b24], Xor[Not[b.b24], a.b24]]] 
   a.b26 in Xor [ Not[b.b26]  , And[Not[b.b25], Xor[Not[b.b25], a.b25]]] 
   a.b27 in Xor [ Not[b.b27]  , And[Not[b.b26], Xor[Not[b.b26], a.b26]]] 
   a.b28 in Xor [ Not[b.b28]  , And[Not[b.b27], Xor[Not[b.b27], a.b27]]] 
   a.b29 in Xor [ Not[b.b29]  , And[Not[b.b28], Xor[Not[b.b28], a.b28]]] 
   a.b30 in Xor [ Not[b.b30]  , And[Not[b.b29], Xor[Not[b.b29], a.b29]]] 
   a.b31 in Xor [ Not[b.b31]  , And[Not[b.b30], Xor[Not[b.b30], a.b30]]] 
}

pred pred_java_primitive_integer_value_div[a: JavaPrimitiveIntegerValue, 
                                           b: JavaPrimitiveIntegerValue, 
                                           div: JavaPrimitiveIntegerValue] {
 some rem: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_div_rem[a,b,div,rem] 
}


pred pred_java_primitive_integer_value_div_rem[a: JavaPrimitiveIntegerValue, 
                                           b: JavaPrimitiveIntegerValue, 
                                           div: JavaPrimitiveIntegerValue, 
                                           rem: JavaPrimitiveIntegerValue] {
  ( some x : JavaPrimitiveIntegerValue | 
	pred_java_primitive_integer_value_mul[b, div, x, false] and 
	pred_java_primitive_integer_value_add[x, rem, a, false]) 
  and 
  (rem.b31 in true implies (rem.b30 in true or rem.b29 in true or rem.b28 in true or rem.b27 in true or rem.b26 in true or rem.b25 in true or rem.b24 in true or rem.b23 in true or rem.b22 in true or rem.b21 in true or rem.b20 in true or rem.b19 in true or rem.b18 in true or rem.b17 in true or rem.b16 in true or rem.b15 in true or rem.b14 in true or rem.b13 in true or rem.b12 in true or rem.b11 in true or rem.b10 in true or rem.b09 in true or rem.b08 in true or rem.b07 in true or rem.b06 in true or rem.b05 in true or rem.b04 in true or rem.b03 in true or rem.b02 in true or rem.b01 in true or rem.b00 in true)) 
  and 
  (some abs_rem, abs_b : JavaPrimitiveIntegerValue | { pred_java_primitive_integer_value_abs[b, abs_b] and 
                                                       pred_java_primitive_integer_value_abs[rem, abs_rem] and
                                                       pred_java_primitive_integer_value_lt[abs_rem, abs_b]} )  
  and
  !pred_java_primitive_integer_value_eq_zero[b]
  and
  (pred_java_primitive_integer_value_gte_zero[a] implies pred_java_primitive_integer_value_gte_zero[rem])
  and
  (pred_java_primitive_integer_value_lt_zero[a] implies pred_java_primitive_integer_value_lte_zero[rem])
}


// FUNCTIONS

fun fun_java_primitive_integer_value_add[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue]: JavaPrimitiveIntegerValue { 
  {result: JavaPrimitiveIntegerValue | some overflow: boolean | pred_java_primitive_integer_value_add[a,b,result,overflow]}
}

fun fun_java_primitive_integer_value_sub[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue]: JavaPrimitiveIntegerValue {
 {result: JavaPrimitiveIntegerValue | some overflow: boolean | pred_java_primitive_integer_value_add[b,result,a,overflow] }
}

fun fun_java_primitive_integer_value_negate[a: JavaPrimitiveIntegerValue]: JavaPrimitiveIntegerValue {
 {result: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_negate[a,result] }
}

fun fun_java_primitive_integer_value_mul[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue]: JavaPrimitiveIntegerValue {
 {result: JavaPrimitiveIntegerValue | some overflow: boolean | pred_java_primitive_integer_value_mul[a,b,result,overflow] }
}

fun fun_java_primitive_integer_value_div[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue]: JavaPrimitiveIntegerValue {
 {div: JavaPrimitiveIntegerValue | some rem: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_div_rem[a,b,div,rem] }
}

fun fun_java_primitive_integer_value_rem[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue]: JavaPrimitiveIntegerValue {
 {rem: JavaPrimitiveIntegerValue | some div: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_div_rem[a,b,div,rem] }
}

fun fun_java_primitive_integer_value_sshr[a: JavaPrimitiveIntegerValue]: JavaPrimitiveIntegerValue {
  { ret: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_sshr[a,ret] } 
}

pred pred_java_primitive_integer_decrement[a: JavaPrimitiveIntegerValue, b: JavaPrimitiveIntegerValue] {
   a.b00 in b.b00 
   a.b01 in Xor [ Not[b.b01]  , And[Not[b.b00], Xor[Not[b.b00], a.b00]]] 
   a.b02 in Xor [ Not[b.b02]  , And[Not[b.b01], Xor[Not[b.b01], a.b01]]] 
   a.b03 in Xor [ Not[b.b03]  , And[Not[b.b02], Xor[Not[b.b02], a.b02]]] 
   a.b04 in Xor [ Not[b.b04]  , And[Not[b.b03], Xor[Not[b.b03], a.b03]]] 
   a.b05 in Xor [ Not[b.b05]  , And[Not[b.b04], Xor[Not[b.b04], a.b04]]] 
   a.b06 in Xor [ Not[b.b06]  , And[Not[b.b05], Xor[Not[b.b05], a.b05]]] 
   a.b07 in Xor [ Not[b.b07]  , And[Not[b.b06], Xor[Not[b.b06], a.b06]]] 
   a.b08 in Xor [ Not[b.b08]  , And[Not[b.b07], Xor[Not[b.b07], a.b07]]] 
   a.b09 in Xor [ Not[b.b09]  , And[Not[b.b08], Xor[Not[b.b08], a.b08]]] 
   a.b10 in Xor [ Not[b.b10]  , And[Not[b.b09], Xor[Not[b.b09], a.b09]]] 
   a.b11 in Xor [ Not[b.b11]  , And[Not[b.b10], Xor[Not[b.b10], a.b10]]] 
   a.b12 in Xor [ Not[b.b12]  , And[Not[b.b11], Xor[Not[b.b11], a.b11]]] 
   a.b13 in Xor [ Not[b.b13]  , And[Not[b.b12], Xor[Not[b.b12], a.b12]]] 
   a.b14 in Xor [ Not[b.b14]  , And[Not[b.b13], Xor[Not[b.b13], a.b13]]] 
   a.b15 in Xor [ Not[b.b15]  , And[Not[b.b14], Xor[Not[b.b14], a.b14]]] 
   a.b16 in Xor [ Not[b.b16]  , And[Not[b.b15], Xor[Not[b.b15], a.b15]]] 
   a.b17 in Xor [ Not[b.b17]  , And[Not[b.b16], Xor[Not[b.b16], a.b16]]] 
   a.b18 in Xor [ Not[b.b18]  , And[Not[b.b17], Xor[Not[b.b17], a.b17]]] 
   a.b19 in Xor [ Not[b.b19]  , And[Not[b.b18], Xor[Not[b.b18], a.b18]]] 
   a.b20 in Xor [ Not[b.b20]  , And[Not[b.b19], Xor[Not[b.b19], a.b19]]] 
   a.b21 in Xor [ Not[b.b21]  , And[Not[b.b20], Xor[Not[b.b20], a.b20]]] 
   a.b22 in Xor [ Not[b.b22]  , And[Not[b.b21], Xor[Not[b.b21], a.b21]]] 
   a.b23 in Xor [ Not[b.b23]  , And[Not[b.b22], Xor[Not[b.b22], a.b22]]] 
   a.b24 in Xor [ Not[b.b24]  , And[Not[b.b23], Xor[Not[b.b23], a.b23]]] 
   a.b25 in Xor [ Not[b.b25]  , And[Not[b.b24], Xor[Not[b.b24], a.b24]]] 
   a.b26 in Xor [ Not[b.b26]  , And[Not[b.b25], Xor[Not[b.b25], a.b25]]] 
   a.b27 in Xor [ Not[b.b27]  , And[Not[b.b26], Xor[Not[b.b26], a.b26]]] 
   a.b28 in Xor [ Not[b.b28]  , And[Not[b.b27], Xor[Not[b.b27], a.b27]]] 
   a.b29 in Xor [ Not[b.b29]  , And[Not[b.b28], Xor[Not[b.b28], a.b28]]] 
   a.b30 in Xor [ Not[b.b30]  , And[Not[b.b29], Xor[Not[b.b29], a.b29]]] 
   a.b31 in Xor [ Not[b.b31]  , And[Not[b.b30], Xor[Not[b.b30], a.b30]]] 
}

pred pred_java_primitive_integer_value_mul_marker[
  left    : JavaPrimitiveIntegerValue, 
  right   : JavaPrimitiveIntegerValue, 
  result  : JavaPrimitiveIntegerValue, 
  overflow: boolean] 
{
--marker predicate (empty body)
}

pred pred_java_primitive_integer_value_div_rem_marker[
  left     : JavaPrimitiveIntegerValue, 
  right    : JavaPrimitiveIntegerValue, 
  result   : JavaPrimitiveIntegerValue, 
  remainder: JavaPrimitiveIntegerValue] 
{
--marker predicate (empty body)
}

pred pred_java_primitive_integer_value_literal_minus_1[ret: JavaPrimitiveIntegerValue] {
 ret.b00=true 
 ret.b01=true 
 ret.b02=true 
 ret.b03=true 
 ret.b04=true 
 ret.b05=true 
 ret.b06=true 
 ret.b07=true 
 ret.b08=true 
 ret.b09=true 
 ret.b10=true 
 ret.b11=true 
 ret.b12=true 
 ret.b13=true 
 ret.b14=true 
 ret.b15=true 
 ret.b16=true 
 ret.b17=true 
 ret.b18=true 
 ret.b19=true 
 ret.b20=true 
 ret.b21=true 
 ret.b22=true 
 ret.b23=true 
 ret.b24=true 
 ret.b25=true 
 ret.b26=true 
 ret.b27=true 
 ret.b28=true 
 ret.b29=true 
 ret.b30=true 
 ret.b31=true 
}

pred pred_java_primitive_integer_value_literal_0[ret: JavaPrimitiveIntegerValue] {
 ret.b00=false 
 ret.b01=false 
 ret.b02=false 
 ret.b03=false 
 ret.b04=false 
 ret.b05=false 
 ret.b06=false 
 ret.b07=false 
 ret.b08=false 
 ret.b09=false 
 ret.b10=false 
 ret.b11=false 
 ret.b12=false 
 ret.b13=false 
 ret.b14=false 
 ret.b15=false 
 ret.b16=false 
 ret.b17=false 
 ret.b18=false 
 ret.b19=false 
 ret.b20=false 
 ret.b21=false 
 ret.b22=false 
 ret.b23=false 
 ret.b24=false 
 ret.b25=false 
 ret.b26=false 
 ret.b27=false 
 ret.b28=false 
 ret.b29=false 
 ret.b30=false 
 ret.b31=false 
}

fun fun_java_primitive_integer_value_literal_minus_1[]: one JavaPrimitiveIntegerValue {
 { ret: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_literal_minus_1[ret] }
}
check check_roops_core_objectsInstrumented_BinTree_removeTest_0  for 0 but  exactly 3 roops_core_objectsInstrumented_BinTreeNode, exactly 5 java_lang_Object, exactly 1 roops_utilInstrumented_RoopsArray, exactly 1 roops_core_objectsInstrumented_BinTree, exactly 3 JavaPrimitiveIntegerValue,4 int



pred updateVariable[
  l_1: univ,
  r_0: univ
]{
  TruePred[]
  and 
  equ[l_1,
     r_0]
}


pred getUnusedObject[
  n_1: java_lang_Object + null,
  usedObjects_0: set java_lang_Object,
  usedObjects_1: set java_lang_Object
]{
  TruePred[]
  and 
  getUnusedObjectPost[usedObjects_1,
                     usedObjects_0,
                     n_1]
}


pred havocVariable[
  v_1: univ
]{
  TruePred[]
  and 
  havocVarPost[v_1]
}


pred havocFieldContents[
  target_0: univ,
  field_0: univ -> univ,
  field_1: univ -> univ
]{
  TruePred[]
  and 
  havocFieldContentsPost[target_0,
                        field_0,
                        field_1]
}


pred havocVariable3[
  u_1: univ -> ( seq univ )
]{
  TruePred[]
  and 
  havocVariable3Post[u_1]
}


pred havocVariable2[
  u_1: univ -> univ
]{
  TruePred[]
  and 
  havocVariable2Post[u_1]
}


pred havocField[
  f_0: univ -> univ,
  f_1: univ -> univ,
  u_0: univ
]{
  TruePred[]
  and 
  havocFieldPost[f_0,
                f_1,
                u_0]
}


pred havocListSeq[
  target_0: univ,
  field_0: univ -> Int -> univ,
  field_1: univ -> Int -> univ
]{
  TruePred[]
  and 
  havocListSeqPost[target_0,
                  field_0,
                  field_1]
}


pred updateField[
  l_0: univ,
  f_0: univ -> univ,
  f_1: univ -> univ,
  r_0: univ
]{
  TruePred[]
  and 
  updateFieldPost[f_1,
                 f_0,
                 l_0,
                 r_0]
}


pred roops_core_objectsInstrumented_BinTree_removeTest_0[
  throw_1: java_lang_Throwable + null,
  throw_2: java_lang_Throwable + null,
  throw_3: java_lang_Throwable + null,
  throw_4: java_lang_Throwable + null,
  throw_5: java_lang_Throwable + null,
  throw_6: java_lang_Throwable + null,
  throw_7: java_lang_Throwable + null,
  throw_8: java_lang_Throwable + null,
  throw_9: java_lang_Throwable + null,
  throw_10: java_lang_Throwable + null,
  throw_11: java_lang_Throwable + null,
  throw_12: java_lang_Throwable + null,
  throw_13: java_lang_Throwable + null,
  throw_14: java_lang_Throwable + null,
  throw_15: java_lang_Throwable + null,
  throw_16: java_lang_Throwable + null,
  throw_17: java_lang_Throwable + null,
  throw_18: java_lang_Throwable + null,
  throw_19: java_lang_Throwable + null,
  throw_20: java_lang_Throwable + null,
  throw_21: java_lang_Throwable + null,
  throw_22: java_lang_Throwable + null,
  throw_23: java_lang_Throwable + null,
  throw_24: java_lang_Throwable + null,
  throw_25: java_lang_Throwable + null,
  throw_26: java_lang_Throwable + null,
  throw_27: java_lang_Throwable + null,
  throw_28: java_lang_Throwable + null,
  throw_29: java_lang_Throwable + null,
  throw_30: java_lang_Throwable + null,
  throw_31: java_lang_Throwable + null,
  throw_32: java_lang_Throwable + null,
  throw_33: java_lang_Throwable + null,
  throw_34: java_lang_Throwable + null,
  throw_35: java_lang_Throwable + null,
  throw_36: java_lang_Throwable + null,
  throw_37: java_lang_Throwable + null,
  throw_38: java_lang_Throwable + null,
  throw_39: java_lang_Throwable + null,
  throw_40: java_lang_Throwable + null,
  throw_41: java_lang_Throwable + null,
  throw_42: java_lang_Throwable + null,
  throw_43: java_lang_Throwable + null,
  throw_44: java_lang_Throwable + null,
  throw_45: java_lang_Throwable + null,
  throw_46: java_lang_Throwable + null,
  throw_47: java_lang_Throwable + null,
  tree_0: null + roops_core_objectsInstrumented_BinTree,
  z_0: null + roops_core_objectsInstrumented_BinTreeNode,
  roops_core_objectsInstrumented_BinTree_roops_goal_10_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_10_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_10_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_13_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_13_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_13_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_14_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_14_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_14_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_11_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_11_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_11_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_12_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_12_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_12_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTreeNode_key_0: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( JavaPrimitiveIntegerValue ),
  roops_core_objectsInstrumented_BinTreeNode_key_1: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( JavaPrimitiveIntegerValue ),
  roops_core_objectsInstrumented_BinTree_roops_goal_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_5_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_1_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_1_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_1_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_0_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_0_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_0_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_18_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_18_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_18_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_17_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_17_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_17_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_16_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_16_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_16_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_15_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_15_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_15_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_9_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_9_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_9_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_8_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_8_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_7_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTreeNode_right_0: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTreeNode_right_1: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTree_roops_goal_19_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_19_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_19_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_6_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTreeNode_parent_0: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTreeNode_parent_1: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTree_roops_goal_20_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_20_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_20_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTreeNode_left_0: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTreeNode_left_1: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTree_roops_goal_21_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_21_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_21_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_22_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_22_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_22_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_23_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_23_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_23_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_myRoopsArray_0: ( ClassFields ) -> one ( null + roops_utilInstrumented_RoopsArray ),
  roops_core_objectsInstrumented_BinTree_myRoopsArray_1: ( ClassFields ) -> one ( null + roops_utilInstrumented_RoopsArray ),
  roops_core_objectsInstrumented_BinTree_root_0: ( roops_core_objectsInstrumented_BinTree ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTree_root_1: ( roops_core_objectsInstrumented_BinTree ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  exit_stmt_reached_1: boolean,
  t_8_0: null + roops_core_objectsInstrumented_BinTreeNode,
  t_8_1: null + roops_core_objectsInstrumented_BinTreeNode,
  t_13_0: boolean,
  t_13_1: boolean,
  t_9_0: boolean,
  t_9_1: boolean,
  t_11_0: boolean,
  t_11_1: boolean,
  t_12_0: boolean,
  t_12_1: boolean,
  t_10_0: boolean,
  t_10_1: boolean,
  l0_exit_stmt_reached_1: boolean,
  l4_l3_var_7_x_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_var_7_x_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_var_7_x_2: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_var_7_x_3: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_t_39_0: boolean,
  l4_l3_t_39_1: boolean,
  l4_l3_t_37_0: boolean,
  l4_l3_t_37_1: boolean,
  l4_l3_t_38_0: boolean,
  l4_l3_t_38_1: boolean,
  l4_l3_t_36_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_t_36_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_var_10_terminatesInTime_0: boolean,
  l4_l3_var_10_terminatesInTime_1: boolean,
  l4_t_48_0: boolean,
  l4_t_48_1: boolean,
  l4_t_49_0: boolean,
  l4_t_49_1: boolean,
  l4_t_46_0: boolean,
  l4_t_46_1: boolean,
  l4_t_47_0: boolean,
  l4_t_47_1: boolean,
  l4_t_44_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_t_44_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_t_45_0: boolean,
  l4_t_45_1: boolean,
  l4_l3_l2_var_5_x_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_l2_var_5_x_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_l2_var_5_x_2: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_l2_var_5_x_3: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_t_41_0: boolean,
  l4_l3_t_41_1: boolean,
  l4_l3_t_40_0: boolean,
  l4_l3_t_40_1: boolean,
  l4_l3_t_43_0: boolean,
  l4_l3_t_43_1: boolean,
  l4_l3_t_42_0: boolean,
  l4_l3_t_42_1: boolean,
  l4_t_52_0: boolean,
  l4_t_52_1: boolean,
  l4_t_51_0: boolean,
  l4_t_51_1: boolean,
  l4_t_50_0: boolean,
  l4_t_50_1: boolean,
  l4_l3_var_9_y_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_var_9_y_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_var_9_y_2: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_var_9_y_3: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_exit_stmt_reached_0: boolean,
  l4_exit_stmt_reached_1: boolean,
  l4_exit_stmt_reached_2: boolean,
  l4_l3_var_8_result_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_var_8_result_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l1_exit_stmt_reached_0: boolean,
  l1_exit_stmt_reached_1: boolean,
  l1_exit_stmt_reached_2: boolean,
  l4_l3_l2_t_34_0: boolean,
  l4_l3_l2_t_34_1: boolean,
  l4_l3_l2_t_35_0: boolean,
  l4_l3_l2_t_35_1: boolean,
  l4_var_12_x_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_var_12_x_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_var_12_x_2: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_var_11_y_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_var_11_y_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_var_11_y_2: null + roops_core_objectsInstrumented_BinTreeNode,
  l4_l3_l2_var_6_terminatesInTime_0: boolean,
  l4_l3_l2_var_6_terminatesInTime_1: boolean,
  l4_l3_exit_stmt_reached_0: boolean,
  l4_l3_exit_stmt_reached_1: boolean,
  l4_l3_exit_stmt_reached_2: boolean,
  l4_l3_l2_exit_stmt_reached_0: boolean,
  l4_l3_l2_exit_stmt_reached_1: boolean,
  l4_l3_l2_exit_stmt_reached_2: boolean
]{
  TruePred[]
  and 
  (
    throw_1=null)
  and 
  TruePred[]
  and 
  (
    exit_stmt_reached_1=false)
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  roops_core_objectsInstrumented_BinTree_fajita_roopsGoal_initialization_0[throw_2,
                                                                          throw_3,
                                                                          throw_4,
                                                                          throw_5,
                                                                          throw_6,
                                                                          throw_7,
                                                                          throw_8,
                                                                          throw_9,
                                                                          throw_10,
                                                                          throw_11,
                                                                          throw_12,
                                                                          throw_13,
                                                                          throw_14,
                                                                          throw_15,
                                                                          throw_16,
                                                                          throw_17,
                                                                          throw_18,
                                                                          throw_19,
                                                                          throw_20,
                                                                          throw_21,
                                                                          throw_22,
                                                                          throw_23,
                                                                          throw_24,
                                                                          throw_25,
                                                                          throw_26,
                                                                          throw_27,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_10_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_10_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_13_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_13_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_14_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_14_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_11_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_11_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_12_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_12_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_5_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_5_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_4_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_4_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_3_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_3_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_2_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_2_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_1_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_1_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_0_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_0_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_18_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_18_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_17_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_17_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_16_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_16_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_15_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_15_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_9_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_9_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_8_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_8_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_7_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_7_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_19_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_19_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_6_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_6_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_20_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_20_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_21_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_21_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_22_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_22_1,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_23_0,
                                                                          roops_core_objectsInstrumented_BinTree_roops_goal_23_1,
                                                                          roops_core_objectsInstrumented_BinTree_myRoopsArray_0,
                                                                          roops_core_objectsInstrumented_BinTree_myRoopsArray_1,
                                                                          l0_exit_stmt_reached_1]
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_27]
      and 
      (
        t_11_1=(neq[tree_0,
           null]=>(true)else(false))
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_27]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_11_0=t_11_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_27]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition6[t_11_1]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_27]
              and 
              (
                t_12_1=(neq[z_0,
                   null]=>(true)else(false))
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_27]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_12_0=t_12_1)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_27]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition4[t_12_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_27]
                      and 
                      (
                        t_10_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_27]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_10_0=t_10_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition4[t_12_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_27]
                      and 
                      (
                        t_10_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_27]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_10_0=t_10_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_27]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_10_0=t_10_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition6[t_11_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_27]
              and 
              (
                t_10_1=false)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_27]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_10_0=t_10_1)
            )
          )
          and 
          (
            t_12_0=t_12_1)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_27]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_12_0=t_12_1)
      and 
      (
        t_10_0=t_10_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_27]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition12[t_10_1]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_27]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition8[tree_0]
                  and 
                  (
                    throw_28=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    l1_exit_stmt_reached_0=l1_exit_stmt_reached_2)
                  and 
                  (
                    t_13_0=t_13_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition8[tree_0])
                  )
                  and 
                  roops_core_objectsInstrumented_BinTree_repOK_0[throw_28,
                                                                t_13_0,
                                                                t_13_1,
                                                                l1_exit_stmt_reached_1,
                                                                l1_exit_stmt_reached_2]
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_27]
                )
              )
              and 
              TruePred[]
              and 
              (
                l1_exit_stmt_reached_0=l1_exit_stmt_reached_2)
              and 
              (
                t_13_0=t_13_1)
              and 
              (
                throw_27=throw_28)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_28]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition10[t_13_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_28]
                      and 
                      (
                        t_9_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_28]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_9_0=t_9_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition10[t_13_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_28]
                      and 
                      (
                        t_9_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_28]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_9_0=t_9_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_28]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_9_0=t_9_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition12[t_10_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_27]
              and 
              (
                t_9_1=false)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_27]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_9_0=t_9_1)
            )
          )
          and 
          (
            l1_exit_stmt_reached_0=l1_exit_stmt_reached_2)
          and 
          (
            t_13_0=t_13_1)
          and 
          (
            throw_27=throw_28)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_27]
        )
      )
      and 
      TruePred[]
      and 
      (
        l1_exit_stmt_reached_0=l1_exit_stmt_reached_2)
      and 
      (
        t_9_0=t_9_1)
      and 
      (
        t_13_0=t_13_1)
      and 
      (
        throw_27=throw_28)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_28]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition14[t_9_1]
          and 
          TruePred[]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_28]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_29=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_0_1=roops_core_objectsInstrumented_BinTree_roops_goal_0_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_0_2=(roops_core_objectsInstrumented_BinTree_roops_goal_0_1)++((ClassFields)->(true)))
                  and 
                  (
                    throw_28=throw_29)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_28]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_0_1=roops_core_objectsInstrumented_BinTree_roops_goal_0_2)
              and 
              (
                throw_28=throw_29)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_29]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition8[tree_0]
                  and 
                  (
                    throw_47=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    l4_l3_var_7_x_0=l4_l3_var_7_x_3)
                  and 
                  (
                    l4_l3_t_39_0=l4_l3_t_39_1)
                  and 
                  (
                    l4_l3_t_37_0=l4_l3_t_37_1)
                  and 
                  (
                    l4_l3_t_38_0=l4_l3_t_38_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_4_1=roops_core_objectsInstrumented_BinTree_roops_goal_4_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_3_1=roops_core_objectsInstrumented_BinTree_roops_goal_3_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_2_1=roops_core_objectsInstrumented_BinTree_roops_goal_2_2)
                  and 
                  (
                    l4_l3_t_36_0=l4_l3_t_36_1)
                  and 
                  (
                    l4_l3_var_10_terminatesInTime_0=l4_l3_var_10_terminatesInTime_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_9_1=roops_core_objectsInstrumented_BinTree_roops_goal_9_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_8_1=roops_core_objectsInstrumented_BinTree_roops_goal_8_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_7_1=roops_core_objectsInstrumented_BinTree_roops_goal_7_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_6_1=roops_core_objectsInstrumented_BinTree_roops_goal_6_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_5_1=roops_core_objectsInstrumented_BinTree_roops_goal_5_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTreeNode_right_0=roops_core_objectsInstrumented_BinTreeNode_right_1)
                  and 
                  (
                    l4_t_48_0=l4_t_48_1)
                  and 
                  (
                    l4_t_49_0=l4_t_49_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTreeNode_left_0=roops_core_objectsInstrumented_BinTreeNode_left_1)
                  and 
                  (
                    l4_t_46_0=l4_t_46_1)
                  and 
                  (
                    l4_t_47_0=l4_t_47_1)
                  and 
                  (
                    l4_t_44_0=l4_t_44_1)
                  and 
                  (
                    l4_t_45_0=l4_t_45_1)
                  and 
                  (
                    l4_l3_l2_var_5_x_0=l4_l3_l2_var_5_x_3)
                  and 
                  (
                    l4_l3_t_41_0=l4_l3_t_41_1)
                  and 
                  (
                    l4_l3_t_40_0=l4_l3_t_40_1)
                  and 
                  (
                    l4_l3_t_43_0=l4_l3_t_43_1)
                  and 
                  (
                    l4_l3_t_42_0=l4_l3_t_42_1)
                  and 
                  (
                    l4_t_52_0=l4_t_52_1)
                  and 
                  (
                    l4_t_51_0=l4_t_51_1)
                  and 
                  (
                    l4_t_50_0=l4_t_50_1)
                  and 
                  (
                    t_8_0=t_8_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_root_0=roops_core_objectsInstrumented_BinTree_root_1)
                  and 
                  (
                    l4_l3_var_9_y_0=l4_l3_var_9_y_3)
                  and 
                  (
                    l4_exit_stmt_reached_0=l4_exit_stmt_reached_2)
                  and 
                  (
                    l4_l3_var_8_result_0=l4_l3_var_8_result_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTreeNode_key_0=roops_core_objectsInstrumented_BinTreeNode_key_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_12_1=roops_core_objectsInstrumented_BinTree_roops_goal_12_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_13_1=roops_core_objectsInstrumented_BinTree_roops_goal_13_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_10_1=roops_core_objectsInstrumented_BinTree_roops_goal_10_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_11_1=roops_core_objectsInstrumented_BinTree_roops_goal_11_2)
                  and 
                  (
                    l4_l3_l2_t_34_0=l4_l3_l2_t_34_1)
                  and 
                  (
                    l4_l3_l2_t_35_0=l4_l3_l2_t_35_1)
                  and 
                  (
                    l4_var_12_x_0=l4_var_12_x_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_17_1=roops_core_objectsInstrumented_BinTree_roops_goal_17_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_16_1=roops_core_objectsInstrumented_BinTree_roops_goal_16_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_15_1=roops_core_objectsInstrumented_BinTree_roops_goal_15_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_14_1=roops_core_objectsInstrumented_BinTree_roops_goal_14_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_19_1=roops_core_objectsInstrumented_BinTree_roops_goal_19_2)
                  and 
                  (
                    l4_var_11_y_0=l4_var_11_y_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_18_1=roops_core_objectsInstrumented_BinTree_roops_goal_18_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTreeNode_parent_0=roops_core_objectsInstrumented_BinTreeNode_parent_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_20_1=roops_core_objectsInstrumented_BinTree_roops_goal_20_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_21_1=roops_core_objectsInstrumented_BinTree_roops_goal_21_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_22_1=roops_core_objectsInstrumented_BinTree_roops_goal_22_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_23_1=roops_core_objectsInstrumented_BinTree_roops_goal_23_2)
                  and 
                  (
                    l4_l3_l2_var_6_terminatesInTime_0=l4_l3_l2_var_6_terminatesInTime_1)
                  and 
                  (
                    l4_l3_exit_stmt_reached_0=l4_l3_exit_stmt_reached_2)
                  and 
                  (
                    l4_l3_l2_exit_stmt_reached_0=l4_l3_l2_exit_stmt_reached_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition8[tree_0])
                  )
                  and 
                  roops_core_objectsInstrumented_BinTree_remove_0[tree_0,
                                                                 throw_30,
                                                                 throw_31,
                                                                 throw_32,
                                                                 throw_33,
                                                                 throw_34,
                                                                 throw_35,
                                                                 throw_36,
                                                                 throw_37,
                                                                 throw_38,
                                                                 throw_39,
                                                                 throw_40,
                                                                 throw_41,
                                                                 throw_42,
                                                                 throw_43,
                                                                 throw_44,
                                                                 throw_45,
                                                                 throw_46,
                                                                 throw_47,
                                                                 t_8_0,
                                                                 t_8_1,
                                                                 z_0,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_10_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_10_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_13_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_13_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_14_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_14_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_11_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_11_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_12_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_12_2,
                                                                 roops_core_objectsInstrumented_BinTreeNode_key_0,
                                                                 roops_core_objectsInstrumented_BinTreeNode_key_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_5_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_5_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_4_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_4_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_3_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_3_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_2_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_2_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_18_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_18_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_17_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_17_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_16_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_16_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_15_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_15_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_9_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_9_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_8_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_8_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_7_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_7_2,
                                                                 roops_core_objectsInstrumented_BinTreeNode_right_0,
                                                                 roops_core_objectsInstrumented_BinTreeNode_right_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_19_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_19_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_6_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_6_2,
                                                                 roops_core_objectsInstrumented_BinTreeNode_parent_0,
                                                                 roops_core_objectsInstrumented_BinTreeNode_parent_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_20_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_20_2,
                                                                 roops_core_objectsInstrumented_BinTreeNode_left_0,
                                                                 roops_core_objectsInstrumented_BinTreeNode_left_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_21_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_21_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_22_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_22_2,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_23_1,
                                                                 roops_core_objectsInstrumented_BinTree_roops_goal_23_2,
                                                                 roops_core_objectsInstrumented_BinTree_root_0,
                                                                 roops_core_objectsInstrumented_BinTree_root_1,
                                                                 l4_t_49_0,
                                                                 l4_t_49_1,
                                                                 l4_t_48_0,
                                                                 l4_t_48_1,
                                                                 l4_t_47_0,
                                                                 l4_t_47_1,
                                                                 l4_exit_stmt_reached_1,
                                                                 l4_exit_stmt_reached_2,
                                                                 l4_t_46_0,
                                                                 l4_t_46_1,
                                                                 l4_t_45_0,
                                                                 l4_t_45_1,
                                                                 l4_var_12_x_0,
                                                                 l4_var_12_x_1,
                                                                 l4_var_12_x_2,
                                                                 l4_t_44_0,
                                                                 l4_t_44_1,
                                                                 l4_t_50_0,
                                                                 l4_t_50_1,
                                                                 l4_var_11_y_0,
                                                                 l4_var_11_y_1,
                                                                 l4_var_11_y_2,
                                                                 l4_t_52_0,
                                                                 l4_t_52_1,
                                                                 l4_t_51_0,
                                                                 l4_t_51_1,
                                                                 l4_l3_exit_stmt_reached_0,
                                                                 l4_l3_exit_stmt_reached_1,
                                                                 l4_l3_exit_stmt_reached_2,
                                                                 l4_l3_t_42_0,
                                                                 l4_l3_t_42_1,
                                                                 l4_l3_t_41_0,
                                                                 l4_l3_t_41_1,
                                                                 l4_l3_t_43_0,
                                                                 l4_l3_t_43_1,
                                                                 l4_l3_var_10_terminatesInTime_0,
                                                                 l4_l3_var_10_terminatesInTime_1,
                                                                 l4_l3_t_40_0,
                                                                 l4_l3_t_40_1,
                                                                 l4_l3_t_37_0,
                                                                 l4_l3_t_37_1,
                                                                 l4_l3_t_36_0,
                                                                 l4_l3_t_36_1,
                                                                 l4_l3_l2_var_5_x_0,
                                                                 l4_l3_l2_var_5_x_1,
                                                                 l4_l3_l2_var_5_x_2,
                                                                 l4_l3_l2_var_5_x_3,
                                                                 l4_l3_t_39_0,
                                                                 l4_l3_t_39_1,
                                                                 l4_l3_t_38_0,
                                                                 l4_l3_t_38_1,
                                                                 l4_l3_var_8_result_0,
                                                                 l4_l3_var_8_result_1,
                                                                 l4_l3_var_9_y_0,
                                                                 l4_l3_var_9_y_1,
                                                                 l4_l3_var_9_y_2,
                                                                 l4_l3_var_9_y_3,
                                                                 l4_l3_l2_t_34_0,
                                                                 l4_l3_l2_t_34_1,
                                                                 l4_l3_l2_exit_stmt_reached_0,
                                                                 l4_l3_l2_exit_stmt_reached_1,
                                                                 l4_l3_l2_exit_stmt_reached_2,
                                                                 l4_l3_l2_t_35_0,
                                                                 l4_l3_l2_t_35_1,
                                                                 l4_l3_l2_var_6_terminatesInTime_0,
                                                                 l4_l3_l2_var_6_terminatesInTime_1,
                                                                 l4_l3_var_7_x_0,
                                                                 l4_l3_var_7_x_1,
                                                                 l4_l3_var_7_x_2,
                                                                 l4_l3_var_7_x_3]
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_29]
                )
              )
              and 
              TruePred[]
              and 
              (
                l4_l3_var_7_x_0=l4_l3_var_7_x_3)
              and 
              (
                l4_l3_t_39_0=l4_l3_t_39_1)
              and 
              (
                l4_l3_t_37_0=l4_l3_t_37_1)
              and 
              (
                l4_l3_t_38_0=l4_l3_t_38_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_4_1=roops_core_objectsInstrumented_BinTree_roops_goal_4_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_3_1=roops_core_objectsInstrumented_BinTree_roops_goal_3_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_2_1=roops_core_objectsInstrumented_BinTree_roops_goal_2_2)
              and 
              (
                l4_l3_t_36_0=l4_l3_t_36_1)
              and 
              (
                l4_l3_var_10_terminatesInTime_0=l4_l3_var_10_terminatesInTime_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_9_1=roops_core_objectsInstrumented_BinTree_roops_goal_9_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_8_1=roops_core_objectsInstrumented_BinTree_roops_goal_8_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_7_1=roops_core_objectsInstrumented_BinTree_roops_goal_7_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_6_1=roops_core_objectsInstrumented_BinTree_roops_goal_6_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_5_1=roops_core_objectsInstrumented_BinTree_roops_goal_5_2)
              and 
              (
                roops_core_objectsInstrumented_BinTreeNode_right_0=roops_core_objectsInstrumented_BinTreeNode_right_1)
              and 
              (
                l4_t_48_0=l4_t_48_1)
              and 
              (
                l4_t_49_0=l4_t_49_1)
              and 
              (
                roops_core_objectsInstrumented_BinTreeNode_left_0=roops_core_objectsInstrumented_BinTreeNode_left_1)
              and 
              (
                l4_t_46_0=l4_t_46_1)
              and 
              (
                l4_t_47_0=l4_t_47_1)
              and 
              (
                l4_t_44_0=l4_t_44_1)
              and 
              (
                l4_t_45_0=l4_t_45_1)
              and 
              (
                l4_l3_l2_var_5_x_0=l4_l3_l2_var_5_x_3)
              and 
              (
                l4_l3_t_41_0=l4_l3_t_41_1)
              and 
              (
                l4_l3_t_40_0=l4_l3_t_40_1)
              and 
              (
                l4_l3_t_43_0=l4_l3_t_43_1)
              and 
              (
                l4_l3_t_42_0=l4_l3_t_42_1)
              and 
              (
                l4_t_52_0=l4_t_52_1)
              and 
              (
                l4_t_51_0=l4_t_51_1)
              and 
              (
                l4_t_50_0=l4_t_50_1)
              and 
              (
                t_8_0=t_8_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_root_0=roops_core_objectsInstrumented_BinTree_root_1)
              and 
              (
                l4_l3_var_9_y_0=l4_l3_var_9_y_3)
              and 
              (
                l4_l3_var_8_result_0=l4_l3_var_8_result_1)
              and 
              (
                l4_exit_stmt_reached_0=l4_exit_stmt_reached_2)
              and 
              (
                roops_core_objectsInstrumented_BinTreeNode_key_0=roops_core_objectsInstrumented_BinTreeNode_key_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_12_1=roops_core_objectsInstrumented_BinTree_roops_goal_12_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_13_1=roops_core_objectsInstrumented_BinTree_roops_goal_13_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_10_1=roops_core_objectsInstrumented_BinTree_roops_goal_10_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_11_1=roops_core_objectsInstrumented_BinTree_roops_goal_11_2)
              and 
              (
                l4_l3_l2_t_34_0=l4_l3_l2_t_34_1)
              and 
              (
                l4_l3_l2_t_35_0=l4_l3_l2_t_35_1)
              and 
              (
                l4_var_12_x_0=l4_var_12_x_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_17_1=roops_core_objectsInstrumented_BinTree_roops_goal_17_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_16_1=roops_core_objectsInstrumented_BinTree_roops_goal_16_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_15_1=roops_core_objectsInstrumented_BinTree_roops_goal_15_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_14_1=roops_core_objectsInstrumented_BinTree_roops_goal_14_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_19_1=roops_core_objectsInstrumented_BinTree_roops_goal_19_2)
              and 
              (
                l4_var_11_y_0=l4_var_11_y_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_18_1=roops_core_objectsInstrumented_BinTree_roops_goal_18_2)
              and 
              (
                roops_core_objectsInstrumented_BinTreeNode_parent_0=roops_core_objectsInstrumented_BinTreeNode_parent_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_20_1=roops_core_objectsInstrumented_BinTree_roops_goal_20_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_21_1=roops_core_objectsInstrumented_BinTree_roops_goal_21_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_22_1=roops_core_objectsInstrumented_BinTree_roops_goal_22_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_23_1=roops_core_objectsInstrumented_BinTree_roops_goal_23_2)
              and 
              (
                l4_l3_l2_var_6_terminatesInTime_0=l4_l3_l2_var_6_terminatesInTime_1)
              and 
              (
                l4_l3_exit_stmt_reached_0=l4_l3_exit_stmt_reached_2)
              and 
              (
                l4_l3_l2_exit_stmt_reached_0=l4_l3_l2_exit_stmt_reached_2)
              and 
              (
                throw_29=throw_47)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_1_1=roops_core_objectsInstrumented_BinTree_roops_goal_1_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition14[t_9_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_28]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_47=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_1_1=roops_core_objectsInstrumented_BinTree_roops_goal_1_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_1_2=(roops_core_objectsInstrumented_BinTree_roops_goal_1_1)++((ClassFields)->(true)))
                  and 
                  (
                    throw_28=throw_47)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_28]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_1_1=roops_core_objectsInstrumented_BinTree_roops_goal_1_2)
              and 
              (
                throw_28=throw_47)
            )
          )
          and 
          (
            l4_l3_var_7_x_0=l4_l3_var_7_x_3)
          and 
          (
            l4_l3_t_39_0=l4_l3_t_39_1)
          and 
          (
            l4_l3_t_37_0=l4_l3_t_37_1)
          and 
          (
            l4_l3_t_38_0=l4_l3_t_38_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_4_1=roops_core_objectsInstrumented_BinTree_roops_goal_4_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_3_1=roops_core_objectsInstrumented_BinTree_roops_goal_3_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_2_1=roops_core_objectsInstrumented_BinTree_roops_goal_2_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_0_1=roops_core_objectsInstrumented_BinTree_roops_goal_0_2)
          and 
          (
            l4_l3_t_36_0=l4_l3_t_36_1)
          and 
          (
            l4_l3_var_10_terminatesInTime_0=l4_l3_var_10_terminatesInTime_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_9_1=roops_core_objectsInstrumented_BinTree_roops_goal_9_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_8_1=roops_core_objectsInstrumented_BinTree_roops_goal_8_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_7_1=roops_core_objectsInstrumented_BinTree_roops_goal_7_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_6_1=roops_core_objectsInstrumented_BinTree_roops_goal_6_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_5_1=roops_core_objectsInstrumented_BinTree_roops_goal_5_2)
          and 
          (
            roops_core_objectsInstrumented_BinTreeNode_right_0=roops_core_objectsInstrumented_BinTreeNode_right_1)
          and 
          (
            l4_t_48_0=l4_t_48_1)
          and 
          (
            l4_t_49_0=l4_t_49_1)
          and 
          (
            roops_core_objectsInstrumented_BinTreeNode_left_0=roops_core_objectsInstrumented_BinTreeNode_left_1)
          and 
          (
            l4_t_46_0=l4_t_46_1)
          and 
          (
            l4_t_47_0=l4_t_47_1)
          and 
          (
            l4_t_44_0=l4_t_44_1)
          and 
          (
            l4_t_45_0=l4_t_45_1)
          and 
          (
            l4_l3_l2_var_5_x_0=l4_l3_l2_var_5_x_3)
          and 
          (
            l4_l3_t_41_0=l4_l3_t_41_1)
          and 
          (
            l4_l3_t_40_0=l4_l3_t_40_1)
          and 
          (
            l4_l3_t_43_0=l4_l3_t_43_1)
          and 
          (
            l4_l3_t_42_0=l4_l3_t_42_1)
          and 
          (
            l4_t_52_0=l4_t_52_1)
          and 
          (
            l4_t_51_0=l4_t_51_1)
          and 
          (
            l4_t_50_0=l4_t_50_1)
          and 
          (
            t_8_0=t_8_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_root_0=roops_core_objectsInstrumented_BinTree_root_1)
          and 
          (
            l4_l3_var_9_y_0=l4_l3_var_9_y_3)
          and 
          (
            l4_l3_var_8_result_0=l4_l3_var_8_result_1)
          and 
          (
            l4_exit_stmt_reached_0=l4_exit_stmt_reached_2)
          and 
          (
            roops_core_objectsInstrumented_BinTreeNode_key_0=roops_core_objectsInstrumented_BinTreeNode_key_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_12_1=roops_core_objectsInstrumented_BinTree_roops_goal_12_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_13_1=roops_core_objectsInstrumented_BinTree_roops_goal_13_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_10_1=roops_core_objectsInstrumented_BinTree_roops_goal_10_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_11_1=roops_core_objectsInstrumented_BinTree_roops_goal_11_2)
          and 
          (
            l4_l3_l2_t_34_0=l4_l3_l2_t_34_1)
          and 
          (
            l4_l3_l2_t_35_0=l4_l3_l2_t_35_1)
          and 
          (
            l4_var_12_x_0=l4_var_12_x_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_17_1=roops_core_objectsInstrumented_BinTree_roops_goal_17_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_16_1=roops_core_objectsInstrumented_BinTree_roops_goal_16_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_15_1=roops_core_objectsInstrumented_BinTree_roops_goal_15_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_14_1=roops_core_objectsInstrumented_BinTree_roops_goal_14_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_19_1=roops_core_objectsInstrumented_BinTree_roops_goal_19_2)
          and 
          (
            l4_var_11_y_0=l4_var_11_y_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_18_1=roops_core_objectsInstrumented_BinTree_roops_goal_18_2)
          and 
          (
            roops_core_objectsInstrumented_BinTreeNode_parent_0=roops_core_objectsInstrumented_BinTreeNode_parent_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_20_1=roops_core_objectsInstrumented_BinTree_roops_goal_20_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_21_1=roops_core_objectsInstrumented_BinTree_roops_goal_21_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_22_1=roops_core_objectsInstrumented_BinTree_roops_goal_22_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_23_1=roops_core_objectsInstrumented_BinTree_roops_goal_23_2)
          and 
          (
            l4_l3_l2_var_6_terminatesInTime_0=l4_l3_l2_var_6_terminatesInTime_1)
          and 
          (
            l4_l3_exit_stmt_reached_0=l4_l3_exit_stmt_reached_2)
          and 
          (
            l4_l3_l2_exit_stmt_reached_0=l4_l3_l2_exit_stmt_reached_2)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_28]
        )
      )
      and 
      TruePred[]
      and 
      (
        l4_l3_var_7_x_0=l4_l3_var_7_x_3)
      and 
      (
        l4_l3_t_39_0=l4_l3_t_39_1)
      and 
      (
        l4_l3_t_37_0=l4_l3_t_37_1)
      and 
      (
        l4_l3_t_38_0=l4_l3_t_38_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_4_1=roops_core_objectsInstrumented_BinTree_roops_goal_4_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_3_1=roops_core_objectsInstrumented_BinTree_roops_goal_3_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_2_1=roops_core_objectsInstrumented_BinTree_roops_goal_2_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_1_1=roops_core_objectsInstrumented_BinTree_roops_goal_1_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_0_1=roops_core_objectsInstrumented_BinTree_roops_goal_0_2)
      and 
      (
        l4_l3_t_36_0=l4_l3_t_36_1)
      and 
      (
        l4_l3_var_10_terminatesInTime_0=l4_l3_var_10_terminatesInTime_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_9_1=roops_core_objectsInstrumented_BinTree_roops_goal_9_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_8_1=roops_core_objectsInstrumented_BinTree_roops_goal_8_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_7_1=roops_core_objectsInstrumented_BinTree_roops_goal_7_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_6_1=roops_core_objectsInstrumented_BinTree_roops_goal_6_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_5_1=roops_core_objectsInstrumented_BinTree_roops_goal_5_2)
      and 
      (
        roops_core_objectsInstrumented_BinTreeNode_right_0=roops_core_objectsInstrumented_BinTreeNode_right_1)
      and 
      (
        l4_t_48_0=l4_t_48_1)
      and 
      (
        l4_t_49_0=l4_t_49_1)
      and 
      (
        roops_core_objectsInstrumented_BinTreeNode_left_0=roops_core_objectsInstrumented_BinTreeNode_left_1)
      and 
      (
        l4_t_46_0=l4_t_46_1)
      and 
      (
        l4_t_47_0=l4_t_47_1)
      and 
      (
        l4_t_44_0=l4_t_44_1)
      and 
      (
        l4_t_45_0=l4_t_45_1)
      and 
      (
        l4_l3_l2_var_5_x_0=l4_l3_l2_var_5_x_3)
      and 
      (
        l4_l3_t_41_0=l4_l3_t_41_1)
      and 
      (
        l4_l3_t_40_0=l4_l3_t_40_1)
      and 
      (
        l4_l3_t_43_0=l4_l3_t_43_1)
      and 
      (
        l4_l3_t_42_0=l4_l3_t_42_1)
      and 
      (
        l4_t_52_0=l4_t_52_1)
      and 
      (
        l4_t_51_0=l4_t_51_1)
      and 
      (
        l4_t_50_0=l4_t_50_1)
      and 
      (
        t_8_0=t_8_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_root_0=roops_core_objectsInstrumented_BinTree_root_1)
      and 
      (
        l4_l3_var_9_y_0=l4_l3_var_9_y_3)
      and 
      (
        l4_l3_var_8_result_0=l4_l3_var_8_result_1)
      and 
      (
        l4_exit_stmt_reached_0=l4_exit_stmt_reached_2)
      and 
      (
        roops_core_objectsInstrumented_BinTreeNode_key_0=roops_core_objectsInstrumented_BinTreeNode_key_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_12_1=roops_core_objectsInstrumented_BinTree_roops_goal_12_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_13_1=roops_core_objectsInstrumented_BinTree_roops_goal_13_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_10_1=roops_core_objectsInstrumented_BinTree_roops_goal_10_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_11_1=roops_core_objectsInstrumented_BinTree_roops_goal_11_2)
      and 
      (
        l4_l3_l2_t_34_0=l4_l3_l2_t_34_1)
      and 
      (
        l4_l3_l2_t_35_0=l4_l3_l2_t_35_1)
      and 
      (
        l4_var_12_x_0=l4_var_12_x_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_17_1=roops_core_objectsInstrumented_BinTree_roops_goal_17_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_16_1=roops_core_objectsInstrumented_BinTree_roops_goal_16_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_15_1=roops_core_objectsInstrumented_BinTree_roops_goal_15_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_14_1=roops_core_objectsInstrumented_BinTree_roops_goal_14_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_19_1=roops_core_objectsInstrumented_BinTree_roops_goal_19_2)
      and 
      (
        l4_var_11_y_0=l4_var_11_y_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_18_1=roops_core_objectsInstrumented_BinTree_roops_goal_18_2)
      and 
      (
        roops_core_objectsInstrumented_BinTreeNode_parent_0=roops_core_objectsInstrumented_BinTreeNode_parent_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_20_1=roops_core_objectsInstrumented_BinTree_roops_goal_20_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_21_1=roops_core_objectsInstrumented_BinTree_roops_goal_21_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_22_1=roops_core_objectsInstrumented_BinTree_roops_goal_22_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_23_1=roops_core_objectsInstrumented_BinTree_roops_goal_23_2)
      and 
      (
        l4_l3_l2_var_6_terminatesInTime_0=l4_l3_l2_var_6_terminatesInTime_1)
      and 
      (
        l4_l3_exit_stmt_reached_0=l4_l3_exit_stmt_reached_2)
      and 
      (
        l4_l3_l2_exit_stmt_reached_0=l4_l3_l2_exit_stmt_reached_2)
      and 
      (
        throw_28=throw_47)
    )
  )
  and 
  TruePred[]

}



pred roops_core_objectsInstrumented_BinTree_treeSuccessor_0[
  thiz_0: roops_core_objectsInstrumented_BinTree,
  throw_1: java_lang_Throwable + null,
  throw_2: java_lang_Throwable + null,
  throw_3: java_lang_Throwable + null,
  throw_4: java_lang_Throwable + null,
  throw_5: java_lang_Throwable + null,
  throw_6: java_lang_Throwable + null,
  throw_7: java_lang_Throwable + null,
  return_0: null + roops_core_objectsInstrumented_BinTreeNode,
  return_1: null + roops_core_objectsInstrumented_BinTreeNode,
  x_param_0: null + roops_core_objectsInstrumented_BinTreeNode,
  roops_core_objectsInstrumented_BinTree_roops_goal_10_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_10_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_11_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_11_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_9_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_9_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_8_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTreeNode_right_0: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTree_roops_goal_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTreeNode_parent_0: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTreeNode_left_0: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  var_10_terminatesInTime_0: boolean,
  var_10_terminatesInTime_1: boolean,
  var_8_result_0: null + roops_core_objectsInstrumented_BinTreeNode,
  var_8_result_1: null + roops_core_objectsInstrumented_BinTreeNode,
  var_9_y_0: null + roops_core_objectsInstrumented_BinTreeNode,
  var_9_y_1: null + roops_core_objectsInstrumented_BinTreeNode,
  var_9_y_2: null + roops_core_objectsInstrumented_BinTreeNode,
  var_9_y_3: null + roops_core_objectsInstrumented_BinTreeNode,
  t_39_0: boolean,
  t_39_1: boolean,
  var_7_x_0: null + roops_core_objectsInstrumented_BinTreeNode,
  var_7_x_1: null + roops_core_objectsInstrumented_BinTreeNode,
  var_7_x_2: null + roops_core_objectsInstrumented_BinTreeNode,
  var_7_x_3: null + roops_core_objectsInstrumented_BinTreeNode,
  t_36_0: null + roops_core_objectsInstrumented_BinTreeNode,
  t_36_1: null + roops_core_objectsInstrumented_BinTreeNode,
  exit_stmt_reached_1: boolean,
  exit_stmt_reached_2: boolean,
  t_38_0: boolean,
  t_38_1: boolean,
  t_37_0: boolean,
  t_37_1: boolean,
  t_43_0: boolean,
  t_43_1: boolean,
  t_42_0: boolean,
  t_42_1: boolean,
  t_41_0: boolean,
  t_41_1: boolean,
  t_40_0: boolean,
  t_40_1: boolean,
  l2_exit_stmt_reached_0: boolean,
  l2_exit_stmt_reached_1: boolean,
  l2_exit_stmt_reached_2: boolean,
  l2_var_6_terminatesInTime_0: boolean,
  l2_var_6_terminatesInTime_1: boolean,
  l2_var_5_x_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l2_var_5_x_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l2_var_5_x_2: null + roops_core_objectsInstrumented_BinTreeNode,
  l2_var_5_x_3: null + roops_core_objectsInstrumented_BinTreeNode,
  l2_t_35_0: boolean,
  l2_t_35_1: boolean,
  l2_t_34_0: boolean,
  l2_t_34_1: boolean
]{
  TruePred[]
  and 
  (
    throw_1=null)
  and 
  TruePred[]
  and 
  (
    exit_stmt_reached_1=false)
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        var_7_x_1=x_param_0)
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        var_7_x_0=var_7_x_1)
    )
  )
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        t_43_1=(neq[var_7_x_1.roops_core_objectsInstrumented_BinTreeNode_right_0,
           null]=>(true)else(false))
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_43_0=t_43_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition60[t_43_1]
          and 
          TruePred[]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_2=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_6_0=roops_core_objectsInstrumented_BinTree_roops_goal_6_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_6_1=(roops_core_objectsInstrumented_BinTree_roops_goal_6_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_1=throw_2)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_1]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_6_0=roops_core_objectsInstrumented_BinTree_roops_goal_6_1)
              and 
              (
                throw_1=throw_2)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition42[thiz_0,
                                                                   var_7_x_1]
                  and 
                  (
                    throw_7=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    l2_var_5_x_0=l2_var_5_x_3)
                  and 
                  (
                    l2_exit_stmt_reached_0=l2_exit_stmt_reached_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
                  and 
                  (
                    l2_t_35_0=l2_t_35_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
                  and 
                  (
                    l2_var_6_terminatesInTime_0=l2_var_6_terminatesInTime_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
                  and 
                  (
                    l2_t_34_0=l2_t_34_1)
                  and 
                  (
                    t_36_0=t_36_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition42[thiz_0,
                                                                       var_7_x_1]
                    )
                  )
                  and 
                  roops_core_objectsInstrumented_BinTree_treeMinimum_0[throw_3,
                                                                      throw_4,
                                                                      throw_5,
                                                                      throw_6,
                                                                      throw_7,
                                                                      t_36_0,
                                                                      t_36_1,
                                                                      var_7_x_1.roops_core_objectsInstrumented_BinTreeNode_right_0,
                                                                      roops_core_objectsInstrumented_BinTree_roops_goal_5_0,
                                                                      roops_core_objectsInstrumented_BinTree_roops_goal_5_1,
                                                                      roops_core_objectsInstrumented_BinTree_roops_goal_4_0,
                                                                      roops_core_objectsInstrumented_BinTree_roops_goal_4_1,
                                                                      roops_core_objectsInstrumented_BinTree_roops_goal_3_0,
                                                                      roops_core_objectsInstrumented_BinTree_roops_goal_3_1,
                                                                      roops_core_objectsInstrumented_BinTree_roops_goal_2_0,
                                                                      roops_core_objectsInstrumented_BinTree_roops_goal_2_1,
                                                                      roops_core_objectsInstrumented_BinTreeNode_left_0,
                                                                      l2_t_35_0,
                                                                      l2_t_35_1,
                                                                      l2_exit_stmt_reached_1,
                                                                      l2_exit_stmt_reached_2,
                                                                      l2_var_5_x_0,
                                                                      l2_var_5_x_1,
                                                                      l2_var_5_x_2,
                                                                      l2_var_5_x_3,
                                                                      l2_var_6_terminatesInTime_0,
                                                                      l2_var_6_terminatesInTime_1,
                                                                      l2_t_34_0,
                                                                      l2_t_34_1]
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_2]
                )
              )
              and 
              TruePred[]
              and 
              (
                l2_var_5_x_0=l2_var_5_x_3)
              and 
              (
                l2_exit_stmt_reached_0=l2_exit_stmt_reached_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
              and 
              (
                l2_t_35_0=l2_t_35_1)
              and 
              (
                l2_var_6_terminatesInTime_0=l2_var_6_terminatesInTime_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
              and 
              (
                l2_t_34_0=l2_t_34_1)
              and 
              (
                t_36_0=t_36_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
              and 
              (
                throw_2=throw_7)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_7]
              and 
              (
                var_8_result_1=t_36_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_7]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_8_result_0=var_8_result_1)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_10_0=roops_core_objectsInstrumented_BinTree_roops_goal_10_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_11_0=roops_core_objectsInstrumented_BinTree_roops_goal_11_1)
          and 
          (
            var_10_terminatesInTime_0=var_10_terminatesInTime_1)
          and 
          (
            var_9_y_0=var_9_y_3)
          and 
          (
            t_38_0=t_38_1)
          and 
          (
            t_39_0=t_39_1)
          and 
          (
            t_37_0=t_37_1)
          and 
          (
            t_42_0=t_42_1)
          and 
          (
            t_41_0=t_41_1)
          and 
          (
            t_40_0=t_40_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_9_0=roops_core_objectsInstrumented_BinTree_roops_goal_9_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_8_0=roops_core_objectsInstrumented_BinTree_roops_goal_8_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_7_0=roops_core_objectsInstrumented_BinTree_roops_goal_7_1)
          and 
          (
            var_7_x_1=var_7_x_3)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition60[t_43_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_2=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_7_0=roops_core_objectsInstrumented_BinTree_roops_goal_7_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_7_1=(roops_core_objectsInstrumented_BinTree_roops_goal_7_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_1=throw_2)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_1]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_7_0=roops_core_objectsInstrumented_BinTree_roops_goal_7_1)
              and 
              (
                throw_1=throw_2)
            )
          )
          and 
          TruePred[]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition44[var_7_x_1]
                  and 
                  (
                    throw_3=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    var_9_y_0=var_9_y_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition44[var_7_x_1])
                  )
                  and 
                  (
                    var_9_y_1=var_7_x_1.roops_core_objectsInstrumented_BinTreeNode_parent_0)
                  and 
                  (
                    throw_2=throw_3)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_2]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_9_y_0=var_9_y_1)
              and 
              (
                throw_2=throw_3)
            )
          )
          and 
          TruePred[]
          and 
          TruePred[]
          and 
          TruePred[]
          and 
          TruePred[]
          and 
          TruePred[]
          and 
          TruePred[]
          and 
          TruePred[]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_3]
              and 
              (
                var_10_terminatesInTime_1=true)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_3]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_10_terminatesInTime_0=var_10_terminatesInTime_1)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_3]
              and 
              (
                t_38_1=(neq[var_9_y_1,
                   null]=>(true)else(false))
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_3]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_38_0=t_38_1)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_3]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition48[t_38_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_3]
                      and 
                      (
                        t_39_1=(equ[var_7_x_1,
                           var_9_y_1.roops_core_objectsInstrumented_BinTreeNode_right_0]=>(true)else(false))
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_3]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_39_0=t_39_1)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_3]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_BinTreeCondition46[t_39_1]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                              throw_3]
                              and 
                              (
                                t_37_1=true)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                                  throw_3]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_37_0=t_37_1)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_BinTreeCondition46[t_39_1])
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                              throw_3]
                              and 
                              (
                                t_37_1=false)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                                  throw_3]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_37_0=t_37_1)
                            )
                          )
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_3]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_37_0=t_37_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition48[t_38_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_3]
                      and 
                      (
                        t_37_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_3]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_37_0=t_37_1)
                    )
                  )
                  and 
                  (
                    t_39_0=t_39_1)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_3]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_37_0=t_37_1)
              and 
              (
                t_39_0=t_39_1)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_3]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition52[t_37_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_3]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_BinTreeCondition0[]
                          and 
                          (
                            throw_4=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_BinTree_roops_goal_8_0=roops_core_objectsInstrumented_BinTree_roops_goal_8_1)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_BinTreeCondition0[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_BinTree_roops_goal_8_1=(roops_core_objectsInstrumented_BinTree_roops_goal_8_0)++((ClassFields)->(true)))
                          and 
                          (
                            throw_3=throw_4)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_3]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_BinTree_roops_goal_8_0=roops_core_objectsInstrumented_BinTree_roops_goal_8_1)
                      and 
                      (
                        throw_3=throw_4)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_4]
                      and 
                      (
                        var_7_x_2=var_9_y_1)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_4]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        var_7_x_1=var_7_x_2)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_4]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_BinTreeCondition50[var_9_y_1]
                          and 
                          (
                            throw_5=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            var_9_y_1=var_9_y_2)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_BinTreeCondition50[var_9_y_1])
                          )
                          and 
                          (
                            var_9_y_2=var_9_y_1.roops_core_objectsInstrumented_BinTreeNode_parent_0)
                          and 
                          (
                            throw_4=throw_5)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_4]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        var_9_y_1=var_9_y_2)
                      and 
                      (
                        throw_4=throw_5)
                    )
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_9_0=roops_core_objectsInstrumented_BinTree_roops_goal_9_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition52[t_37_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_3]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_BinTreeCondition0[]
                          and 
                          (
                            throw_5=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_BinTree_roops_goal_9_0=roops_core_objectsInstrumented_BinTree_roops_goal_9_1)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_BinTreeCondition0[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_BinTree_roops_goal_9_1=(roops_core_objectsInstrumented_BinTree_roops_goal_9_0)++((ClassFields)->(true)))
                          and 
                          (
                            throw_3=throw_5)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_3]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_BinTree_roops_goal_9_0=roops_core_objectsInstrumented_BinTree_roops_goal_9_1)
                      and 
                      (
                        throw_3=throw_5)
                    )
                  )
                  and 
                  (
                    var_7_x_1=var_7_x_2)
                  and 
                  (
                    var_9_y_1=var_9_y_2)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_8_0=roops_core_objectsInstrumented_BinTree_roops_goal_8_1)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_3]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_7_x_1=var_7_x_2)
              and 
              (
                var_9_y_1=var_9_y_2)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_9_0=roops_core_objectsInstrumented_BinTree_roops_goal_9_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_8_0=roops_core_objectsInstrumented_BinTree_roops_goal_8_1)
              and 
              (
                throw_3=throw_5)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_5]
              and 
              (
                t_41_1=(neq[var_9_y_2,
                   null]=>(true)else(false))
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_5]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_41_0=t_41_1)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_5]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition56[t_41_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_5]
                      and 
                      (
                        t_42_1=(equ[var_7_x_2,
                           var_9_y_2.roops_core_objectsInstrumented_BinTreeNode_right_0]=>(true)else(false))
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_5]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_42_0=t_42_1)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_5]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_BinTreeCondition54[t_42_1]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                              throw_5]
                              and 
                              (
                                t_40_1=true)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                                  throw_5]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_40_0=t_40_1)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_BinTreeCondition54[t_42_1])
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                              throw_5]
                              and 
                              (
                                t_40_1=false)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                                  throw_5]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_40_0=t_40_1)
                            )
                          )
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_5]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_40_0=t_40_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition56[t_41_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_5]
                      and 
                      (
                        t_40_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_5]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_40_0=t_40_1)
                    )
                  )
                  and 
                  (
                    t_42_0=t_42_1)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_5]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_42_0=t_42_1)
              and 
              (
                t_40_0=t_40_1)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_5]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition58[t_40_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_5]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_BinTreeCondition0[]
                          and 
                          (
                            throw_6=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_BinTree_roops_goal_10_0=roops_core_objectsInstrumented_BinTree_roops_goal_10_1)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_BinTreeCondition0[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_BinTree_roops_goal_10_1=(roops_core_objectsInstrumented_BinTree_roops_goal_10_0)++((ClassFields)->(true)))
                          and 
                          (
                            throw_5=throw_6)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_5]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_BinTree_roops_goal_10_0=roops_core_objectsInstrumented_BinTree_roops_goal_10_1)
                      and 
                      (
                        throw_5=throw_6)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_6]
                      and 
                      (
                        var_7_x_3=var_9_y_2)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_6]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        var_7_x_2=var_7_x_3)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_6]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_BinTreeCondition50[var_9_y_2]
                          and 
                          (
                            throw_7=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            var_9_y_2=var_9_y_3)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_BinTreeCondition50[var_9_y_2])
                          )
                          and 
                          (
                            var_9_y_3=var_9_y_2.roops_core_objectsInstrumented_BinTreeNode_parent_0)
                          and 
                          (
                            throw_6=throw_7)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_6]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        var_9_y_2=var_9_y_3)
                      and 
                      (
                        throw_6=throw_7)
                    )
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_11_0=roops_core_objectsInstrumented_BinTree_roops_goal_11_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition58[t_40_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_5]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_BinTreeCondition0[]
                          and 
                          (
                            throw_7=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_BinTree_roops_goal_11_0=roops_core_objectsInstrumented_BinTree_roops_goal_11_1)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_BinTreeCondition0[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_BinTree_roops_goal_11_1=(roops_core_objectsInstrumented_BinTree_roops_goal_11_0)++((ClassFields)->(true)))
                          and 
                          (
                            throw_5=throw_7)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_5]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_BinTree_roops_goal_11_0=roops_core_objectsInstrumented_BinTree_roops_goal_11_1)
                      and 
                      (
                        throw_5=throw_7)
                    )
                  )
                  and 
                  (
                    var_7_x_2=var_7_x_3)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_10_0=roops_core_objectsInstrumented_BinTree_roops_goal_10_1)
                  and 
                  (
                    var_9_y_2=var_9_y_3)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_5]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_7_x_2=var_7_x_3)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_10_0=roops_core_objectsInstrumented_BinTree_roops_goal_10_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_11_0=roops_core_objectsInstrumented_BinTree_roops_goal_11_1)
              and 
              (
                var_9_y_2=var_9_y_3)
              and 
              (
                throw_5=throw_7)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_7]
              and 
              (
                var_8_result_1=var_9_y_3)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_7]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_8_result_0=var_8_result_1)
            )
          )
          and 
          (
            l2_var_5_x_0=l2_var_5_x_3)
          and 
          (
            l2_exit_stmt_reached_0=l2_exit_stmt_reached_2)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
          and 
          (
            l2_t_35_0=l2_t_35_1)
          and 
          (
            l2_var_6_terminatesInTime_0=l2_var_6_terminatesInTime_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
          and 
          (
            l2_t_34_0=l2_t_34_1)
          and 
          (
            t_36_0=t_36_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_6_0=roops_core_objectsInstrumented_BinTree_roops_goal_6_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        var_7_x_1=var_7_x_3)
      and 
      (
        var_8_result_0=var_8_result_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_10_0=roops_core_objectsInstrumented_BinTree_roops_goal_10_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_11_0=roops_core_objectsInstrumented_BinTree_roops_goal_11_1)
      and 
      (
        l2_exit_stmt_reached_0=l2_exit_stmt_reached_2)
      and 
      (
        var_9_y_0=var_9_y_3)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
      and 
      (
        l2_var_6_terminatesInTime_0=l2_var_6_terminatesInTime_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
      and 
      (
        t_42_0=t_42_1)
      and 
      (
        t_41_0=t_41_1)
      and 
      (
        t_40_0=t_40_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_9_0=roops_core_objectsInstrumented_BinTree_roops_goal_9_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_8_0=roops_core_objectsInstrumented_BinTree_roops_goal_8_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_7_0=roops_core_objectsInstrumented_BinTree_roops_goal_7_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_6_0=roops_core_objectsInstrumented_BinTree_roops_goal_6_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
      and 
      (
        l2_var_5_x_0=l2_var_5_x_3)
      and 
      (
        var_10_terminatesInTime_0=var_10_terminatesInTime_1)
      and 
      (
        t_38_0=t_38_1)
      and 
      (
        t_39_0=t_39_1)
      and 
      (
        l2_t_35_0=l2_t_35_1)
      and 
      (
        t_37_0=t_37_1)
      and 
      (
        l2_t_34_0=l2_t_34_1)
      and 
      (
        t_36_0=t_36_1)
      and 
      (
        throw_1=throw_7)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_7]
      and 
      (
        return_1=var_8_result_1)
      and 
      (
        exit_stmt_reached_2=true)
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_7]
        )
      )
      and 
      TruePred[]
      and 
      (
        return_0=return_1)
      and 
      (
        exit_stmt_reached_1=exit_stmt_reached_2)
    )
  )
  and 
  TruePred[]

}



pred roops_core_objectsInstrumented_BinTree_treeMinimum_0[
  throw_1: java_lang_Throwable + null,
  throw_2: java_lang_Throwable + null,
  throw_3: java_lang_Throwable + null,
  throw_4: java_lang_Throwable + null,
  throw_5: java_lang_Throwable + null,
  return_0: null + roops_core_objectsInstrumented_BinTreeNode,
  return_1: null + roops_core_objectsInstrumented_BinTreeNode,
  x_param_0: null + roops_core_objectsInstrumented_BinTreeNode,
  roops_core_objectsInstrumented_BinTree_roops_goal_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTreeNode_left_0: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  t_35_0: boolean,
  t_35_1: boolean,
  exit_stmt_reached_1: boolean,
  exit_stmt_reached_2: boolean,
  var_5_x_0: null + roops_core_objectsInstrumented_BinTreeNode,
  var_5_x_1: null + roops_core_objectsInstrumented_BinTreeNode,
  var_5_x_2: null + roops_core_objectsInstrumented_BinTreeNode,
  var_5_x_3: null + roops_core_objectsInstrumented_BinTreeNode,
  var_6_terminatesInTime_0: boolean,
  var_6_terminatesInTime_1: boolean,
  t_34_0: boolean,
  t_34_1: boolean
]{
  TruePred[]
  and 
  (
    throw_1=null)
  and 
  TruePred[]
  and 
  (
    exit_stmt_reached_1=false)
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        var_5_x_1=x_param_0)
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        var_5_x_0=var_5_x_1)
    )
  )
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        var_6_terminatesInTime_1=true)
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        var_6_terminatesInTime_0=var_6_terminatesInTime_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        t_34_1=(neq[var_5_x_1.roops_core_objectsInstrumented_BinTreeNode_left_0,
           null]=>(true)else(false))
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_34_0=t_34_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition64[t_34_1]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_2=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_2_1=(roops_core_objectsInstrumented_BinTree_roops_goal_2_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_1=throw_2)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_1]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
              and 
              (
                throw_1=throw_2)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition62[var_5_x_1]
                  and 
                  (
                    throw_3=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    var_5_x_1=var_5_x_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition62[var_5_x_1])
                  )
                  and 
                  (
                    var_5_x_2=var_5_x_1.roops_core_objectsInstrumented_BinTreeNode_left_0)
                  and 
                  (
                    throw_2=throw_3)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_2]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_5_x_1=var_5_x_2)
              and 
              (
                throw_2=throw_3)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition64[t_34_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_3=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_3_1=(roops_core_objectsInstrumented_BinTree_roops_goal_3_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_1=throw_3)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_1]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
              and 
              (
                throw_1=throw_3)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
          and 
          (
            var_5_x_1=var_5_x_2)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
      and 
      (
        var_5_x_1=var_5_x_2)
      and 
      (
        throw_1=throw_3)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_3]
      and 
      (
        t_35_1=(neq[var_5_x_2.roops_core_objectsInstrumented_BinTreeNode_left_0,
           null]=>(true)else(false))
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_3]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_35_0=t_35_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_3]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition66[t_35_1]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_3]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_4=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_4_1=(roops_core_objectsInstrumented_BinTree_roops_goal_4_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_3=throw_4)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_3]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
              and 
              (
                throw_3=throw_4)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_4]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition62[var_5_x_2]
                  and 
                  (
                    throw_5=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    var_5_x_2=var_5_x_3)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition62[var_5_x_2])
                  )
                  and 
                  (
                    var_5_x_3=var_5_x_2.roops_core_objectsInstrumented_BinTreeNode_left_0)
                  and 
                  (
                    throw_4=throw_5)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_4]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_5_x_2=var_5_x_3)
              and 
              (
                throw_4=throw_5)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition66[t_35_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_3]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_5=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_5_1=(roops_core_objectsInstrumented_BinTree_roops_goal_5_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_3=throw_5)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_3]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
              and 
              (
                throw_3=throw_5)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
          and 
          (
            var_5_x_2=var_5_x_3)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_3]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
      and 
      (
        var_5_x_2=var_5_x_3)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
      and 
      (
        throw_3=throw_5)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_5]
      and 
      (
        return_1=var_5_x_3)
      and 
      (
        exit_stmt_reached_2=true)
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_5]
        )
      )
      and 
      TruePred[]
      and 
      (
        return_0=return_1)
      and 
      (
        exit_stmt_reached_1=exit_stmt_reached_2)
    )
  )
  and 
  TruePred[]

}



pred roops_core_objectsInstrumented_BinTree_remove_0[
  thiz_0: roops_core_objectsInstrumented_BinTree,
  throw_1: java_lang_Throwable + null,
  throw_2: java_lang_Throwable + null,
  throw_3: java_lang_Throwable + null,
  throw_4: java_lang_Throwable + null,
  throw_5: java_lang_Throwable + null,
  throw_6: java_lang_Throwable + null,
  throw_7: java_lang_Throwable + null,
  throw_8: java_lang_Throwable + null,
  throw_9: java_lang_Throwable + null,
  throw_10: java_lang_Throwable + null,
  throw_11: java_lang_Throwable + null,
  throw_12: java_lang_Throwable + null,
  throw_13: java_lang_Throwable + null,
  throw_14: java_lang_Throwable + null,
  throw_15: java_lang_Throwable + null,
  throw_16: java_lang_Throwable + null,
  throw_17: java_lang_Throwable + null,
  throw_18: java_lang_Throwable + null,
  return_0: null + roops_core_objectsInstrumented_BinTreeNode,
  return_1: null + roops_core_objectsInstrumented_BinTreeNode,
  z_0: null + roops_core_objectsInstrumented_BinTreeNode,
  roops_core_objectsInstrumented_BinTree_roops_goal_10_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_10_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_13_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_13_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_14_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_14_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_11_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_11_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_12_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_12_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTreeNode_key_0: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( JavaPrimitiveIntegerValue ),
  roops_core_objectsInstrumented_BinTreeNode_key_1: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( JavaPrimitiveIntegerValue ),
  roops_core_objectsInstrumented_BinTree_roops_goal_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_18_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_18_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_17_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_17_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_16_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_16_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_15_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_15_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_9_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_9_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_8_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTreeNode_right_0: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTreeNode_right_1: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTree_roops_goal_19_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_19_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTreeNode_parent_0: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTreeNode_parent_1: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTree_roops_goal_20_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_20_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTreeNode_left_0: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTreeNode_left_1: ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTree_roops_goal_21_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_21_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_22_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_22_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_23_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_23_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_root_0: ( roops_core_objectsInstrumented_BinTree ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTree_root_1: ( roops_core_objectsInstrumented_BinTree ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  t_49_0: boolean,
  t_49_1: boolean,
  t_48_0: boolean,
  t_48_1: boolean,
  t_47_0: boolean,
  t_47_1: boolean,
  exit_stmt_reached_1: boolean,
  exit_stmt_reached_2: boolean,
  t_46_0: boolean,
  t_46_1: boolean,
  t_45_0: boolean,
  t_45_1: boolean,
  var_12_x_0: null + roops_core_objectsInstrumented_BinTreeNode,
  var_12_x_1: null + roops_core_objectsInstrumented_BinTreeNode,
  var_12_x_2: null + roops_core_objectsInstrumented_BinTreeNode,
  t_44_0: null + roops_core_objectsInstrumented_BinTreeNode,
  t_44_1: null + roops_core_objectsInstrumented_BinTreeNode,
  t_50_0: boolean,
  t_50_1: boolean,
  var_11_y_0: null + roops_core_objectsInstrumented_BinTreeNode,
  var_11_y_1: null + roops_core_objectsInstrumented_BinTreeNode,
  var_11_y_2: null + roops_core_objectsInstrumented_BinTreeNode,
  t_52_0: boolean,
  t_52_1: boolean,
  t_51_0: boolean,
  t_51_1: boolean,
  l3_exit_stmt_reached_0: boolean,
  l3_exit_stmt_reached_1: boolean,
  l3_exit_stmt_reached_2: boolean,
  l3_t_42_0: boolean,
  l3_t_42_1: boolean,
  l3_t_41_0: boolean,
  l3_t_41_1: boolean,
  l3_t_43_0: boolean,
  l3_t_43_1: boolean,
  l3_var_10_terminatesInTime_0: boolean,
  l3_var_10_terminatesInTime_1: boolean,
  l3_t_40_0: boolean,
  l3_t_40_1: boolean,
  l3_t_37_0: boolean,
  l3_t_37_1: boolean,
  l3_t_36_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_t_36_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_l2_var_5_x_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_l2_var_5_x_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_l2_var_5_x_2: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_l2_var_5_x_3: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_t_39_0: boolean,
  l3_t_39_1: boolean,
  l3_t_38_0: boolean,
  l3_t_38_1: boolean,
  l3_var_8_result_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_var_8_result_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_var_9_y_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_var_9_y_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_var_9_y_2: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_var_9_y_3: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_l2_t_34_0: boolean,
  l3_l2_t_34_1: boolean,
  l3_l2_exit_stmt_reached_0: boolean,
  l3_l2_exit_stmt_reached_1: boolean,
  l3_l2_exit_stmt_reached_2: boolean,
  l3_l2_t_35_0: boolean,
  l3_l2_t_35_1: boolean,
  l3_l2_var_6_terminatesInTime_0: boolean,
  l3_l2_var_6_terminatesInTime_1: boolean,
  l3_var_7_x_0: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_var_7_x_1: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_var_7_x_2: null + roops_core_objectsInstrumented_BinTreeNode,
  l3_var_7_x_3: null + roops_core_objectsInstrumented_BinTreeNode
]{
  TruePred[]
  and 
  (
    throw_1=null)
  and 
  TruePred[]
  and 
  (
    exit_stmt_reached_1=false)
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        var_11_y_1=((null+roops_core_objectsInstrumented_BinTreeNode) & (null)))
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        var_11_y_0=var_11_y_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        t_46_1=(equ[z_0.roops_core_objectsInstrumented_BinTreeNode_left_0,
           null]=>(true)else(false))
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_46_0=t_46_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition18[t_46_1]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_1]
              and 
              (
                t_45_1=true)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_1]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_45_0=t_45_1)
            )
          )
          and 
          (
            t_47_0=t_47_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition18[t_46_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_1]
              and 
              (
                t_47_1=(equ[z_0.roops_core_objectsInstrumented_BinTreeNode_right_0,
                   null]=>(true)else(false))
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_1]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_47_0=t_47_1)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition16[t_47_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_1]
                      and 
                      (
                        t_45_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_1]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_45_0=t_45_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition16[t_47_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_1]
                      and 
                      (
                        t_45_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_1]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_45_0=t_45_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_1]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_45_0=t_45_1)
            )
          )
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_47_0=t_47_1)
      and 
      (
        t_45_0=t_45_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition22[t_45_1]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_9=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_12_0=roops_core_objectsInstrumented_BinTree_roops_goal_12_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_12_1=(roops_core_objectsInstrumented_BinTree_roops_goal_12_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_1=throw_9)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_1]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_12_0=roops_core_objectsInstrumented_BinTree_roops_goal_12_1)
              and 
              (
                throw_1=throw_9)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_9]
              and 
              (
                var_11_y_2=z_0)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_9]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_11_y_1=var_11_y_2)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_13_0=roops_core_objectsInstrumented_BinTree_roops_goal_13_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_10_0=roops_core_objectsInstrumented_BinTree_roops_goal_10_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_11_0=roops_core_objectsInstrumented_BinTree_roops_goal_11_1)
          and 
          (
            l3_exit_stmt_reached_0=l3_exit_stmt_reached_2)
          and 
          (
            l3_var_8_result_0=l3_var_8_result_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
          and 
          (
            l3_t_42_0=l3_t_42_1)
          and 
          (
            l3_var_9_y_0=l3_var_9_y_3)
          and 
          (
            t_44_0=t_44_1)
          and 
          (
            l3_t_41_0=l3_t_41_1)
          and 
          (
            l3_t_43_0=l3_t_43_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_9_0=roops_core_objectsInstrumented_BinTree_roops_goal_9_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_8_0=roops_core_objectsInstrumented_BinTree_roops_goal_8_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_7_0=roops_core_objectsInstrumented_BinTree_roops_goal_7_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_6_0=roops_core_objectsInstrumented_BinTree_roops_goal_6_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
          and 
          (
            l3_var_10_terminatesInTime_0=l3_var_10_terminatesInTime_1)
          and 
          (
            l3_t_40_0=l3_t_40_1)
          and 
          (
            l3_l2_t_34_0=l3_l2_t_34_1)
          and 
          (
            l3_l2_exit_stmt_reached_0=l3_l2_exit_stmt_reached_2)
          and 
          (
            l3_l2_t_35_0=l3_l2_t_35_1)
          and 
          (
            l3_t_37_0=l3_t_37_1)
          and 
          (
            l3_t_36_0=l3_t_36_1)
          and 
          (
            l3_l2_var_5_x_0=l3_l2_var_5_x_3)
          and 
          (
            l3_l2_var_6_terminatesInTime_0=l3_l2_var_6_terminatesInTime_1)
          and 
          (
            l3_var_7_x_0=l3_var_7_x_3)
          and 
          (
            l3_t_39_0=l3_t_39_1)
          and 
          (
            l3_t_38_0=l3_t_38_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition22[t_45_1])
          )
          and 
          TruePred[]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_2=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_13_0=roops_core_objectsInstrumented_BinTree_roops_goal_13_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_13_1=(roops_core_objectsInstrumented_BinTree_roops_goal_13_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_1=throw_2)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_1]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_13_0=roops_core_objectsInstrumented_BinTree_roops_goal_13_1)
              and 
              (
                throw_1=throw_2)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition20[thiz_0]
                  and 
                  (
                    throw_9=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_10_0=roops_core_objectsInstrumented_BinTree_roops_goal_10_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_11_0=roops_core_objectsInstrumented_BinTree_roops_goal_11_1)
                  and 
                  (
                    l3_exit_stmt_reached_0=l3_exit_stmt_reached_2)
                  and 
                  (
                    l3_var_8_result_0=l3_var_8_result_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
                  and 
                  (
                    l3_t_42_0=l3_t_42_1)
                  and 
                  (
                    l3_var_9_y_0=l3_var_9_y_3)
                  and 
                  (
                    t_44_0=t_44_1)
                  and 
                  (
                    l3_t_41_0=l3_t_41_1)
                  and 
                  (
                    l3_t_43_0=l3_t_43_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_9_0=roops_core_objectsInstrumented_BinTree_roops_goal_9_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_8_0=roops_core_objectsInstrumented_BinTree_roops_goal_8_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_7_0=roops_core_objectsInstrumented_BinTree_roops_goal_7_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_6_0=roops_core_objectsInstrumented_BinTree_roops_goal_6_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
                  and 
                  (
                    l3_var_10_terminatesInTime_0=l3_var_10_terminatesInTime_1)
                  and 
                  (
                    l3_t_40_0=l3_t_40_1)
                  and 
                  (
                    l3_l2_t_34_0=l3_l2_t_34_1)
                  and 
                  (
                    l3_l2_exit_stmt_reached_0=l3_l2_exit_stmt_reached_2)
                  and 
                  (
                    l3_l2_t_35_0=l3_l2_t_35_1)
                  and 
                  (
                    l3_t_37_0=l3_t_37_1)
                  and 
                  (
                    l3_t_36_0=l3_t_36_1)
                  and 
                  (
                    l3_l2_var_5_x_0=l3_l2_var_5_x_3)
                  and 
                  (
                    l3_l2_var_6_terminatesInTime_0=l3_l2_var_6_terminatesInTime_1)
                  and 
                  (
                    l3_var_7_x_0=l3_var_7_x_3)
                  and 
                  (
                    l3_t_39_0=l3_t_39_1)
                  and 
                  (
                    l3_t_38_0=l3_t_38_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition20[thiz_0])
                  )
                  and 
                  roops_core_objectsInstrumented_BinTree_treeSuccessor_0[thiz_0,
                                                                        throw_3,
                                                                        throw_4,
                                                                        throw_5,
                                                                        throw_6,
                                                                        throw_7,
                                                                        throw_8,
                                                                        throw_9,
                                                                        t_44_0,
                                                                        t_44_1,
                                                                        z_0,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_10_0,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_10_1,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_11_0,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_11_1,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_5_0,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_5_1,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_4_0,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_4_1,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_3_0,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_3_1,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_2_0,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_2_1,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_9_0,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_9_1,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_8_0,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_8_1,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_7_0,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_7_1,
                                                                        roops_core_objectsInstrumented_BinTreeNode_right_0,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_6_0,
                                                                        roops_core_objectsInstrumented_BinTree_roops_goal_6_1,
                                                                        roops_core_objectsInstrumented_BinTreeNode_parent_0,
                                                                        roops_core_objectsInstrumented_BinTreeNode_left_0,
                                                                        l3_var_10_terminatesInTime_0,
                                                                        l3_var_10_terminatesInTime_1,
                                                                        l3_var_8_result_0,
                                                                        l3_var_8_result_1,
                                                                        l3_var_9_y_0,
                                                                        l3_var_9_y_1,
                                                                        l3_var_9_y_2,
                                                                        l3_var_9_y_3,
                                                                        l3_t_39_0,
                                                                        l3_t_39_1,
                                                                        l3_var_7_x_0,
                                                                        l3_var_7_x_1,
                                                                        l3_var_7_x_2,
                                                                        l3_var_7_x_3,
                                                                        l3_t_36_0,
                                                                        l3_t_36_1,
                                                                        l3_exit_stmt_reached_1,
                                                                        l3_exit_stmt_reached_2,
                                                                        l3_t_38_0,
                                                                        l3_t_38_1,
                                                                        l3_t_37_0,
                                                                        l3_t_37_1,
                                                                        l3_t_43_0,
                                                                        l3_t_43_1,
                                                                        l3_t_42_0,
                                                                        l3_t_42_1,
                                                                        l3_t_41_0,
                                                                        l3_t_41_1,
                                                                        l3_t_40_0,
                                                                        l3_t_40_1,
                                                                        l3_l2_exit_stmt_reached_0,
                                                                        l3_l2_exit_stmt_reached_1,
                                                                        l3_l2_exit_stmt_reached_2,
                                                                        l3_l2_var_6_terminatesInTime_0,
                                                                        l3_l2_var_6_terminatesInTime_1,
                                                                        l3_l2_var_5_x_0,
                                                                        l3_l2_var_5_x_1,
                                                                        l3_l2_var_5_x_2,
                                                                        l3_l2_var_5_x_3,
                                                                        l3_l2_t_35_0,
                                                                        l3_l2_t_35_1,
                                                                        l3_l2_t_34_0,
                                                                        l3_l2_t_34_1]
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_2]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_10_0=roops_core_objectsInstrumented_BinTree_roops_goal_10_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_11_0=roops_core_objectsInstrumented_BinTree_roops_goal_11_1)
              and 
              (
                l3_exit_stmt_reached_0=l3_exit_stmt_reached_2)
              and 
              (
                l3_var_8_result_0=l3_var_8_result_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
              and 
              (
                l3_t_42_0=l3_t_42_1)
              and 
              (
                l3_var_9_y_0=l3_var_9_y_3)
              and 
              (
                t_44_0=t_44_1)
              and 
              (
                l3_t_41_0=l3_t_41_1)
              and 
              (
                l3_t_43_0=l3_t_43_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_9_0=roops_core_objectsInstrumented_BinTree_roops_goal_9_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_8_0=roops_core_objectsInstrumented_BinTree_roops_goal_8_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_7_0=roops_core_objectsInstrumented_BinTree_roops_goal_7_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_6_0=roops_core_objectsInstrumented_BinTree_roops_goal_6_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
              and 
              (
                l3_var_10_terminatesInTime_0=l3_var_10_terminatesInTime_1)
              and 
              (
                l3_t_40_0=l3_t_40_1)
              and 
              (
                l3_l2_t_34_0=l3_l2_t_34_1)
              and 
              (
                l3_l2_exit_stmt_reached_0=l3_l2_exit_stmt_reached_2)
              and 
              (
                l3_l2_t_35_0=l3_l2_t_35_1)
              and 
              (
                l3_t_37_0=l3_t_37_1)
              and 
              (
                l3_t_36_0=l3_t_36_1)
              and 
              (
                l3_l2_var_5_x_0=l3_l2_var_5_x_3)
              and 
              (
                l3_l2_var_6_terminatesInTime_0=l3_l2_var_6_terminatesInTime_1)
              and 
              (
                l3_var_7_x_0=l3_var_7_x_3)
              and 
              (
                l3_t_39_0=l3_t_39_1)
              and 
              (
                l3_t_38_0=l3_t_38_1)
              and 
              (
                throw_2=throw_9)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_9]
              and 
              (
                var_11_y_2=t_44_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_9]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_11_y_1=var_11_y_2)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_12_0=roops_core_objectsInstrumented_BinTree_roops_goal_12_1)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_12_0=roops_core_objectsInstrumented_BinTree_roops_goal_12_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_13_0=roops_core_objectsInstrumented_BinTree_roops_goal_13_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_10_0=roops_core_objectsInstrumented_BinTree_roops_goal_10_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_11_0=roops_core_objectsInstrumented_BinTree_roops_goal_11_1)
      and 
      (
        l3_exit_stmt_reached_0=l3_exit_stmt_reached_2)
      and 
      (
        var_11_y_1=var_11_y_2)
      and 
      (
        l3_var_8_result_0=l3_var_8_result_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
      and 
      (
        l3_t_42_0=l3_t_42_1)
      and 
      (
        l3_var_9_y_0=l3_var_9_y_3)
      and 
      (
        t_44_0=t_44_1)
      and 
      (
        l3_t_41_0=l3_t_41_1)
      and 
      (
        l3_t_43_0=l3_t_43_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_9_0=roops_core_objectsInstrumented_BinTree_roops_goal_9_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_8_0=roops_core_objectsInstrumented_BinTree_roops_goal_8_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_7_0=roops_core_objectsInstrumented_BinTree_roops_goal_7_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_6_0=roops_core_objectsInstrumented_BinTree_roops_goal_6_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
      and 
      (
        l3_var_10_terminatesInTime_0=l3_var_10_terminatesInTime_1)
      and 
      (
        l3_t_40_0=l3_t_40_1)
      and 
      (
        l3_l2_t_34_0=l3_l2_t_34_1)
      and 
      (
        l3_l2_exit_stmt_reached_0=l3_l2_exit_stmt_reached_2)
      and 
      (
        l3_l2_t_35_0=l3_l2_t_35_1)
      and 
      (
        l3_t_37_0=l3_t_37_1)
      and 
      (
        l3_t_36_0=l3_t_36_1)
      and 
      (
        l3_l2_var_5_x_0=l3_l2_var_5_x_3)
      and 
      (
        l3_l2_var_6_terminatesInTime_0=l3_l2_var_6_terminatesInTime_1)
      and 
      (
        l3_var_7_x_0=l3_var_7_x_3)
      and 
      (
        l3_t_39_0=l3_t_39_1)
      and 
      (
        l3_t_38_0=l3_t_38_1)
      and 
      (
        throw_1=throw_9)
    )
  )
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_9]
      and 
      (
        var_12_x_1=((null+roops_core_objectsInstrumented_BinTreeNode) & (null)))
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_9]
        )
      )
      and 
      TruePred[]
      and 
      (
        var_12_x_0=var_12_x_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_9]
      and 
      (
        t_48_1=(neq[var_11_y_2.roops_core_objectsInstrumented_BinTreeNode_left_0,
           null]=>(true)else(false))
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_9]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_48_0=t_48_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_9]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition26[t_48_1]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_9]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_10=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_14_0=roops_core_objectsInstrumented_BinTree_roops_goal_14_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_14_1=(roops_core_objectsInstrumented_BinTree_roops_goal_14_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_9=throw_10)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_9]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_14_0=roops_core_objectsInstrumented_BinTree_roops_goal_14_1)
              and 
              (
                throw_9=throw_10)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_10]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition24[var_11_y_2]
                  and 
                  (
                    throw_11=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    var_12_x_1=var_12_x_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition24[var_11_y_2])
                  )
                  and 
                  (
                    var_12_x_2=var_11_y_2.roops_core_objectsInstrumented_BinTreeNode_left_0)
                  and 
                  (
                    throw_10=throw_11)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_10]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_12_x_1=var_12_x_2)
              and 
              (
                throw_10=throw_11)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_15_0=roops_core_objectsInstrumented_BinTree_roops_goal_15_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition26[t_48_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_9]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_10=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_15_0=roops_core_objectsInstrumented_BinTree_roops_goal_15_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_15_1=(roops_core_objectsInstrumented_BinTree_roops_goal_15_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_9=throw_10)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_9]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_15_0=roops_core_objectsInstrumented_BinTree_roops_goal_15_1)
              and 
              (
                throw_9=throw_10)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_10]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition24[var_11_y_2]
                  and 
                  (
                    throw_11=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    var_12_x_1=var_12_x_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition24[var_11_y_2])
                  )
                  and 
                  (
                    var_12_x_2=var_11_y_2.roops_core_objectsInstrumented_BinTreeNode_right_0)
                  and 
                  (
                    throw_10=throw_11)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_10]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_12_x_1=var_12_x_2)
              and 
              (
                throw_10=throw_11)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_14_0=roops_core_objectsInstrumented_BinTree_roops_goal_14_1)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_9]
        )
      )
      and 
      TruePred[]
      and 
      (
        var_12_x_1=var_12_x_2)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_15_0=roops_core_objectsInstrumented_BinTree_roops_goal_15_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_14_0=roops_core_objectsInstrumented_BinTree_roops_goal_14_1)
      and 
      (
        throw_9=throw_11)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_11]
      and 
      (
        t_49_1=(neq[var_12_x_2,
           null]=>(true)else(false))
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_11]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_49_0=t_49_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_11]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition30[t_49_1]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_11]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_12=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_16_0=roops_core_objectsInstrumented_BinTree_roops_goal_16_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_16_1=(roops_core_objectsInstrumented_BinTree_roops_goal_16_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_11=throw_12)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_11]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_16_0=roops_core_objectsInstrumented_BinTree_roops_goal_16_1)
              and 
              (
                throw_11=throw_12)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_12]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition28[var_11_y_2,
                                                                   var_12_x_2]
                  and 
                  (
                    throw_13=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTreeNode_parent_0=roops_core_objectsInstrumented_BinTreeNode_parent_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition28[var_11_y_2,
                                                                       var_12_x_2]
                    )
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTreeNode_parent_1=(roops_core_objectsInstrumented_BinTreeNode_parent_0)++((var_12_x_2)->(var_11_y_2.roops_core_objectsInstrumented_BinTreeNode_parent_0)))
                  and 
                  (
                    throw_12=throw_13)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_12]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTreeNode_parent_0=roops_core_objectsInstrumented_BinTreeNode_parent_1)
              and 
              (
                throw_12=throw_13)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_17_0=roops_core_objectsInstrumented_BinTree_roops_goal_17_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition30[t_49_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_11]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_13=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_17_0=roops_core_objectsInstrumented_BinTree_roops_goal_17_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_17_1=(roops_core_objectsInstrumented_BinTree_roops_goal_17_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_11=throw_13)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_11]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_17_0=roops_core_objectsInstrumented_BinTree_roops_goal_17_1)
              and 
              (
                throw_11=throw_13)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTreeNode_parent_0=roops_core_objectsInstrumented_BinTreeNode_parent_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_16_0=roops_core_objectsInstrumented_BinTree_roops_goal_16_1)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_11]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTreeNode_parent_0=roops_core_objectsInstrumented_BinTreeNode_parent_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_17_0=roops_core_objectsInstrumented_BinTree_roops_goal_17_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_16_0=roops_core_objectsInstrumented_BinTree_roops_goal_16_1)
      and 
      (
        throw_11=throw_13)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_13]
      and 
      (
        t_51_1=(equ[var_11_y_2.roops_core_objectsInstrumented_BinTreeNode_parent_1,
           null]=>(true)else(false))
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_13]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_51_0=t_51_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_13]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition36[t_51_1]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_13]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_14=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_18_0=roops_core_objectsInstrumented_BinTree_roops_goal_18_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_18_1=(roops_core_objectsInstrumented_BinTree_roops_goal_18_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_13=throw_14)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_13]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_18_0=roops_core_objectsInstrumented_BinTree_roops_goal_18_1)
              and 
              (
                throw_13=throw_14)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_14]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition20[thiz_0]
                  and 
                  (
                    throw_16=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_root_0=roops_core_objectsInstrumented_BinTree_root_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition20[thiz_0])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_root_1=(roops_core_objectsInstrumented_BinTree_root_0)++((thiz_0)->(var_12_x_2)))
                  and 
                  (
                    throw_14=throw_16)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_14]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_root_0=roops_core_objectsInstrumented_BinTree_root_1)
              and 
              (
                throw_14=throw_16)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTreeNode_left_0=roops_core_objectsInstrumented_BinTreeNode_left_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_20_0=roops_core_objectsInstrumented_BinTree_roops_goal_20_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_21_0=roops_core_objectsInstrumented_BinTree_roops_goal_21_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_19_0=roops_core_objectsInstrumented_BinTree_roops_goal_19_1)
          and 
          (
            roops_core_objectsInstrumented_BinTreeNode_right_0=roops_core_objectsInstrumented_BinTreeNode_right_1)
          and 
          (
            t_50_0=t_50_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition36[t_51_1])
          )
          and 
          TruePred[]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_13]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_14=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_19_0=roops_core_objectsInstrumented_BinTree_roops_goal_19_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_19_1=(roops_core_objectsInstrumented_BinTree_roops_goal_19_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_13=throw_14)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_13]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_19_0=roops_core_objectsInstrumented_BinTree_roops_goal_19_1)
              and 
              (
                throw_13=throw_14)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_14]
              and 
              (
                t_50_1=(equ[var_11_y_2,
                   (var_11_y_2.roops_core_objectsInstrumented_BinTreeNode_parent_1).roops_core_objectsInstrumented_BinTreeNode_left_0]=>(true)else(false))
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_14]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_50_0=t_50_1)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_14]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition34[t_50_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_14]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_BinTreeCondition0[]
                          and 
                          (
                            throw_15=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_BinTree_roops_goal_20_0=roops_core_objectsInstrumented_BinTree_roops_goal_20_1)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_BinTreeCondition0[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_BinTree_roops_goal_20_1=(roops_core_objectsInstrumented_BinTree_roops_goal_20_0)++((ClassFields)->(true)))
                          and 
                          (
                            throw_14=throw_15)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_14]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_BinTree_roops_goal_20_0=roops_core_objectsInstrumented_BinTree_roops_goal_20_1)
                      and 
                      (
                        throw_14=throw_15)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_15]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_BinTreeCondition32[roops_core_objectsInstrumented_BinTreeNode_parent_1,
                                                                           var_11_y_2]
                          and 
                          (
                            throw_16=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_BinTreeNode_left_0=roops_core_objectsInstrumented_BinTreeNode_left_1)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_BinTreeCondition32[roops_core_objectsInstrumented_BinTreeNode_parent_1,
                                                                               var_11_y_2]
                            )
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_BinTreeNode_left_1=(roops_core_objectsInstrumented_BinTreeNode_left_0)++((var_11_y_2.roops_core_objectsInstrumented_BinTreeNode_parent_1)->(var_12_x_2)))
                          and 
                          (
                            throw_15=throw_16)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_15]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_BinTreeNode_left_0=roops_core_objectsInstrumented_BinTreeNode_left_1)
                      and 
                      (
                        throw_15=throw_16)
                    )
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_21_0=roops_core_objectsInstrumented_BinTree_roops_goal_21_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTreeNode_right_0=roops_core_objectsInstrumented_BinTreeNode_right_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition34[t_50_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_14]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_BinTreeCondition0[]
                          and 
                          (
                            throw_15=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_BinTree_roops_goal_21_0=roops_core_objectsInstrumented_BinTree_roops_goal_21_1)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_BinTreeCondition0[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_BinTree_roops_goal_21_1=(roops_core_objectsInstrumented_BinTree_roops_goal_21_0)++((ClassFields)->(true)))
                          and 
                          (
                            throw_14=throw_15)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_14]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_BinTree_roops_goal_21_0=roops_core_objectsInstrumented_BinTree_roops_goal_21_1)
                      and 
                      (
                        throw_14=throw_15)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                      throw_15]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_BinTreeCondition32[roops_core_objectsInstrumented_BinTreeNode_parent_1,
                                                                           var_11_y_2]
                          and 
                          (
                            throw_16=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_BinTreeNode_right_0=roops_core_objectsInstrumented_BinTreeNode_right_1)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_BinTreeCondition32[roops_core_objectsInstrumented_BinTreeNode_parent_1,
                                                                               var_11_y_2]
                            )
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_BinTreeNode_right_1=(roops_core_objectsInstrumented_BinTreeNode_right_0)++((var_11_y_2.roops_core_objectsInstrumented_BinTreeNode_parent_1)->(var_12_x_2)))
                          and 
                          (
                            throw_15=throw_16)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                          throw_15]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_BinTreeNode_right_0=roops_core_objectsInstrumented_BinTreeNode_right_1)
                      and 
                      (
                        throw_15=throw_16)
                    )
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTreeNode_left_0=roops_core_objectsInstrumented_BinTreeNode_left_1)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_20_0=roops_core_objectsInstrumented_BinTree_roops_goal_20_1)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_14]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTreeNode_left_0=roops_core_objectsInstrumented_BinTreeNode_left_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_20_0=roops_core_objectsInstrumented_BinTree_roops_goal_20_1)
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_21_0=roops_core_objectsInstrumented_BinTree_roops_goal_21_1)
              and 
              (
                roops_core_objectsInstrumented_BinTreeNode_right_0=roops_core_objectsInstrumented_BinTreeNode_right_1)
              and 
              (
                throw_14=throw_16)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_root_0=roops_core_objectsInstrumented_BinTree_root_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_18_0=roops_core_objectsInstrumented_BinTree_roops_goal_18_1)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_13]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTreeNode_left_0=roops_core_objectsInstrumented_BinTreeNode_left_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_20_0=roops_core_objectsInstrumented_BinTree_roops_goal_20_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_21_0=roops_core_objectsInstrumented_BinTree_roops_goal_21_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_root_0=roops_core_objectsInstrumented_BinTree_root_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_19_0=roops_core_objectsInstrumented_BinTree_roops_goal_19_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_18_0=roops_core_objectsInstrumented_BinTree_roops_goal_18_1)
      and 
      (
        roops_core_objectsInstrumented_BinTreeNode_right_0=roops_core_objectsInstrumented_BinTreeNode_right_1)
      and 
      (
        t_50_0=t_50_1)
      and 
      (
        throw_13=throw_16)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_16]
      and 
      (
        t_52_1=(neq[var_11_y_2,
           z_0]=>(true)else(false))
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_16]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_52_0=t_52_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_16]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition40[t_52_1]
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_16]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_17=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_22_0=roops_core_objectsInstrumented_BinTree_roops_goal_22_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_22_1=(roops_core_objectsInstrumented_BinTree_roops_goal_22_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_16=throw_17)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_16]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_22_0=roops_core_objectsInstrumented_BinTree_roops_goal_22_1)
              and 
              (
                throw_16=throw_17)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_17]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition38[var_11_y_2,
                                                                   z_0]
                  and 
                  (
                    throw_18=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTreeNode_key_0=roops_core_objectsInstrumented_BinTreeNode_key_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition38[var_11_y_2,
                                                                       z_0]
                    )
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTreeNode_key_1=(roops_core_objectsInstrumented_BinTreeNode_key_0)++((z_0)->(var_11_y_2.roops_core_objectsInstrumented_BinTreeNode_key_0)))
                  and 
                  (
                    throw_17=throw_18)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_17]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTreeNode_key_0=roops_core_objectsInstrumented_BinTreeNode_key_1)
              and 
              (
                throw_17=throw_18)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_23_0=roops_core_objectsInstrumented_BinTree_roops_goal_23_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition40[t_52_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                              throw_16]
              and 
              (
                (
                  roops_core_objectsInstrumented_BinTreeCondition0[]
                  and 
                  (
                    throw_18=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_23_0=roops_core_objectsInstrumented_BinTree_roops_goal_23_1)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_BinTreeCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_BinTree_roops_goal_23_1=(roops_core_objectsInstrumented_BinTree_roops_goal_23_0)++((ClassFields)->(true)))
                  and 
                  (
                    throw_16=throw_18)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                                  throw_16]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_BinTree_roops_goal_23_0=roops_core_objectsInstrumented_BinTree_roops_goal_23_1)
              and 
              (
                throw_16=throw_18)
            )
          )
          and 
          (
            roops_core_objectsInstrumented_BinTreeNode_key_0=roops_core_objectsInstrumented_BinTreeNode_key_1)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_22_0=roops_core_objectsInstrumented_BinTree_roops_goal_22_1)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_16]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTreeNode_key_0=roops_core_objectsInstrumented_BinTreeNode_key_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_22_0=roops_core_objectsInstrumented_BinTree_roops_goal_22_1)
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_23_0=roops_core_objectsInstrumented_BinTree_roops_goal_23_1)
      and 
      (
        throw_16=throw_18)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_18]
      and 
      (
        return_1=var_11_y_2)
      and 
      (
        exit_stmt_reached_2=true)
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_18]
        )
      )
      and 
      TruePred[]
      and 
      (
        return_0=return_1)
      and 
      (
        exit_stmt_reached_1=exit_stmt_reached_2)
    )
  )
  and 
  TruePred[]

}



pred roops_core_objectsInstrumented_BinTree_repOK_0[
  throw_1: java_lang_Throwable + null,
  return_0: boolean,
  return_1: boolean,
  exit_stmt_reached_1: boolean,
  exit_stmt_reached_2: boolean
]{
  TruePred[]
  and 
  (
    throw_1=null)
  and 
  TruePred[]
  and 
  (
    exit_stmt_reached_1=false)
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        return_1=true)
      and 
      (
        exit_stmt_reached_2=true)
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        return_0=return_1)
      and 
      (
        exit_stmt_reached_1=exit_stmt_reached_2)
    )
  )
  and 
  TruePred[]

}



pred roops_core_objectsInstrumented_BinTree_fajita_roopsGoal_initialization_0[
  throw_1: java_lang_Throwable + null,
  throw_2: java_lang_Throwable + null,
  throw_3: java_lang_Throwable + null,
  throw_4: java_lang_Throwable + null,
  throw_5: java_lang_Throwable + null,
  throw_6: java_lang_Throwable + null,
  throw_7: java_lang_Throwable + null,
  throw_8: java_lang_Throwable + null,
  throw_9: java_lang_Throwable + null,
  throw_10: java_lang_Throwable + null,
  throw_11: java_lang_Throwable + null,
  throw_12: java_lang_Throwable + null,
  throw_13: java_lang_Throwable + null,
  throw_14: java_lang_Throwable + null,
  throw_15: java_lang_Throwable + null,
  throw_16: java_lang_Throwable + null,
  throw_17: java_lang_Throwable + null,
  throw_18: java_lang_Throwable + null,
  throw_19: java_lang_Throwable + null,
  throw_20: java_lang_Throwable + null,
  throw_21: java_lang_Throwable + null,
  throw_22: java_lang_Throwable + null,
  throw_23: java_lang_Throwable + null,
  throw_24: java_lang_Throwable + null,
  throw_25: java_lang_Throwable + null,
  throw_26: java_lang_Throwable + null,
  roops_core_objectsInstrumented_BinTree_roops_goal_10_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_10_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_13_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_13_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_14_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_14_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_11_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_11_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_12_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_12_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_1_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_1_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_0_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_0_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_18_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_18_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_17_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_17_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_16_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_16_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_15_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_15_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_9_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_9_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_8_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_19_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_19_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_20_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_20_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_21_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_21_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_22_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_22_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_23_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_23_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_myRoopsArray_0: ( ClassFields ) -> one ( null + roops_utilInstrumented_RoopsArray ),
  roops_core_objectsInstrumented_BinTree_myRoopsArray_1: ( ClassFields ) -> one ( null + roops_utilInstrumented_RoopsArray ),
  exit_stmt_reached_1: boolean
]{
  TruePred[]
  and 
  (
    throw_1=null)
  and 
  TruePred[]
  and 
  (
    exit_stmt_reached_1=false)
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_2=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_0_0=roops_core_objectsInstrumented_BinTree_roops_goal_0_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_0_1=(roops_core_objectsInstrumented_BinTree_roops_goal_0_0)++((ClassFields)->(false)))
          and 
          (
            throw_1=throw_2)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_0_0=roops_core_objectsInstrumented_BinTree_roops_goal_0_1)
      and 
      (
        throw_1=throw_2)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_2]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_3=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_1_0=roops_core_objectsInstrumented_BinTree_roops_goal_1_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_1_1=(roops_core_objectsInstrumented_BinTree_roops_goal_1_0)++((ClassFields)->(false)))
          and 
          (
            throw_2=throw_3)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_2]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_1_0=roops_core_objectsInstrumented_BinTree_roops_goal_1_1)
      and 
      (
        throw_2=throw_3)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_3]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_4=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_2_1=(roops_core_objectsInstrumented_BinTree_roops_goal_2_0)++((ClassFields)->(false)))
          and 
          (
            throw_3=throw_4)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_3]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_2_0=roops_core_objectsInstrumented_BinTree_roops_goal_2_1)
      and 
      (
        throw_3=throw_4)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_4]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_5=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_3_1=(roops_core_objectsInstrumented_BinTree_roops_goal_3_0)++((ClassFields)->(false)))
          and 
          (
            throw_4=throw_5)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_4]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_3_0=roops_core_objectsInstrumented_BinTree_roops_goal_3_1)
      and 
      (
        throw_4=throw_5)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_5]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_6=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_4_1=(roops_core_objectsInstrumented_BinTree_roops_goal_4_0)++((ClassFields)->(false)))
          and 
          (
            throw_5=throw_6)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_5]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_4_0=roops_core_objectsInstrumented_BinTree_roops_goal_4_1)
      and 
      (
        throw_5=throw_6)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_6]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_7=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_5_1=(roops_core_objectsInstrumented_BinTree_roops_goal_5_0)++((ClassFields)->(false)))
          and 
          (
            throw_6=throw_7)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_6]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_5_0=roops_core_objectsInstrumented_BinTree_roops_goal_5_1)
      and 
      (
        throw_6=throw_7)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_7]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_8=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_6_0=roops_core_objectsInstrumented_BinTree_roops_goal_6_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_6_1=(roops_core_objectsInstrumented_BinTree_roops_goal_6_0)++((ClassFields)->(false)))
          and 
          (
            throw_7=throw_8)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_7]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_6_0=roops_core_objectsInstrumented_BinTree_roops_goal_6_1)
      and 
      (
        throw_7=throw_8)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_8]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_9=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_7_0=roops_core_objectsInstrumented_BinTree_roops_goal_7_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_7_1=(roops_core_objectsInstrumented_BinTree_roops_goal_7_0)++((ClassFields)->(false)))
          and 
          (
            throw_8=throw_9)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_8]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_7_0=roops_core_objectsInstrumented_BinTree_roops_goal_7_1)
      and 
      (
        throw_8=throw_9)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_9]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_10=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_8_0=roops_core_objectsInstrumented_BinTree_roops_goal_8_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_8_1=(roops_core_objectsInstrumented_BinTree_roops_goal_8_0)++((ClassFields)->(false)))
          and 
          (
            throw_9=throw_10)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_9]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_8_0=roops_core_objectsInstrumented_BinTree_roops_goal_8_1)
      and 
      (
        throw_9=throw_10)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_10]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_11=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_9_0=roops_core_objectsInstrumented_BinTree_roops_goal_9_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_9_1=(roops_core_objectsInstrumented_BinTree_roops_goal_9_0)++((ClassFields)->(false)))
          and 
          (
            throw_10=throw_11)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_10]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_9_0=roops_core_objectsInstrumented_BinTree_roops_goal_9_1)
      and 
      (
        throw_10=throw_11)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_11]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_12=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_10_0=roops_core_objectsInstrumented_BinTree_roops_goal_10_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_10_1=(roops_core_objectsInstrumented_BinTree_roops_goal_10_0)++((ClassFields)->(false)))
          and 
          (
            throw_11=throw_12)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_11]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_10_0=roops_core_objectsInstrumented_BinTree_roops_goal_10_1)
      and 
      (
        throw_11=throw_12)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_12]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_13=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_11_0=roops_core_objectsInstrumented_BinTree_roops_goal_11_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_11_1=(roops_core_objectsInstrumented_BinTree_roops_goal_11_0)++((ClassFields)->(false)))
          and 
          (
            throw_12=throw_13)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_12]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_11_0=roops_core_objectsInstrumented_BinTree_roops_goal_11_1)
      and 
      (
        throw_12=throw_13)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_13]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_14=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_12_0=roops_core_objectsInstrumented_BinTree_roops_goal_12_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_12_1=(roops_core_objectsInstrumented_BinTree_roops_goal_12_0)++((ClassFields)->(false)))
          and 
          (
            throw_13=throw_14)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_13]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_12_0=roops_core_objectsInstrumented_BinTree_roops_goal_12_1)
      and 
      (
        throw_13=throw_14)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_14]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_15=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_13_0=roops_core_objectsInstrumented_BinTree_roops_goal_13_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_13_1=(roops_core_objectsInstrumented_BinTree_roops_goal_13_0)++((ClassFields)->(false)))
          and 
          (
            throw_14=throw_15)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_14]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_13_0=roops_core_objectsInstrumented_BinTree_roops_goal_13_1)
      and 
      (
        throw_14=throw_15)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_15]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_16=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_14_0=roops_core_objectsInstrumented_BinTree_roops_goal_14_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_14_1=(roops_core_objectsInstrumented_BinTree_roops_goal_14_0)++((ClassFields)->(false)))
          and 
          (
            throw_15=throw_16)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_15]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_14_0=roops_core_objectsInstrumented_BinTree_roops_goal_14_1)
      and 
      (
        throw_15=throw_16)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_16]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_17=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_15_0=roops_core_objectsInstrumented_BinTree_roops_goal_15_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_15_1=(roops_core_objectsInstrumented_BinTree_roops_goal_15_0)++((ClassFields)->(false)))
          and 
          (
            throw_16=throw_17)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_16]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_15_0=roops_core_objectsInstrumented_BinTree_roops_goal_15_1)
      and 
      (
        throw_16=throw_17)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_17]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_18=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_16_0=roops_core_objectsInstrumented_BinTree_roops_goal_16_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_16_1=(roops_core_objectsInstrumented_BinTree_roops_goal_16_0)++((ClassFields)->(false)))
          and 
          (
            throw_17=throw_18)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_17]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_16_0=roops_core_objectsInstrumented_BinTree_roops_goal_16_1)
      and 
      (
        throw_17=throw_18)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_18]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_19=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_17_0=roops_core_objectsInstrumented_BinTree_roops_goal_17_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_17_1=(roops_core_objectsInstrumented_BinTree_roops_goal_17_0)++((ClassFields)->(false)))
          and 
          (
            throw_18=throw_19)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_18]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_17_0=roops_core_objectsInstrumented_BinTree_roops_goal_17_1)
      and 
      (
        throw_18=throw_19)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_19]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_20=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_18_0=roops_core_objectsInstrumented_BinTree_roops_goal_18_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_18_1=(roops_core_objectsInstrumented_BinTree_roops_goal_18_0)++((ClassFields)->(false)))
          and 
          (
            throw_19=throw_20)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_19]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_18_0=roops_core_objectsInstrumented_BinTree_roops_goal_18_1)
      and 
      (
        throw_19=throw_20)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_20]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_21=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_19_0=roops_core_objectsInstrumented_BinTree_roops_goal_19_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_19_1=(roops_core_objectsInstrumented_BinTree_roops_goal_19_0)++((ClassFields)->(false)))
          and 
          (
            throw_20=throw_21)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_20]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_19_0=roops_core_objectsInstrumented_BinTree_roops_goal_19_1)
      and 
      (
        throw_20=throw_21)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_21]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_22=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_20_0=roops_core_objectsInstrumented_BinTree_roops_goal_20_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_20_1=(roops_core_objectsInstrumented_BinTree_roops_goal_20_0)++((ClassFields)->(false)))
          and 
          (
            throw_21=throw_22)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_21]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_20_0=roops_core_objectsInstrumented_BinTree_roops_goal_20_1)
      and 
      (
        throw_21=throw_22)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_22]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_23=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_21_0=roops_core_objectsInstrumented_BinTree_roops_goal_21_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_21_1=(roops_core_objectsInstrumented_BinTree_roops_goal_21_0)++((ClassFields)->(false)))
          and 
          (
            throw_22=throw_23)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_22]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_21_0=roops_core_objectsInstrumented_BinTree_roops_goal_21_1)
      and 
      (
        throw_22=throw_23)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_23]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_24=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_22_0=roops_core_objectsInstrumented_BinTree_roops_goal_22_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_22_1=(roops_core_objectsInstrumented_BinTree_roops_goal_22_0)++((ClassFields)->(false)))
          and 
          (
            throw_23=throw_24)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_23]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_22_0=roops_core_objectsInstrumented_BinTree_roops_goal_22_1)
      and 
      (
        throw_23=throw_24)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_24]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_25=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_23_0=roops_core_objectsInstrumented_BinTree_roops_goal_23_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_roops_goal_23_1=(roops_core_objectsInstrumented_BinTree_roops_goal_23_0)++((ClassFields)->(false)))
          and 
          (
            throw_24=throw_25)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_24]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_roops_goal_23_0=roops_core_objectsInstrumented_BinTree_roops_goal_23_1)
      and 
      (
        throw_24=throw_25)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                      throw_25]
      and 
      (
        (
          roops_core_objectsInstrumented_BinTreeCondition0[]
          and 
          (
            throw_26=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_BinTree_myRoopsArray_0=roops_core_objectsInstrumented_BinTree_myRoopsArray_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_BinTreeCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_BinTree_myRoopsArray_1=(roops_core_objectsInstrumented_BinTree_myRoopsArray_0)++((ClassFields)->(((null+roops_utilInstrumented_RoopsArray) & (null)))))
          and 
          (
            throw_25=throw_26)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_BinTreeCondition2[exit_stmt_reached_1,
                                                          throw_25]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_BinTree_myRoopsArray_0=roops_core_objectsInstrumented_BinTree_myRoopsArray_1)
      and 
      (
        throw_25=throw_26)
    )
  )
  and 
  TruePred[]

}

one sig QF {
  BQ__0: boolean,
  BQ__1: boolean,
  BQ__2: boolean,
  BQ__3: boolean,
  BQ__4: boolean,
  BQ__5: boolean,
  BQ__6: boolean,
  BQ__7: boolean,
  BQ__8: boolean,
  BQ__9: boolean,
  BQ__10: boolean,
  BQ__11: boolean,
  BQ__12: boolean,
  BQ__13: boolean,
  BQ__14: boolean,
  BQ__15: boolean,
  BQ__17: boolean,
  BQ__16: boolean,
  BQ__19: boolean,
  BQ__18: boolean,
  BQ__21: boolean,
  BQ__20: boolean,
  BQ__23: boolean,
  BQ__22: boolean,
  l5_exit_stmt_reached_1:  boolean,
  l5_l0_exit_stmt_reached_1:  boolean,
  l5_l1_exit_stmt_reached_0:  boolean,
  l5_l1_exit_stmt_reached_1:  boolean,
  l5_l1_exit_stmt_reached_2:  boolean,
  l5_l4_exit_stmt_reached_0:  boolean,
  l5_l4_exit_stmt_reached_1:  boolean,
  l5_l4_exit_stmt_reached_2:  boolean,
  l5_l4_l3_exit_stmt_reached_0:  boolean,
  l5_l4_l3_exit_stmt_reached_1:  boolean,
  l5_l4_l3_exit_stmt_reached_2:  boolean,
  l5_l4_l3_l2_exit_stmt_reached_0:  boolean,
  l5_l4_l3_l2_exit_stmt_reached_1:  boolean,
  l5_l4_l3_l2_exit_stmt_reached_2:  boolean,
  l5_l4_l3_l2_t_34_0:  boolean,
  l5_l4_l3_l2_t_34_1:  boolean,
  l5_l4_l3_l2_t_35_0:  boolean,
  l5_l4_l3_l2_t_35_1:  boolean,
  l5_l4_l3_l2_var_5_x_0:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_l2_var_5_x_1:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_l2_var_5_x_2:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_l2_var_5_x_3:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_l2_var_6_terminatesInTime_0:  boolean,
  l5_l4_l3_l2_var_6_terminatesInTime_1:  boolean,
  l5_l4_l3_t_36_0:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_t_36_1:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_t_37_0:  boolean,
  l5_l4_l3_t_37_1:  boolean,
  l5_l4_l3_t_38_0:  boolean,
  l5_l4_l3_t_38_1:  boolean,
  l5_l4_l3_t_39_0:  boolean,
  l5_l4_l3_t_39_1:  boolean,
  l5_l4_l3_t_40_0:  boolean,
  l5_l4_l3_t_40_1:  boolean,
  l5_l4_l3_t_41_0:  boolean,
  l5_l4_l3_t_41_1:  boolean,
  l5_l4_l3_t_42_0:  boolean,
  l5_l4_l3_t_42_1:  boolean,
  l5_l4_l3_t_43_0:  boolean,
  l5_l4_l3_t_43_1:  boolean,
  l5_l4_l3_var_10_terminatesInTime_0:  boolean,
  l5_l4_l3_var_10_terminatesInTime_1:  boolean,
  l5_l4_l3_var_7_x_0:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_var_7_x_1:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_var_7_x_2:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_var_7_x_3:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_var_8_result_0:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_var_8_result_1:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_var_9_y_0:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_var_9_y_1:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_var_9_y_2:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_l3_var_9_y_3:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_t_44_0:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_t_44_1:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_t_45_0:  boolean,
  l5_l4_t_45_1:  boolean,
  l5_l4_t_46_0:  boolean,
  l5_l4_t_46_1:  boolean,
  l5_l4_t_47_0:  boolean,
  l5_l4_t_47_1:  boolean,
  l5_l4_t_48_0:  boolean,
  l5_l4_t_48_1:  boolean,
  l5_l4_t_49_0:  boolean,
  l5_l4_t_49_1:  boolean,
  l5_l4_t_50_0:  boolean,
  l5_l4_t_50_1:  boolean,
  l5_l4_t_51_0:  boolean,
  l5_l4_t_51_1:  boolean,
  l5_l4_t_52_0:  boolean,
  l5_l4_t_52_1:  boolean,
  l5_l4_var_11_y_0:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_var_11_y_1:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_var_11_y_2:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_var_12_x_0:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_var_12_x_1:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_l4_var_12_x_2:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_t_10_0:  boolean,
  l5_t_10_1:  boolean,
  l5_t_11_0:  boolean,
  l5_t_11_1:  boolean,
  l5_t_12_0:  boolean,
  l5_t_12_1:  boolean,
  l5_t_13_0:  boolean,
  l5_t_13_1:  boolean,
  l5_t_8_0:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_t_8_1:  null + roops_core_objectsInstrumented_BinTreeNode,
  l5_t_9_0:  boolean,
  l5_t_9_1:  boolean,
  roops_core_objectsInstrumented_BinTreeNode_key_0:  ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( JavaPrimitiveIntegerValue ),
  roops_core_objectsInstrumented_BinTreeNode_key_1:  ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( JavaPrimitiveIntegerValue ),
  roops_core_objectsInstrumented_BinTreeNode_left_0:  ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTreeNode_left_1:  ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTreeNode_parent_0:  ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTreeNode_parent_1:  ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTreeNode_right_0:  ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTreeNode_right_1:  ( roops_core_objectsInstrumented_BinTreeNode ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTree_myRoopsArray_0:  ( ClassFields ) -> one ( null + roops_utilInstrumented_RoopsArray ),
  roops_core_objectsInstrumented_BinTree_myRoopsArray_1:  ( ClassFields ) -> one ( null + roops_utilInstrumented_RoopsArray ),
  roops_core_objectsInstrumented_BinTree_roops_goal_0_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_0_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_0_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_10_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_10_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_10_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_11_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_11_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_11_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_12_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_12_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_12_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_13_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_13_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_13_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_14_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_14_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_14_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_15_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_15_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_15_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_16_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_16_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_16_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_17_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_17_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_17_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_18_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_18_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_18_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_19_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_19_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_19_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_1_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_1_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_1_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_20_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_20_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_20_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_21_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_21_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_21_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_22_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_22_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_22_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_23_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_23_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_23_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_2_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_3_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_4_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_5_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_5_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_5_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_6_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_6_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_6_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_7_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_7_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_7_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_8_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_8_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_8_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_9_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_9_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_roops_goal_9_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_BinTree_root_0:  ( roops_core_objectsInstrumented_BinTree ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  roops_core_objectsInstrumented_BinTree_root_1:  ( roops_core_objectsInstrumented_BinTree ) -> one ( null + roops_core_objectsInstrumented_BinTreeNode ),
  throw_0:  java_lang_Throwable + null,
  throw_1:  java_lang_Throwable + null,
  throw_10:  java_lang_Throwable + null,
  throw_11:  java_lang_Throwable + null,
  throw_12:  java_lang_Throwable + null,
  throw_13:  java_lang_Throwable + null,
  throw_14:  java_lang_Throwable + null,
  throw_15:  java_lang_Throwable + null,
  throw_16:  java_lang_Throwable + null,
  throw_17:  java_lang_Throwable + null,
  throw_18:  java_lang_Throwable + null,
  throw_19:  java_lang_Throwable + null,
  throw_2:  java_lang_Throwable + null,
  throw_20:  java_lang_Throwable + null,
  throw_21:  java_lang_Throwable + null,
  throw_22:  java_lang_Throwable + null,
  throw_23:  java_lang_Throwable + null,
  throw_24:  java_lang_Throwable + null,
  throw_25:  java_lang_Throwable + null,
  throw_26:  java_lang_Throwable + null,
  throw_27:  java_lang_Throwable + null,
  throw_28:  java_lang_Throwable + null,
  throw_29:  java_lang_Throwable + null,
  throw_3:  java_lang_Throwable + null,
  throw_30:  java_lang_Throwable + null,
  throw_31:  java_lang_Throwable + null,
  throw_32:  java_lang_Throwable + null,
  throw_33:  java_lang_Throwable + null,
  throw_34:  java_lang_Throwable + null,
  throw_35:  java_lang_Throwable + null,
  throw_36:  java_lang_Throwable + null,
  throw_37:  java_lang_Throwable + null,
  throw_38:  java_lang_Throwable + null,
  throw_39:  java_lang_Throwable + null,
  throw_4:  java_lang_Throwable + null,
  throw_40:  java_lang_Throwable + null,
  throw_41:  java_lang_Throwable + null,
  throw_42:  java_lang_Throwable + null,
  throw_43:  java_lang_Throwable + null,
  throw_44:  java_lang_Throwable + null,
  throw_45:  java_lang_Throwable + null,
  throw_46:  java_lang_Throwable + null,
  throw_47:  java_lang_Throwable + null,
  throw_5:  java_lang_Throwable + null,
  throw_6:  java_lang_Throwable + null,
  throw_7:  java_lang_Throwable + null,
  throw_8:  java_lang_Throwable + null,
  throw_9:  java_lang_Throwable + null,
  tree_0:  null + roops_core_objectsInstrumented_BinTree,
  z_0:  null + roops_core_objectsInstrumented_BinTreeNode
}


fact {
  precondition_roops_core_objectsInstrumented_BinTree_removeTest_0[QF.roops_core_objectsInstrumented_BinTreeNode_key_0,
                                                                  QF.roops_core_objectsInstrumented_BinTreeNode_left_0,
                                                                  QF.roops_core_objectsInstrumented_BinTreeNode_parent_0,
                                                                  QF.roops_core_objectsInstrumented_BinTreeNode_right_0,
                                                                  QF.roops_core_objectsInstrumented_BinTree_root_0,
                                                                  QF.throw_0]

}

fact {
  roops_core_objectsInstrumented_BinTree_removeTest_0[QF.throw_1,
                                                     QF.throw_2,
                                                     QF.throw_3,
                                                     QF.throw_4,
                                                     QF.throw_5,
                                                     QF.throw_6,
                                                     QF.throw_7,
                                                     QF.throw_8,
                                                     QF.throw_9,
                                                     QF.throw_10,
                                                     QF.throw_11,
                                                     QF.throw_12,
                                                     QF.throw_13,
                                                     QF.throw_14,
                                                     QF.throw_15,
                                                     QF.throw_16,
                                                     QF.throw_17,
                                                     QF.throw_18,
                                                     QF.throw_19,
                                                     QF.throw_20,
                                                     QF.throw_21,
                                                     QF.throw_22,
                                                     QF.throw_23,
                                                     QF.throw_24,
                                                     QF.throw_25,
                                                     QF.throw_26,
                                                     QF.throw_27,
                                                     QF.throw_28,
                                                     QF.throw_29,
                                                     QF.throw_30,
                                                     QF.throw_31,
                                                     QF.throw_32,
                                                     QF.throw_33,
                                                     QF.throw_34,
                                                     QF.throw_35,
                                                     QF.throw_36,
                                                     QF.throw_37,
                                                     QF.throw_38,
                                                     QF.throw_39,
                                                     QF.throw_40,
                                                     QF.throw_41,
                                                     QF.throw_42,
                                                     QF.throw_43,
                                                     QF.throw_44,
                                                     QF.throw_45,
                                                     QF.throw_46,
                                                     QF.throw_47,
                                                     QF.tree_0,
                                                     QF.z_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_10_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_10_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_10_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_13_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_13_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_13_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_14_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_14_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_14_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_11_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_11_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_11_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_12_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_12_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_12_2,
                                                     QF.roops_core_objectsInstrumented_BinTreeNode_key_0,
                                                     QF.roops_core_objectsInstrumented_BinTreeNode_key_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_5_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_5_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_5_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_4_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_4_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_4_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_3_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_3_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_3_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_2_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_2_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_2_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_1_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_1_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_1_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_0_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_0_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_0_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_18_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_18_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_18_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_17_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_17_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_17_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_16_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_16_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_16_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_15_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_15_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_15_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_9_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_9_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_9_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_8_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_8_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_8_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_7_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_7_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_7_2,
                                                     QF.roops_core_objectsInstrumented_BinTreeNode_right_0,
                                                     QF.roops_core_objectsInstrumented_BinTreeNode_right_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_19_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_19_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_19_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_6_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_6_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_6_2,
                                                     QF.roops_core_objectsInstrumented_BinTreeNode_parent_0,
                                                     QF.roops_core_objectsInstrumented_BinTreeNode_parent_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_20_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_20_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_20_2,
                                                     QF.roops_core_objectsInstrumented_BinTreeNode_left_0,
                                                     QF.roops_core_objectsInstrumented_BinTreeNode_left_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_21_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_21_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_21_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_22_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_22_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_22_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_23_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_23_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_roops_goal_23_2,
                                                     QF.roops_core_objectsInstrumented_BinTree_myRoopsArray_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_myRoopsArray_1,
                                                     QF.roops_core_objectsInstrumented_BinTree_root_0,
                                                     QF.roops_core_objectsInstrumented_BinTree_root_1,
                                                     QF.l5_exit_stmt_reached_1,
                                                     QF.l5_t_8_0,
                                                     QF.l5_t_8_1,
                                                     QF.l5_t_13_0,
                                                     QF.l5_t_13_1,
                                                     QF.l5_t_9_0,
                                                     QF.l5_t_9_1,
                                                     QF.l5_t_11_0,
                                                     QF.l5_t_11_1,
                                                     QF.l5_t_12_0,
                                                     QF.l5_t_12_1,
                                                     QF.l5_t_10_0,
                                                     QF.l5_t_10_1,
                                                     QF.l5_l0_exit_stmt_reached_1,
                                                     QF.l5_l4_l3_var_7_x_0,
                                                     QF.l5_l4_l3_var_7_x_1,
                                                     QF.l5_l4_l3_var_7_x_2,
                                                     QF.l5_l4_l3_var_7_x_3,
                                                     QF.l5_l4_l3_t_39_0,
                                                     QF.l5_l4_l3_t_39_1,
                                                     QF.l5_l4_l3_t_37_0,
                                                     QF.l5_l4_l3_t_37_1,
                                                     QF.l5_l4_l3_t_38_0,
                                                     QF.l5_l4_l3_t_38_1,
                                                     QF.l5_l4_l3_t_36_0,
                                                     QF.l5_l4_l3_t_36_1,
                                                     QF.l5_l4_l3_var_10_terminatesInTime_0,
                                                     QF.l5_l4_l3_var_10_terminatesInTime_1,
                                                     QF.l5_l4_t_48_0,
                                                     QF.l5_l4_t_48_1,
                                                     QF.l5_l4_t_49_0,
                                                     QF.l5_l4_t_49_1,
                                                     QF.l5_l4_t_46_0,
                                                     QF.l5_l4_t_46_1,
                                                     QF.l5_l4_t_47_0,
                                                     QF.l5_l4_t_47_1,
                                                     QF.l5_l4_t_44_0,
                                                     QF.l5_l4_t_44_1,
                                                     QF.l5_l4_t_45_0,
                                                     QF.l5_l4_t_45_1,
                                                     QF.l5_l4_l3_l2_var_5_x_0,
                                                     QF.l5_l4_l3_l2_var_5_x_1,
                                                     QF.l5_l4_l3_l2_var_5_x_2,
                                                     QF.l5_l4_l3_l2_var_5_x_3,
                                                     QF.l5_l4_l3_t_41_0,
                                                     QF.l5_l4_l3_t_41_1,
                                                     QF.l5_l4_l3_t_40_0,
                                                     QF.l5_l4_l3_t_40_1,
                                                     QF.l5_l4_l3_t_43_0,
                                                     QF.l5_l4_l3_t_43_1,
                                                     QF.l5_l4_l3_t_42_0,
                                                     QF.l5_l4_l3_t_42_1,
                                                     QF.l5_l4_t_52_0,
                                                     QF.l5_l4_t_52_1,
                                                     QF.l5_l4_t_51_0,
                                                     QF.l5_l4_t_51_1,
                                                     QF.l5_l4_t_50_0,
                                                     QF.l5_l4_t_50_1,
                                                     QF.l5_l4_l3_var_9_y_0,
                                                     QF.l5_l4_l3_var_9_y_1,
                                                     QF.l5_l4_l3_var_9_y_2,
                                                     QF.l5_l4_l3_var_9_y_3,
                                                     QF.l5_l4_exit_stmt_reached_0,
                                                     QF.l5_l4_exit_stmt_reached_1,
                                                     QF.l5_l4_exit_stmt_reached_2,
                                                     QF.l5_l4_l3_var_8_result_0,
                                                     QF.l5_l4_l3_var_8_result_1,
                                                     QF.l5_l1_exit_stmt_reached_0,
                                                     QF.l5_l1_exit_stmt_reached_1,
                                                     QF.l5_l1_exit_stmt_reached_2,
                                                     QF.l5_l4_l3_l2_t_34_0,
                                                     QF.l5_l4_l3_l2_t_34_1,
                                                     QF.l5_l4_l3_l2_t_35_0,
                                                     QF.l5_l4_l3_l2_t_35_1,
                                                     QF.l5_l4_var_12_x_0,
                                                     QF.l5_l4_var_12_x_1,
                                                     QF.l5_l4_var_12_x_2,
                                                     QF.l5_l4_var_11_y_0,
                                                     QF.l5_l4_var_11_y_1,
                                                     QF.l5_l4_var_11_y_2,
                                                     QF.l5_l4_l3_l2_var_6_terminatesInTime_0,
                                                     QF.l5_l4_l3_l2_var_6_terminatesInTime_1,
                                                     QF.l5_l4_l3_exit_stmt_reached_0,
                                                     QF.l5_l4_l3_exit_stmt_reached_1,
                                                     QF.l5_l4_l3_exit_stmt_reached_2,
                                                     QF.l5_l4_l3_l2_exit_stmt_reached_0,
                                                     QF.l5_l4_l3_l2_exit_stmt_reached_1,
                                                     QF.l5_l4_l3_l2_exit_stmt_reached_2]

}

assert check_roops_core_objectsInstrumented_BinTree_removeTest_0{
  postcondition_roops_core_objectsInstrumented_BinTree_removeTest_0[QF.roops_core_objectsInstrumented_BinTreeNode_key_1,
                                                                   QF.roops_core_objectsInstrumented_BinTreeNode_left_1,
                                                                   QF.roops_core_objectsInstrumented_BinTreeNode_parent_1,
                                                                   QF.roops_core_objectsInstrumented_BinTreeNode_right_1,
                                                                   QF.roops_core_objectsInstrumented_BinTree_root_1,
                                                                   QF.throw_47]
}
fun fun_java_primitive_integer_value_literal_1[]: one JavaPrimitiveIntegerValue {
 { ret: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_literal_1[ret] }
}
fun fun_java_primitive_integer_value_literal_2[]: one JavaPrimitiveIntegerValue {
 { ret: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_literal_2[ret] }
}
fun fun_java_primitive_integer_value_literal_3[]: one JavaPrimitiveIntegerValue {
 { ret: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_literal_3[ret] }
}
fun fun_java_primitive_integer_value_literal_4[]: one JavaPrimitiveIntegerValue {
 { ret: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_literal_4[ret] }
}
fun fun_java_primitive_integer_value_literal_5[]: one JavaPrimitiveIntegerValue {
 { ret: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_literal_5[ret] }
}
fun fun_java_primitive_integer_value_literal_6[]: one JavaPrimitiveIntegerValue {
 { ret: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_literal_6[ret] }
}
fun fun_java_primitive_integer_value_literal_7[]: one JavaPrimitiveIntegerValue {
 { ret: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_literal_7[ret] }
}
fun fun_java_primitive_integer_value_size_of[s: set univ]: one JavaPrimitiveIntegerValue {
  { ret: JavaPrimitiveIntegerValue | pred_java_primitive_integer_value_size_of[s,ret]} 
}
pred pred_java_primitive_integer_value_literal_1[ret: JavaPrimitiveIntegerValue] {
 ret.b00=true 
 ret.b01=false 
 ret.b02=false 
 ret.b03=false 
 ret.b04=false 
 ret.b05=false 
 ret.b06=false 
 ret.b07=false 
 ret.b08=false 
 ret.b09=false 
 ret.b10=false 
 ret.b11=false 
 ret.b12=false 
 ret.b13=false 
 ret.b14=false 
 ret.b15=false 
 ret.b16=false 
 ret.b17=false 
 ret.b18=false 
 ret.b19=false 
 ret.b20=false 
 ret.b21=false 
 ret.b22=false 
 ret.b23=false 
 ret.b24=false 
 ret.b25=false 
 ret.b26=false 
 ret.b27=false 
 ret.b28=false 
 ret.b29=false 
 ret.b30=false 
 ret.b31=false 
}
pred pred_java_primitive_integer_value_literal_2[ret: JavaPrimitiveIntegerValue] {
 ret.b00=false 
 ret.b01=true 
 ret.b02=false 
 ret.b03=false 
 ret.b04=false 
 ret.b05=false 
 ret.b06=false 
 ret.b07=false 
 ret.b08=false 
 ret.b09=false 
 ret.b10=false 
 ret.b11=false 
 ret.b12=false 
 ret.b13=false 
 ret.b14=false 
 ret.b15=false 
 ret.b16=false 
 ret.b17=false 
 ret.b18=false 
 ret.b19=false 
 ret.b20=false 
 ret.b21=false 
 ret.b22=false 
 ret.b23=false 
 ret.b24=false 
 ret.b25=false 
 ret.b26=false 
 ret.b27=false 
 ret.b28=false 
 ret.b29=false 
 ret.b30=false 
 ret.b31=false 
}
pred pred_java_primitive_integer_value_literal_3[ret: JavaPrimitiveIntegerValue] {
 ret.b00=true 
 ret.b01=true 
 ret.b02=false 
 ret.b03=false 
 ret.b04=false 
 ret.b05=false 
 ret.b06=false 
 ret.b07=false 
 ret.b08=false 
 ret.b09=false 
 ret.b10=false 
 ret.b11=false 
 ret.b12=false 
 ret.b13=false 
 ret.b14=false 
 ret.b15=false 
 ret.b16=false 
 ret.b17=false 
 ret.b18=false 
 ret.b19=false 
 ret.b20=false 
 ret.b21=false 
 ret.b22=false 
 ret.b23=false 
 ret.b24=false 
 ret.b25=false 
 ret.b26=false 
 ret.b27=false 
 ret.b28=false 
 ret.b29=false 
 ret.b30=false 
 ret.b31=false 
}
pred pred_java_primitive_integer_value_literal_4[ret: JavaPrimitiveIntegerValue] {
 ret.b00=false 
 ret.b01=false 
 ret.b02=true 
 ret.b03=false 
 ret.b04=false 
 ret.b05=false 
 ret.b06=false 
 ret.b07=false 
 ret.b08=false 
 ret.b09=false 
 ret.b10=false 
 ret.b11=false 
 ret.b12=false 
 ret.b13=false 
 ret.b14=false 
 ret.b15=false 
 ret.b16=false 
 ret.b17=false 
 ret.b18=false 
 ret.b19=false 
 ret.b20=false 
 ret.b21=false 
 ret.b22=false 
 ret.b23=false 
 ret.b24=false 
 ret.b25=false 
 ret.b26=false 
 ret.b27=false 
 ret.b28=false 
 ret.b29=false 
 ret.b30=false 
 ret.b31=false 
}
pred pred_java_primitive_integer_value_literal_5[ret: JavaPrimitiveIntegerValue] {
 ret.b00=true 
 ret.b01=false 
 ret.b02=true 
 ret.b03=false 
 ret.b04=false 
 ret.b05=false 
 ret.b06=false 
 ret.b07=false 
 ret.b08=false 
 ret.b09=false 
 ret.b10=false 
 ret.b11=false 
 ret.b12=false 
 ret.b13=false 
 ret.b14=false 
 ret.b15=false 
 ret.b16=false 
 ret.b17=false 
 ret.b18=false 
 ret.b19=false 
 ret.b20=false 
 ret.b21=false 
 ret.b22=false 
 ret.b23=false 
 ret.b24=false 
 ret.b25=false 
 ret.b26=false 
 ret.b27=false 
 ret.b28=false 
 ret.b29=false 
 ret.b30=false 
 ret.b31=false 
}
pred pred_java_primitive_integer_value_literal_6[ret: JavaPrimitiveIntegerValue] {
 ret.b00=false 
 ret.b01=true 
 ret.b02=true 
 ret.b03=false 
 ret.b04=false 
 ret.b05=false 
 ret.b06=false 
 ret.b07=false 
 ret.b08=false 
 ret.b09=false 
 ret.b10=false 
 ret.b11=false 
 ret.b12=false 
 ret.b13=false 
 ret.b14=false 
 ret.b15=false 
 ret.b16=false 
 ret.b17=false 
 ret.b18=false 
 ret.b19=false 
 ret.b20=false 
 ret.b21=false 
 ret.b22=false 
 ret.b23=false 
 ret.b24=false 
 ret.b25=false 
 ret.b26=false 
 ret.b27=false 
 ret.b28=false 
 ret.b29=false 
 ret.b30=false 
 ret.b31=false 
}
pred pred_java_primitive_integer_value_literal_7[ret: JavaPrimitiveIntegerValue] {
 ret.b00=true 
 ret.b01=true 
 ret.b02=true 
 ret.b03=false 
 ret.b04=false 
 ret.b05=false 
 ret.b06=false 
 ret.b07=false 
 ret.b08=false 
 ret.b09=false 
 ret.b10=false 
 ret.b11=false 
 ret.b12=false 
 ret.b13=false 
 ret.b14=false 
 ret.b15=false 
 ret.b16=false 
 ret.b17=false 
 ret.b18=false 
 ret.b19=false 
 ret.b20=false 
 ret.b21=false 
 ret.b22=false 
 ret.b23=false 
 ret.b24=false 
 ret.b25=false 
 ret.b26=false 
 ret.b27=false 
 ret.b28=false 
 ret.b29=false 
 ret.b30=false 
 ret.b31=false 
}
pred pred_java_primitive_integer_value_size_of[s: set univ, ret: JavaPrimitiveIntegerValue] {
  (#(s)=0) => pred_java_primitive_integer_value_literal_0[ret] 
  else (#(s)=1) => pred_java_primitive_integer_value_literal_1[ret] 
  else (#(s)=2) => pred_java_primitive_integer_value_literal_2[ret] 
  else (#(s)=3) => pred_java_primitive_integer_value_literal_3[ret] 
  else (#(s)=4) => pred_java_primitive_integer_value_literal_4[ret] 
  else (#(s)=5) => pred_java_primitive_integer_value_literal_5[ret] 
  else (#(s)=6) => pred_java_primitive_integer_value_literal_6[ret] 
  else (#(s)=7) => pred_java_primitive_integer_value_literal_7[ret] 
  else pred_java_primitive_integer_value_literal_minus_1[ret] 
}
fact {
  QF.BQ__0=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_0_2)=true
  QF.BQ__1=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_1_2)=true
  QF.BQ__2=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_2_2)=true
  QF.BQ__3=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_3_2)=true
  QF.BQ__4=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_4_2)=true
  QF.BQ__5=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_5_2)=true
  QF.BQ__6=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_6_2)=true
  QF.BQ__7=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_7_2)=true
  QF.BQ__8=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_8_2)=true
  QF.BQ__9=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_9_2)=true
  QF.BQ__10=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_10_2)=true
  QF.BQ__11=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_11_2)=true
  QF.BQ__12=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_12_2)=true
  QF.BQ__13=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_13_2)=true
  QF.BQ__14=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_14_2)=true
  QF.BQ__15=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_15_2)=true
  QF.BQ__17=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_17_2)=true
  QF.BQ__16=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_16_2)=true
  QF.BQ__19=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_19_2)=true
  QF.BQ__18=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_18_2)=true
  QF.BQ__21=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_21_2)=true
  QF.BQ__20=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_20_2)=true
  QF.BQ__23=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_23_2)=true
  QF.BQ__22=true iff ClassFields.(QF.roops_core_objectsInstrumented_BinTree_roops_goal_22_2)=true
}
