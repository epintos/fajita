/* 
 * DynAlloy translator options 
 * --------------------------- 
 * assertionId= check_roops_core_objectsInstrumented_SinglyLinkedList_containsTest_0
 * loopUnroll= 5
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




//-------------- roops_utilInstrumented_RoopsArray--------------//
sig roops_utilInstrumented_RoopsArray extends java_lang_Object {}
{}




//-------------- roops_core_objectsInstrumented_SinglyLinkedListNode--------------//
sig roops_core_objectsInstrumented_SinglyLinkedListNode extends java_lang_Object {}
{}




//-------------- java_lang_NullPointerException--------------//
abstract one sig java_lang_NullPointerException extends java_lang_RuntimeException {}
{}



one
sig java_lang_NullPointerExceptionLit extends java_lang_NullPointerException {}
{}

//-------------- roops_core_objectsInstrumented_SinglyLinkedList--------------//
sig roops_core_objectsInstrumented_SinglyLinkedList extends java_lang_Object {}
{}




pred roops_core_objectsInstrumented_SinglyLinkedListCondition24[
  t_266:univ
]{
   t_266=true

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition25[
  t_266:univ
]{
   not (
     t_266=true)

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition27[
  t_267:univ
]{
   not (
     t_267=true)

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition36[
  t_273:univ
]{
   t_273=true

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition37[
  t_273:univ
]{
   not (
     t_273=true)

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition26[
  t_267:univ
]{
   t_267=true

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition34[
  t_274:univ
]{
   t_274=true

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition35[
  t_274:univ
]{
   not (
     t_274=true)

}

pred roops_core_objectsInstrumented_SinglyLinkedList_ensures[
  throw':univ
]{
   liftExpression[false]
   and 
   equ[throw',
      null]

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition6[
  t_256:univ
]{
   t_256=true

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition9[
  t_255:univ
]{
   not (
     t_255=true)

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition7[
  t_256:univ
]{
   not (
     t_256=true)

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition8[
  t_255:univ
]{
   t_255=true

}

pred precondition_roops_core_objectsInstrumented_SinglyLinkedList_containsTest_0[
  roops_core_objectsInstrumented_SinglyLinkedListNode_next:univ->univ,
  roops_core_objectsInstrumented_SinglyLinkedList_header:univ->univ,
  throw:univ
]{
   equ[throw,
      null]
   and 
   (
     all objx:roops_core_objectsInstrumented_SinglyLinkedList | {
       roops_core_objectsInstrumented_SinglyLinkedList_object_invariant[roops_core_objectsInstrumented_SinglyLinkedListNode_next,
                                                                       roops_core_objectsInstrumented_SinglyLinkedList_header,
                                                                       objx]
     
     }
   )

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition38[
  exit_stmt_reached:univ,
  throw:univ,
  var_95_ws_22:univ
]{
   liftExpression[var_95_ws_22]
   and 
   (
     throw=null)
   and 
   (
     exit_stmt_reached=false)

}

pred postcondition_roops_core_objectsInstrumented_SinglyLinkedList_containsTest_0[
  throw':univ
]{
   roops_core_objectsInstrumented_SinglyLinkedList_ensures[throw']
   and 
   (
     not (
       throw'=AssertionFailureLit)
   )

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition11[
]{
   not (
     isEmptyOrNull[ClassFields]
     or 
     isEmptyOrNull[ClassFields]
   )

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition22[
  t_269:univ
]{
   t_269=true

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition21[
  t_270:univ
]{
   not (
     t_270=true)

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition20[
  t_270:univ
]{
   t_270=true

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition23[
  t_269:univ
]{
   not (
     t_269=true)

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition10[
]{
   isEmptyOrNull[ClassFields]
   or 
   isEmptyOrNull[ClassFields]

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition28[
  t_268:univ
]{
   t_268=true

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition13[
  t_254:univ
]{
   not (
     t_254=true)

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition1[
]{
   not (
     isEmptyOrNull[ClassFields])

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition12[
  t_254:univ
]{
   t_254=true

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition17[
  t_265:univ
]{
   not (
     t_265=true)

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition16[
  t_265:univ
]{
   t_265=true

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition19[
  t_264:univ
]{
   not (
     t_264=true)

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition18[
  t_264:univ
]{
   t_264=true

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition14[
  thiz:univ
]{
   isEmptyOrNull[thiz]

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition15[
  thiz:univ
]{
   not (
     isEmptyOrNull[thiz])

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition0[
]{
   isEmptyOrNull[ClassFields]

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition29[
  t_268:univ
]{
   not (
     t_268=true)

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition33[
  var_93_current:univ
]{
   not (
     isEmptyOrNull[var_93_current])

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition32[
  var_93_current:univ
]{
   isEmptyOrNull[var_93_current]

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition2[
  exit_stmt_reached:univ,
  throw:univ
]{
   (
     throw=null)
   and 
   (
     exit_stmt_reached=false)

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition3[
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

pred roops_core_objectsInstrumented_SinglyLinkedListCondition31[
  t_271:univ
]{
   not (
     t_271=true)

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition4[
  list:univ
]{
   isEmptyOrNull[list]

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition30[
  t_271:univ
]{
   t_271=true

}

pred roops_core_objectsInstrumented_SinglyLinkedListCondition5[
  list:univ
]{
   not (
     isEmptyOrNull[list])

}

pred roops_core_objectsInstrumented_SinglyLinkedList_object_invariant[
  roops_core_objectsInstrumented_SinglyLinkedListNode_next:univ->univ,
  roops_core_objectsInstrumented_SinglyLinkedList_header:univ->univ,
  thiz:univ
]{
   (
     not (
       thiz.roops_core_objectsInstrumented_SinglyLinkedList_header=null)
   )
   and 
   (
     all n:roops_core_objectsInstrumented_SinglyLinkedListNode | {
       isSubset[n,
               fun_set_difference[(thiz.roops_core_objectsInstrumented_SinglyLinkedList_header).(fun_reflexive_closure[roops_core_objectsInstrumented_SinglyLinkedListNode_next]),null]]
       implies 
               isNotSubset[n,
                          fun_set_difference[(n.roops_core_objectsInstrumented_SinglyLinkedListNode_next).(fun_reflexive_closure[roops_core_objectsInstrumented_SinglyLinkedListNode_next]),null]]
     
     }
   )

}
check check_roops_core_objectsInstrumented_SinglyLinkedList_containsTest_0  for 0 but  exactly 1 java_lang_Object, exactly 1 roops_utilInstrumented_RoopsArray, exactly 0 roops_core_objectsInstrumented_SinglyLinkedListNode, exactly 0 roops_core_objectsInstrumented_SinglyLinkedList,4 int



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


pred roops_core_objectsInstrumented_SinglyLinkedList_repOK_0[
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
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
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



pred roops_core_objectsInstrumented_SinglyLinkedList_fajita_roopsGoal_initialization_0[
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
  roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_0: ( ClassFields ) -> one ( null + roops_utilInstrumented_RoopsArray ),
  roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_1: ( ClassFields ) -> one ( null + roops_utilInstrumented_RoopsArray ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1: ( ClassFields ) -> one ( boolean ),
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
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_1]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_2=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_1)
      and 
      (
        throw_1=throw_2)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_2]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_3=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_2]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_1)
      and 
      (
        throw_2=throw_3)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_3]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_4=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_3]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1)
      and 
      (
        throw_3=throw_4)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_4]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_5=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_4]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1)
      and 
      (
        throw_4=throw_5)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_5]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_6=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_5]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1)
      and 
      (
        throw_5=throw_6)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_6]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_7=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_6]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1)
      and 
      (
        throw_6=throw_7)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_7]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_8=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_7]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1)
      and 
      (
        throw_7=throw_8)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_8]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_9=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_8]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1)
      and 
      (
        throw_8=throw_9)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_9]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_10=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_9]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1)
      and 
      (
        throw_9=throw_10)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_10]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_11=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_10]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1)
      and 
      (
        throw_10=throw_11)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_11]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_12=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_11]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1)
      and 
      (
        throw_11=throw_12)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_12]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_13=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_12]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1)
      and 
      (
        throw_12=throw_13)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_13]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_14=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_13]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1)
      and 
      (
        throw_13=throw_14)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_14]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_15=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_14]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1)
      and 
      (
        throw_14=throw_15)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_15]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_16=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_15]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1)
      and 
      (
        throw_15=throw_16)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_16]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_17=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_16]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1)
      and 
      (
        throw_16=throw_17)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_17]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_18=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_17]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_1)
      and 
      (
        throw_17=throw_18)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_18]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_19=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_18]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_1)
      and 
      (
        throw_18=throw_19)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_19]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_20=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_19]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_1)
      and 
      (
        throw_19=throw_20)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_20]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_21=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_20]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_1)
      and 
      (
        throw_20=throw_21)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_21]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_22=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_21]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)
      and 
      (
        throw_21=throw_22)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_22]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_23=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_22]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1)
      and 
      (
        throw_22=throw_23)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_23]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_24=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_23]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1)
      and 
      (
        throw_23=throw_24)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_24]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_25=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_24]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1)
      and 
      (
        throw_24=throw_25)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_25]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_26=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_25]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1)
      and 
      (
        throw_25=throw_26)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_26]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_27=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_0)++((ClassFields)->(false)))
          and 
          (
            throw_26=throw_27)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_26]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1)
      and 
      (
        throw_26=throw_27)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_27]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_28=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_27]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)
      and 
      (
        throw_27=throw_28)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_28]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_29=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_28]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)
      and 
      (
        throw_28=throw_29)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_29]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_30=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0)++((ClassFields)->(false)))
          and 
          (
            throw_29=throw_30)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_29]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)
      and 
      (
        throw_29=throw_30)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_30]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_31=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0)++((ClassFields)->(false)))
          and 
          (
            throw_30=throw_31)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_30]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1)
      and 
      (
        throw_30=throw_31)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_31]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_32=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0)++((ClassFields)->(false)))
          and 
          (
            throw_31=throw_32)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_31]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1)
      and 
      (
        throw_31=throw_32)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_32]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_33=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_0)++((ClassFields)->(false)))
          and 
          (
            throw_32=throw_33)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_32]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1)
      and 
      (
        throw_32=throw_33)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_33]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_34=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_0=roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_1=(roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_0)++((ClassFields)->(((null+roops_utilInstrumented_RoopsArray) & (null)))))
          and 
          (
            throw_33=throw_34)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_33]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_0=roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_1)
      and 
      (
        throw_33=throw_34)
    )
  )
  and 
  TruePred[]

}



pred roops_core_objectsInstrumented_SinglyLinkedList_containsTest_0[
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
  throw_48: java_lang_Throwable + null,
  throw_49: java_lang_Throwable + null,
  throw_50: java_lang_Throwable + null,
  throw_51: java_lang_Throwable + null,
  throw_52: java_lang_Throwable + null,
  throw_53: java_lang_Throwable + null,
  throw_54: java_lang_Throwable + null,
  throw_55: java_lang_Throwable + null,
  throw_56: java_lang_Throwable + null,
  throw_57: java_lang_Throwable + null,
  throw_58: java_lang_Throwable + null,
  throw_59: java_lang_Throwable + null,
  throw_60: java_lang_Throwable + null,
  throw_61: java_lang_Throwable + null,
  throw_62: java_lang_Throwable + null,
  throw_63: java_lang_Throwable + null,
  throw_64: java_lang_Throwable + null,
  throw_65: java_lang_Throwable + null,
  throw_66: java_lang_Throwable + null,
  throw_67: java_lang_Throwable + null,
  throw_68: java_lang_Throwable + null,
  throw_69: java_lang_Throwable + null,
  throw_70: java_lang_Throwable + null,
  throw_71: java_lang_Throwable + null,
  throw_72: java_lang_Throwable + null,
  throw_73: java_lang_Throwable + null,
  throw_74: java_lang_Throwable + null,
  throw_75: java_lang_Throwable + null,
  throw_76: java_lang_Throwable + null,
  throw_77: java_lang_Throwable + null,
  throw_78: java_lang_Throwable + null,
  throw_79: java_lang_Throwable + null,
  throw_80: java_lang_Throwable + null,
  throw_81: java_lang_Throwable + null,
  throw_82: java_lang_Throwable + null,
  throw_83: java_lang_Throwable + null,
  throw_84: java_lang_Throwable + null,
  throw_85: java_lang_Throwable + null,
  throw_86: java_lang_Throwable + null,
  throw_87: java_lang_Throwable + null,
  throw_88: java_lang_Throwable + null,
  throw_89: java_lang_Throwable + null,
  throw_90: java_lang_Throwable + null,
  throw_91: java_lang_Throwable + null,
  throw_92: java_lang_Throwable + null,
  throw_93: java_lang_Throwable + null,
  throw_94: java_lang_Throwable + null,
  throw_95: java_lang_Throwable + null,
  throw_96: java_lang_Throwable + null,
  throw_97: java_lang_Throwable + null,
  throw_98: java_lang_Throwable + null,
  throw_99: java_lang_Throwable + null,
  throw_100: java_lang_Throwable + null,
  throw_101: java_lang_Throwable + null,
  throw_102: java_lang_Throwable + null,
  throw_103: java_lang_Throwable + null,
  throw_104: java_lang_Throwable + null,
  throw_105: java_lang_Throwable + null,
  throw_106: java_lang_Throwable + null,
  throw_107: java_lang_Throwable + null,
  throw_108: java_lang_Throwable + null,
  throw_109: java_lang_Throwable + null,
  throw_110: java_lang_Throwable + null,
  throw_111: java_lang_Throwable + null,
  throw_112: java_lang_Throwable + null,
  throw_113: java_lang_Throwable + null,
  throw_114: java_lang_Throwable + null,
  throw_115: java_lang_Throwable + null,
  throw_116: java_lang_Throwable + null,
  throw_117: java_lang_Throwable + null,
  throw_118: java_lang_Throwable + null,
  throw_119: java_lang_Throwable + null,
  throw_120: java_lang_Throwable + null,
  throw_121: java_lang_Throwable + null,
  throw_122: java_lang_Throwable + null,
  throw_123: java_lang_Throwable + null,
  throw_124: java_lang_Throwable + null,
  throw_125: java_lang_Throwable + null,
  throw_126: java_lang_Throwable + null,
  throw_127: java_lang_Throwable + null,
  throw_128: java_lang_Throwable + null,
  throw_129: java_lang_Throwable + null,
  throw_130: java_lang_Throwable + null,
  throw_131: java_lang_Throwable + null,
  throw_132: java_lang_Throwable + null,
  throw_133: java_lang_Throwable + null,
  throw_134: java_lang_Throwable + null,
  throw_135: java_lang_Throwable + null,
  throw_136: java_lang_Throwable + null,
  throw_137: java_lang_Throwable + null,
  throw_138: java_lang_Throwable + null,
  throw_139: java_lang_Throwable + null,
  throw_140: java_lang_Throwable + null,
  throw_141: java_lang_Throwable + null,
  throw_142: java_lang_Throwable + null,
  throw_143: java_lang_Throwable + null,
  throw_144: java_lang_Throwable + null,
  throw_145: java_lang_Throwable + null,
  throw_146: java_lang_Throwable + null,
  throw_147: java_lang_Throwable + null,
  throw_148: java_lang_Throwable + null,
  throw_149: java_lang_Throwable + null,
  throw_150: java_lang_Throwable + null,
  throw_151: java_lang_Throwable + null,
  throw_152: java_lang_Throwable + null,
  throw_153: java_lang_Throwable + null,
  throw_154: java_lang_Throwable + null,
  list_0: null + roops_core_objectsInstrumented_SinglyLinkedList,
  value_param_0: java_lang_Object + null,
  roops_core_objectsInstrumented_SinglyLinkedList_header_0: ( roops_core_objectsInstrumented_SinglyLinkedList ) -> one ( null + roops_core_objectsInstrumented_SinglyLinkedListNode ),
  roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_0: ( ClassFields ) -> one ( null + roops_utilInstrumented_RoopsArray ),
  roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_1: ( ClassFields ) -> one ( null + roops_utilInstrumented_RoopsArray ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_11: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_7: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_7: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedListNode_next_0: ( roops_core_objectsInstrumented_SinglyLinkedListNode ) -> one ( null + roops_core_objectsInstrumented_SinglyLinkedListNode ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedListNode_value_0: ( roops_core_objectsInstrumented_SinglyLinkedListNode ) -> one ( java_lang_Object + null ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_6: ( ClassFields ) -> one ( boolean ),
  var_92_ret_val_0: boolean,
  var_92_ret_val_1: boolean,
  exit_stmt_reached_1: boolean,
  t_253_0: boolean,
  t_253_1: boolean,
  t_254_0: boolean,
  t_254_1: boolean,
  t_255_0: boolean,
  t_255_1: boolean,
  t_256_0: boolean,
  t_256_1: boolean,
  l0_exit_stmt_reached_1: boolean,
  l2_var_93_current_0: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l2_var_93_current_1: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l2_var_93_current_2: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l2_var_93_current_3: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l2_var_93_current_4: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l2_var_93_current_5: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l2_var_93_current_6: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l2_t_263_0: boolean,
  l2_t_263_1: boolean,
  l2_t_267_0: boolean,
  l2_t_267_1: boolean,
  l2_t_267_2: boolean,
  l2_t_267_3: boolean,
  l2_t_267_4: boolean,
  l2_t_267_5: boolean,
  l2_var_96_equalVal_0: boolean,
  l2_var_96_equalVal_1: boolean,
  l2_var_96_equalVal_2: boolean,
  l2_var_96_equalVal_3: boolean,
  l2_var_96_equalVal_4: boolean,
  l2_var_96_equalVal_5: boolean,
  l2_t_266_0: boolean,
  l2_t_266_1: boolean,
  l2_t_266_2: boolean,
  l2_t_266_3: boolean,
  l2_t_266_4: boolean,
  l2_t_266_5: boolean,
  l2_t_265_0: boolean,
  l2_t_265_1: boolean,
  l2_t_264_0: boolean,
  l2_t_264_1: boolean,
  l1_exit_stmt_reached_0: boolean,
  l1_exit_stmt_reached_1: boolean,
  l1_exit_stmt_reached_2: boolean,
  l2_exit_stmt_reached_0: boolean,
  l2_exit_stmt_reached_1: boolean,
  l2_exit_stmt_reached_2: boolean,
  l2_t_273_0: boolean,
  l2_t_273_1: boolean,
  l2_t_273_2: boolean,
  l2_t_273_3: boolean,
  l2_t_273_4: boolean,
  l2_t_273_5: boolean,
  l2_t_274_0: boolean,
  l2_t_274_1: boolean,
  l2_t_274_2: boolean,
  l2_t_274_3: boolean,
  l2_t_274_4: boolean,
  l2_t_274_5: boolean,
  l2_t_271_0: boolean,
  l2_t_271_1: boolean,
  l2_t_271_2: boolean,
  l2_t_271_3: boolean,
  l2_t_271_4: boolean,
  l2_t_271_5: boolean,
  l2_t_272_0: boolean,
  l2_t_272_1: boolean,
  l2_t_272_2: boolean,
  l2_t_272_3: boolean,
  l2_t_272_4: boolean,
  l2_t_272_5: boolean,
  l2_t_268_0: boolean,
  l2_t_268_1: boolean,
  l2_t_268_2: boolean,
  l2_t_268_3: boolean,
  l2_t_268_4: boolean,
  l2_t_268_5: boolean,
  l2_t_269_0: boolean,
  l2_t_269_1: boolean,
  l2_t_269_2: boolean,
  l2_t_269_3: boolean,
  l2_t_269_4: boolean,
  l2_t_269_5: boolean,
  l2_t_270_0: boolean,
  l2_t_270_1: boolean,
  l2_t_270_2: boolean,
  l2_t_270_3: boolean,
  l2_t_270_4: boolean,
  l2_t_270_5: boolean,
  l2_var_94_result_0: boolean,
  l2_var_94_result_1: boolean,
  l2_var_94_result_2: boolean,
  l2_var_94_result_3: boolean,
  l2_var_94_result_4: boolean,
  l2_var_94_result_5: boolean,
  l2_var_94_result_6: boolean,
  l2_var_95_ws_22_0: boolean,
  l2_var_95_ws_22_1: boolean,
  l2_var_95_ws_22_2: boolean,
  l2_var_95_ws_22_3: boolean,
  l2_var_95_ws_22_4: boolean,
  l2_var_95_ws_22_5: boolean,
  l2_var_95_ws_22_6: boolean
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
  roops_core_objectsInstrumented_SinglyLinkedList_fajita_roopsGoal_initialization_0[throw_2,
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
                                                                                   throw_28,
                                                                                   throw_29,
                                                                                   throw_30,
                                                                                   throw_31,
                                                                                   throw_32,
                                                                                   throw_33,
                                                                                   throw_34,
                                                                                   throw_35,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0,
                                                                                   roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1,
                                                                                   l0_exit_stmt_reached_1]
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_35]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_36=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_1)++((ClassFields)->(true)))
          and 
          (
            throw_35=throw_36)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_35]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_2)
      and 
      (
        throw_35=throw_36)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_36]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_37=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_1)++((ClassFields)->(true)))
          and 
          (
            throw_36=throw_37)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_36]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_2)
      and 
      (
        throw_36=throw_37)
    )
  )
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_37]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_38=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_1)++((ClassFields)->(true)))
          and 
          (
            throw_37=throw_38)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_37]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_2)
      and 
      (
        throw_37=throw_38)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_38]
      and 
      (
        t_255_1=(neq[list_0,
           null]=>(true)else(false))
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_38]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_255_0=t_255_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_38]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition4[list_0]
          and 
          (
            throw_39=java_lang_NullPointerExceptionLit)
          and 
          (
            t_256_0=t_256_1)
          and 
          (
            l1_exit_stmt_reached_0=l1_exit_stmt_reached_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition4[list_0])
          )
          and 
          roops_core_objectsInstrumented_SinglyLinkedList_repOK_0[throw_39,
                                                                 t_256_0,
                                                                 t_256_1,
                                                                 l1_exit_stmt_reached_1,
                                                                 l1_exit_stmt_reached_2]
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_38]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_256_0=t_256_1)
      and 
      (
        l1_exit_stmt_reached_0=l1_exit_stmt_reached_2)
      and 
      (
        throw_38=throw_39)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_39]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition8[t_255_1]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_39]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition6[t_256_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_39]
                      and 
                      (
                        t_254_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_39]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_254_0=t_254_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition6[t_256_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_39]
                      and 
                      (
                        t_254_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_39]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_254_0=t_254_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_39]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_254_0=t_254_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition8[t_255_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_39]
              and 
              (
                t_254_1=false)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_39]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_254_0=t_254_1)
            )
          )
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_39]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_254_0=t_254_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_39]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition12[t_254_1]
          and 
          TruePred[]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_39]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition4[list_0]
                  and 
                  (
                    throw_150=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    l2_var_93_current_0=l2_var_93_current_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_2)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_2)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_6)
                  and 
                  (
                    l2_t_263_0=l2_t_263_1)
                  and 
                  (
                    l2_t_267_0=l2_t_267_5)
                  and 
                  (
                    l2_var_96_equalVal_0=l2_var_96_equalVal_5)
                  and 
                  (
                    l2_t_266_0=l2_t_266_5)
                  and 
                  (
                    l2_t_265_0=l2_t_265_1)
                  and 
                  (
                    l2_t_264_0=l2_t_264_1)
                  and 
                  (
                    l2_exit_stmt_reached_0=l2_exit_stmt_reached_2)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_11)
                  and 
                  (
                    l2_t_273_0=l2_t_273_5)
                  and 
                  (
                    l2_t_274_0=l2_t_274_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_7)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_7)
                  and 
                  (
                    l2_t_271_0=l2_t_271_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_2)
                  and 
                  (
                    l2_t_272_0=l2_t_272_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_2)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_2)
                  and 
                  (
                    l2_t_268_0=l2_t_268_5)
                  and 
                  (
                    l2_t_269_0=l2_t_269_5)
                  and 
                  (
                    l2_t_270_0=l2_t_270_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_2)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_2)
                  and 
                  (
                    l2_var_94_result_0=l2_var_94_result_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_6)
                  and 
                  (
                    t_253_0=t_253_1)
                  and 
                  (
                    l2_var_95_ws_22_0=l2_var_95_ws_22_6)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition4[list_0])
                  )
                  and 
                  roops_core_objectsInstrumented_SinglyLinkedList_contains_0[list_0,
                                                                            throw_40,
                                                                            throw_41,
                                                                            throw_42,
                                                                            throw_43,
                                                                            throw_44,
                                                                            throw_45,
                                                                            throw_46,
                                                                            throw_47,
                                                                            throw_48,
                                                                            throw_49,
                                                                            throw_50,
                                                                            throw_51,
                                                                            throw_52,
                                                                            throw_53,
                                                                            throw_54,
                                                                            throw_55,
                                                                            throw_56,
                                                                            throw_57,
                                                                            throw_58,
                                                                            throw_59,
                                                                            throw_60,
                                                                            throw_61,
                                                                            throw_62,
                                                                            throw_63,
                                                                            throw_64,
                                                                            throw_65,
                                                                            throw_66,
                                                                            throw_67,
                                                                            throw_68,
                                                                            throw_69,
                                                                            throw_70,
                                                                            throw_71,
                                                                            throw_72,
                                                                            throw_73,
                                                                            throw_74,
                                                                            throw_75,
                                                                            throw_76,
                                                                            throw_77,
                                                                            throw_78,
                                                                            throw_79,
                                                                            throw_80,
                                                                            throw_81,
                                                                            throw_82,
                                                                            throw_83,
                                                                            throw_84,
                                                                            throw_85,
                                                                            throw_86,
                                                                            throw_87,
                                                                            throw_88,
                                                                            throw_89,
                                                                            throw_90,
                                                                            throw_91,
                                                                            throw_92,
                                                                            throw_93,
                                                                            throw_94,
                                                                            throw_95,
                                                                            throw_96,
                                                                            throw_97,
                                                                            throw_98,
                                                                            throw_99,
                                                                            throw_100,
                                                                            throw_101,
                                                                            throw_102,
                                                                            throw_103,
                                                                            throw_104,
                                                                            throw_105,
                                                                            throw_106,
                                                                            throw_107,
                                                                            throw_108,
                                                                            throw_109,
                                                                            throw_110,
                                                                            throw_111,
                                                                            throw_112,
                                                                            throw_113,
                                                                            throw_114,
                                                                            throw_115,
                                                                            throw_116,
                                                                            throw_117,
                                                                            throw_118,
                                                                            throw_119,
                                                                            throw_120,
                                                                            throw_121,
                                                                            throw_122,
                                                                            throw_123,
                                                                            throw_124,
                                                                            throw_125,
                                                                            throw_126,
                                                                            throw_127,
                                                                            throw_128,
                                                                            throw_129,
                                                                            throw_130,
                                                                            throw_131,
                                                                            throw_132,
                                                                            throw_133,
                                                                            throw_134,
                                                                            throw_135,
                                                                            throw_136,
                                                                            throw_137,
                                                                            throw_138,
                                                                            throw_139,
                                                                            throw_140,
                                                                            throw_141,
                                                                            throw_142,
                                                                            throw_143,
                                                                            throw_144,
                                                                            throw_145,
                                                                            throw_146,
                                                                            throw_147,
                                                                            throw_148,
                                                                            throw_149,
                                                                            throw_150,
                                                                            t_253_0,
                                                                            t_253_1,
                                                                            value_param_0,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_header_0,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_11,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_7,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_7,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedListNode_next_0,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedListNode_value_0,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_6,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5,
                                                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_6,
                                                                            l2_var_94_result_0,
                                                                            l2_var_94_result_1,
                                                                            l2_var_94_result_2,
                                                                            l2_var_94_result_3,
                                                                            l2_var_94_result_4,
                                                                            l2_var_94_result_5,
                                                                            l2_var_94_result_6,
                                                                            l2_t_268_0,
                                                                            l2_t_268_1,
                                                                            l2_t_268_2,
                                                                            l2_t_268_3,
                                                                            l2_t_268_4,
                                                                            l2_t_268_5,
                                                                            l2_t_269_0,
                                                                            l2_t_269_1,
                                                                            l2_t_269_2,
                                                                            l2_t_269_3,
                                                                            l2_t_269_4,
                                                                            l2_t_269_5,
                                                                            l2_t_263_0,
                                                                            l2_t_263_1,
                                                                            l2_t_266_0,
                                                                            l2_t_266_1,
                                                                            l2_t_266_2,
                                                                            l2_t_266_3,
                                                                            l2_t_266_4,
                                                                            l2_t_266_5,
                                                                            l2_t_271_0,
                                                                            l2_t_271_1,
                                                                            l2_t_271_2,
                                                                            l2_t_271_3,
                                                                            l2_t_271_4,
                                                                            l2_t_271_5,
                                                                            l2_t_267_0,
                                                                            l2_t_267_1,
                                                                            l2_t_267_2,
                                                                            l2_t_267_3,
                                                                            l2_t_267_4,
                                                                            l2_t_267_5,
                                                                            l2_t_272_0,
                                                                            l2_t_272_1,
                                                                            l2_t_272_2,
                                                                            l2_t_272_3,
                                                                            l2_t_272_4,
                                                                            l2_t_272_5,
                                                                            l2_t_273_0,
                                                                            l2_t_273_1,
                                                                            l2_t_273_2,
                                                                            l2_t_273_3,
                                                                            l2_t_273_4,
                                                                            l2_t_273_5,
                                                                            l2_t_264_0,
                                                                            l2_t_264_1,
                                                                            l2_t_274_0,
                                                                            l2_t_274_1,
                                                                            l2_t_274_2,
                                                                            l2_t_274_3,
                                                                            l2_t_274_4,
                                                                            l2_t_274_5,
                                                                            l2_t_265_0,
                                                                            l2_t_265_1,
                                                                            l2_var_96_equalVal_0,
                                                                            l2_var_96_equalVal_1,
                                                                            l2_var_96_equalVal_2,
                                                                            l2_var_96_equalVal_3,
                                                                            l2_var_96_equalVal_4,
                                                                            l2_var_96_equalVal_5,
                                                                            l2_exit_stmt_reached_1,
                                                                            l2_exit_stmt_reached_2,
                                                                            l2_var_95_ws_22_0,
                                                                            l2_var_95_ws_22_1,
                                                                            l2_var_95_ws_22_2,
                                                                            l2_var_95_ws_22_3,
                                                                            l2_var_95_ws_22_4,
                                                                            l2_var_95_ws_22_5,
                                                                            l2_var_95_ws_22_6,
                                                                            l2_t_270_0,
                                                                            l2_t_270_1,
                                                                            l2_t_270_2,
                                                                            l2_t_270_3,
                                                                            l2_t_270_4,
                                                                            l2_t_270_5,
                                                                            l2_var_93_current_0,
                                                                            l2_var_93_current_1,
                                                                            l2_var_93_current_2,
                                                                            l2_var_93_current_3,
                                                                            l2_var_93_current_4,
                                                                            l2_var_93_current_5,
                                                                            l2_var_93_current_6]
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_39]
                )
              )
              and 
              TruePred[]
              and 
              (
                l2_var_93_current_0=l2_var_93_current_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_2)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_2)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_6)
              and 
              (
                l2_t_263_0=l2_t_263_1)
              and 
              (
                l2_var_96_equalVal_0=l2_var_96_equalVal_5)
              and 
              (
                l2_t_267_0=l2_t_267_5)
              and 
              (
                l2_t_266_0=l2_t_266_5)
              and 
              (
                l2_t_265_0=l2_t_265_1)
              and 
              (
                l2_t_264_0=l2_t_264_1)
              and 
              (
                l2_exit_stmt_reached_0=l2_exit_stmt_reached_2)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_11)
              and 
              (
                l2_t_273_0=l2_t_273_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_7)
              and 
              (
                l2_t_274_0=l2_t_274_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_7)
              and 
              (
                l2_t_271_0=l2_t_271_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_2)
              and 
              (
                l2_t_272_0=l2_t_272_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_2)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_2)
              and 
              (
                l2_t_268_0=l2_t_268_5)
              and 
              (
                l2_t_269_0=l2_t_269_5)
              and 
              (
                l2_t_270_0=l2_t_270_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_2)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_2)
              and 
              (
                l2_var_94_result_0=l2_var_94_result_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_6)
              and 
              (
                t_253_0=t_253_1)
              and 
              (
                l2_var_95_ws_22_0=l2_var_95_ws_22_6)
              and 
              (
                throw_39=throw_150)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_150]
              and 
              (
                var_92_ret_val_1=t_253_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_150]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_92_ret_val_0=var_92_ret_val_1)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_150]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                  and 
                  (
                    throw_151=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_2=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_1)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_2)))
                  and 
                  (
                    throw_150=throw_151)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_150]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_2)
              and 
              (
                throw_150=throw_151)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_151]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                  and 
                  (
                    throw_152=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_2=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_1)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_2)))
                  and 
                  (
                    throw_151=throw_152)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_151]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_2)
              and 
              (
                throw_151=throw_152)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_152]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                  and 
                  (
                    throw_153=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_1)++((ClassFields)->(true)))
                  and 
                  (
                    throw_152=throw_153)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_152]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_2)
              and 
              (
                throw_152=throw_153)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_153]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                  and 
                  (
                    throw_154=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_3)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_2)++((ClassFields)->(false)))
                  and 
                  (
                    throw_153=throw_154)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_153]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_3)
              and 
              (
                throw_153=throw_154)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition12[t_254_1])
          )
          and 
          TruePred[]
          and 
          (
            var_92_ret_val_0=var_92_ret_val_1)
          and 
          (
            l2_var_93_current_0=l2_var_93_current_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_2)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_2)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_6)
          and 
          (
            l2_t_263_0=l2_t_263_1)
          and 
          (
            l2_t_267_0=l2_t_267_5)
          and 
          (
            l2_var_96_equalVal_0=l2_var_96_equalVal_5)
          and 
          (
            l2_t_266_0=l2_t_266_5)
          and 
          (
            l2_t_265_0=l2_t_265_1)
          and 
          (
            l2_t_264_0=l2_t_264_1)
          and 
          (
            l2_exit_stmt_reached_0=l2_exit_stmt_reached_2)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_11)
          and 
          (
            l2_t_273_0=l2_t_273_5)
          and 
          (
            throw_39=throw_154)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_7)
          and 
          (
            l2_t_274_0=l2_t_274_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_7)
          and 
          (
            l2_t_271_0=l2_t_271_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_2)
          and 
          (
            l2_t_272_0=l2_t_272_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_2)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_2)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_2)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_3)
          and 
          (
            l2_t_268_0=l2_t_268_5)
          and 
          (
            l2_t_269_0=l2_t_269_5)
          and 
          (
            l2_t_270_0=l2_t_270_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_2)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_2)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_2)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_2)
          and 
          (
            l2_var_94_result_0=l2_var_94_result_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_6)
          and 
          (
            t_253_0=t_253_1)
          and 
          (
            l2_var_95_ws_22_0=l2_var_95_ws_22_6)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_39]
        )
      )
      and 
      TruePred[]
      and 
      (
        var_92_ret_val_0=var_92_ret_val_1)
      and 
      (
        l2_var_93_current_0=l2_var_93_current_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_2)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_2)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_6)
      and 
      (
        l2_t_263_0=l2_t_263_1)
      and 
      (
        l2_t_267_0=l2_t_267_5)
      and 
      (
        l2_var_96_equalVal_0=l2_var_96_equalVal_5)
      and 
      (
        l2_t_266_0=l2_t_266_5)
      and 
      (
        l2_t_265_0=l2_t_265_1)
      and 
      (
        l2_t_264_0=l2_t_264_1)
      and 
      (
        l2_exit_stmt_reached_0=l2_exit_stmt_reached_2)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_11)
      and 
      (
        l2_t_273_0=l2_t_273_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_7)
      and 
      (
        l2_t_274_0=l2_t_274_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_7)
      and 
      (
        l2_t_271_0=l2_t_271_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_2)
      and 
      (
        l2_t_272_0=l2_t_272_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_2)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_2)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_2)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_3)
      and 
      (
        l2_t_268_0=l2_t_268_5)
      and 
      (
        l2_t_269_0=l2_t_269_5)
      and 
      (
        l2_t_270_0=l2_t_270_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_2)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_2)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_2)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_2)
      and 
      (
        l2_var_94_result_0=l2_var_94_result_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_6)
      and 
      (
        t_253_0=t_253_1)
      and 
      (
        l2_var_95_ws_22_0=l2_var_95_ws_22_6)
      and 
      (
        throw_39=throw_154)
    )
  )
  and 
  TruePred[]

}



pred roops_core_objectsInstrumented_SinglyLinkedList_contains_0[
  thiz_0: roops_core_objectsInstrumented_SinglyLinkedList,
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
  throw_48: java_lang_Throwable + null,
  throw_49: java_lang_Throwable + null,
  throw_50: java_lang_Throwable + null,
  throw_51: java_lang_Throwable + null,
  throw_52: java_lang_Throwable + null,
  throw_53: java_lang_Throwable + null,
  throw_54: java_lang_Throwable + null,
  throw_55: java_lang_Throwable + null,
  throw_56: java_lang_Throwable + null,
  throw_57: java_lang_Throwable + null,
  throw_58: java_lang_Throwable + null,
  throw_59: java_lang_Throwable + null,
  throw_60: java_lang_Throwable + null,
  throw_61: java_lang_Throwable + null,
  throw_62: java_lang_Throwable + null,
  throw_63: java_lang_Throwable + null,
  throw_64: java_lang_Throwable + null,
  throw_65: java_lang_Throwable + null,
  throw_66: java_lang_Throwable + null,
  throw_67: java_lang_Throwable + null,
  throw_68: java_lang_Throwable + null,
  throw_69: java_lang_Throwable + null,
  throw_70: java_lang_Throwable + null,
  throw_71: java_lang_Throwable + null,
  throw_72: java_lang_Throwable + null,
  throw_73: java_lang_Throwable + null,
  throw_74: java_lang_Throwable + null,
  throw_75: java_lang_Throwable + null,
  throw_76: java_lang_Throwable + null,
  throw_77: java_lang_Throwable + null,
  throw_78: java_lang_Throwable + null,
  throw_79: java_lang_Throwable + null,
  throw_80: java_lang_Throwable + null,
  throw_81: java_lang_Throwable + null,
  throw_82: java_lang_Throwable + null,
  throw_83: java_lang_Throwable + null,
  throw_84: java_lang_Throwable + null,
  throw_85: java_lang_Throwable + null,
  throw_86: java_lang_Throwable + null,
  throw_87: java_lang_Throwable + null,
  throw_88: java_lang_Throwable + null,
  throw_89: java_lang_Throwable + null,
  throw_90: java_lang_Throwable + null,
  throw_91: java_lang_Throwable + null,
  throw_92: java_lang_Throwable + null,
  throw_93: java_lang_Throwable + null,
  throw_94: java_lang_Throwable + null,
  throw_95: java_lang_Throwable + null,
  throw_96: java_lang_Throwable + null,
  throw_97: java_lang_Throwable + null,
  throw_98: java_lang_Throwable + null,
  throw_99: java_lang_Throwable + null,
  throw_100: java_lang_Throwable + null,
  throw_101: java_lang_Throwable + null,
  throw_102: java_lang_Throwable + null,
  throw_103: java_lang_Throwable + null,
  throw_104: java_lang_Throwable + null,
  throw_105: java_lang_Throwable + null,
  throw_106: java_lang_Throwable + null,
  throw_107: java_lang_Throwable + null,
  throw_108: java_lang_Throwable + null,
  throw_109: java_lang_Throwable + null,
  throw_110: java_lang_Throwable + null,
  throw_111: java_lang_Throwable + null,
  return_0: boolean,
  return_1: boolean,
  value_param_0: java_lang_Object + null,
  roops_core_objectsInstrumented_SinglyLinkedList_header_0: ( roops_core_objectsInstrumented_SinglyLinkedList ) -> one ( null + roops_core_objectsInstrumented_SinglyLinkedListNode ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedListNode_next_0: ( roops_core_objectsInstrumented_SinglyLinkedListNode ) -> one ( null + roops_core_objectsInstrumented_SinglyLinkedListNode ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedListNode_value_0: ( roops_core_objectsInstrumented_SinglyLinkedListNode ) -> one ( java_lang_Object + null ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5: ( ClassFields ) -> one ( boolean ),
  var_94_result_0: boolean,
  var_94_result_1: boolean,
  var_94_result_2: boolean,
  var_94_result_3: boolean,
  var_94_result_4: boolean,
  var_94_result_5: boolean,
  var_94_result_6: boolean,
  t_268_0: boolean,
  t_268_1: boolean,
  t_268_2: boolean,
  t_268_3: boolean,
  t_268_4: boolean,
  t_268_5: boolean,
  t_269_0: boolean,
  t_269_1: boolean,
  t_269_2: boolean,
  t_269_3: boolean,
  t_269_4: boolean,
  t_269_5: boolean,
  t_263_0: boolean,
  t_263_1: boolean,
  t_266_0: boolean,
  t_266_1: boolean,
  t_266_2: boolean,
  t_266_3: boolean,
  t_266_4: boolean,
  t_266_5: boolean,
  t_271_0: boolean,
  t_271_1: boolean,
  t_271_2: boolean,
  t_271_3: boolean,
  t_271_4: boolean,
  t_271_5: boolean,
  t_267_0: boolean,
  t_267_1: boolean,
  t_267_2: boolean,
  t_267_3: boolean,
  t_267_4: boolean,
  t_267_5: boolean,
  t_272_0: boolean,
  t_272_1: boolean,
  t_272_2: boolean,
  t_272_3: boolean,
  t_272_4: boolean,
  t_272_5: boolean,
  t_273_0: boolean,
  t_273_1: boolean,
  t_273_2: boolean,
  t_273_3: boolean,
  t_273_4: boolean,
  t_273_5: boolean,
  t_264_0: boolean,
  t_264_1: boolean,
  t_274_0: boolean,
  t_274_1: boolean,
  t_274_2: boolean,
  t_274_3: boolean,
  t_274_4: boolean,
  t_274_5: boolean,
  t_265_0: boolean,
  t_265_1: boolean,
  var_96_equalVal_0: boolean,
  var_96_equalVal_1: boolean,
  var_96_equalVal_2: boolean,
  var_96_equalVal_3: boolean,
  var_96_equalVal_4: boolean,
  var_96_equalVal_5: boolean,
  exit_stmt_reached_1: boolean,
  exit_stmt_reached_2: boolean,
  var_95_ws_22_0: boolean,
  var_95_ws_22_1: boolean,
  var_95_ws_22_2: boolean,
  var_95_ws_22_3: boolean,
  var_95_ws_22_4: boolean,
  var_95_ws_22_5: boolean,
  var_95_ws_22_6: boolean,
  t_270_0: boolean,
  t_270_1: boolean,
  t_270_2: boolean,
  t_270_3: boolean,
  t_270_4: boolean,
  t_270_5: boolean,
  var_93_current_0: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  var_93_current_1: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  var_93_current_2: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  var_93_current_3: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  var_93_current_4: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  var_93_current_5: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  var_93_current_6: null + roops_core_objectsInstrumented_SinglyLinkedListNode
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
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_1]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_2=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_0)++((ClassFields)->(true)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)
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
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_2]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_3=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_0)++((ClassFields)->(true)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_2]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1)
      and 
      (
        throw_2=throw_3)
    )
  )
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_3]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_4=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_0)++((ClassFields)->(true)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_3]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1)
      and 
      (
        throw_3=throw_4)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_4]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition14[thiz_0]
          and 
          (
            throw_5=java_lang_NullPointerExceptionLit)
          and 
          (
            var_93_current_0=var_93_current_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition14[thiz_0])
          )
          and 
          (
            var_93_current_1=thiz_0.roops_core_objectsInstrumented_SinglyLinkedList_header_0)
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_4]
        )
      )
      and 
      TruePred[]
      and 
      (
        var_93_current_0=var_93_current_1)
      and 
      (
        throw_4=throw_5)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_5]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_6=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_0)++((ClassFields)->(true)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_5]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1)
      and 
      (
        throw_5=throw_6)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_6]
      and 
      (
        var_94_result_1=false)
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_6]
        )
      )
      and 
      TruePred[]
      and 
      (
        var_94_result_0=var_94_result_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_6]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
          and 
          (
            throw_7=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_0)++((ClassFields)->(true)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_6]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1)
      and 
      (
        throw_6=throw_7)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_7]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
          and 
          (
            throw_8=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_7]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1)
      and 
      (
        throw_7=throw_8)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_8]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
          and 
          (
            throw_9=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1)))
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_8]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1)
      and 
      (
        throw_8=throw_9)
    )
  )
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_9]
      and 
      (
        t_264_1=(equ[var_94_result_1,
           false]=>(true)else(false))
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_9]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_264_0=t_264_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_9]
      and 
      (
        t_265_1=(neq[var_93_current_1,
           null]=>(true)else(false))
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_9]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_265_0=t_265_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_9]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition18[t_264_1]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_9]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition16[t_265_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_9]
                      and 
                      (
                        t_263_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_9]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_263_0=t_263_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition16[t_265_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_9]
                      and 
                      (
                        t_263_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_9]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_263_0=t_263_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_9]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_263_0=t_263_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition18[t_264_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_9]
              and 
              (
                t_263_1=false)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_9]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_263_0=t_263_1)
            )
          )
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_9]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_263_0=t_263_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_9]
      and 
      (
        var_95_ws_22_1=t_263_1)
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_9]
        )
      )
      and 
      TruePred[]
      and 
      (
        var_95_ws_22_0=var_95_ws_22_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition38[exit_stmt_reached_1,
                                                                throw_9,
                                                                var_95_ws_22_1]
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
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_9]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
              and 
              (
                throw_10=java_lang_NullPointerExceptionLit)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
              )
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_0)++((ClassFields)->(true)))
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
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_9]
            )
          )
          and 
          TruePred[]
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1)
          and 
          (
            throw_9=throw_10)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_10]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
              and 
              (
                throw_11=java_lang_NullPointerExceptionLit)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
              )
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)))
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
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_10]
            )
          )
          and 
          TruePred[]
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1)
          and 
          (
            throw_10=throw_11)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_11]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
              and 
              (
                throw_12=java_lang_NullPointerExceptionLit)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
              )
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1)))
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
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_11]
            )
          )
          and 
          TruePred[]
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1)
          and 
          (
            throw_11=throw_12)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_12]
          and 
          (
            t_269_1=(equ[value_param_0,
               null]=>(true)else(false))
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_12]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_269_0=t_269_1)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_12]
          and 
          (
            t_270_1=(equ[var_93_current_1.roops_core_objectsInstrumented_SinglyLinkedListNode_value_0,
               null]=>(true)else(false))
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_12]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_270_0=t_270_1)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_12]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition22[t_269_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_12]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition20[t_270_1]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_12]
                          and 
                          (
                            t_268_1=true)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_12]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_268_0=t_268_1)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition20[t_270_1])
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_12]
                          and 
                          (
                            t_268_1=false)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_12]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_268_0=t_268_1)
                        )
                      )
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_12]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_268_0=t_268_1)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition22[t_269_1])
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_12]
                  and 
                  (
                    t_268_1=false)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_12]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_268_0=t_268_1)
                )
              )
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_12]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_268_0=t_268_1)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_12]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition28[t_268_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_12]
                  and 
                  (
                    var_96_equalVal_1=true)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_12]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    var_96_equalVal_0=var_96_equalVal_1)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_12]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                      and 
                      (
                        throw_13=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0)++((ClassFields)->(true)))
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
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_12]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)
                  and 
                  (
                    throw_12=throw_13)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_13]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                      and 
                      (
                        throw_18=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1)++((ClassFields)->(false)))
                      and 
                      (
                        throw_13=throw_18)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_13]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2)
                  and 
                  (
                    throw_13=throw_18)
                )
              )
              and 
              (
                t_267_0=t_267_1)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1)
              and 
              (
                t_266_0=t_266_1)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition28[t_268_1])
              )
              and 
              TruePred[]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_12]
                  and 
                  (
                    t_267_1=(neq[value_param_0,
                       null]=>(true)else(false))
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_12]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_267_0=t_267_1)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_12]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition26[t_267_1]
                      and 
                      TruePred[]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_12]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                              and 
                              (
                                throw_13=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)))
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
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_12]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1)
                          and 
                          (
                            throw_12=throw_13)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_13]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                              and 
                              (
                                throw_14=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1)))
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
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_13]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1)
                          and 
                          (
                            throw_13=throw_14)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_14]
                          and 
                          (
                            t_266_1=(equ[value_param_0,
                               var_93_current_1.roops_core_objectsInstrumented_SinglyLinkedListNode_value_0]=>(true)else(false))
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_14]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_266_0=t_266_1)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_14]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition24[t_266_1]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_14]
                                  and 
                                  (
                                    var_96_equalVal_1=true)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_14]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    var_96_equalVal_0=var_96_equalVal_1)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_14]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_15=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0)++((ClassFields)->(true)))
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
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_14]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)
                                  and 
                                  (
                                    throw_14=throw_15)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_15]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_16=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1)++((ClassFields)->(false)))
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
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_15]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2)
                                  and 
                                  (
                                    throw_15=throw_16)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_16]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_18=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0)++((ClassFields)->(false)))
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
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_16]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)
                                  and 
                                  (
                                    throw_16=throw_18)
                                )
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition24[t_266_1])
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_14]
                                  and 
                                  (
                                    var_96_equalVal_1=false)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_14]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    var_96_equalVal_0=var_96_equalVal_1)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_14]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_15=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0)++((ClassFields)->(true)))
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
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_14]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)
                                  and 
                                  (
                                    throw_14=throw_15)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_15]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_16=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1)++((ClassFields)->(false)))
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
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_15]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2)
                                  and 
                                  (
                                    throw_15=throw_16)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_16]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_17=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0)++((ClassFields)->(false)))
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
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_16]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)
                                  and 
                                  (
                                    throw_16=throw_17)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_17]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_18=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0)++((ClassFields)->(false)))
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
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_17]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)
                                  and 
                                  (
                                    throw_17=throw_18)
                                )
                              )
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_14]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2)
                          and 
                          (
                            var_96_equalVal_0=var_96_equalVal_1)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)
                          and 
                          (
                            throw_14=throw_18)
                        )
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition26[t_267_1])
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_12]
                          and 
                          (
                            var_96_equalVal_1=false)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_12]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            var_96_equalVal_0=var_96_equalVal_1)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_12]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                              and 
                              (
                                throw_13=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0)++((ClassFields)->(true)))
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
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_12]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1)
                          and 
                          (
                            throw_12=throw_13)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_13]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                              and 
                              (
                                throw_14=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1)++((ClassFields)->(false)))
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
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_13]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2)
                          and 
                          (
                            throw_13=throw_14)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_14]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                              and 
                              (
                                throw_15=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0)++((ClassFields)->(false)))
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
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_14]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)
                          and 
                          (
                            throw_14=throw_15)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_15]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                              and 
                              (
                                throw_16=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0)++((ClassFields)->(false)))
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
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_15]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)
                          and 
                          (
                            throw_15=throw_16)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_16]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                              and 
                              (
                                throw_18=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0)++((ClassFields)->(false)))
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
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_16]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)
                          and 
                          (
                            throw_16=throw_18)
                        )
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1)
                      and 
                      (
                        t_266_0=t_266_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_12]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1)
                  and 
                  (
                    t_266_0=t_266_1)
                  and 
                  (
                    var_96_equalVal_0=var_96_equalVal_1)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)
                  and 
                  (
                    throw_12=throw_18)
                )
              )
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_12]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_267_0=t_267_1)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1)
          and 
          (
            t_266_0=t_266_1)
          and 
          (
            var_96_equalVal_0=var_96_equalVal_1)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)
          and 
          (
            throw_12=throw_18)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_18]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
              and 
              (
                throw_19=java_lang_NullPointerExceptionLit)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
              )
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2)))
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
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_18]
            )
          )
          and 
          TruePred[]
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1)
          and 
          (
            throw_18=throw_19)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_19]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
              and 
              (
                throw_20=java_lang_NullPointerExceptionLit)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
              )
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)))
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
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_19]
            )
          )
          and 
          TruePred[]
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1)
          and 
          (
            throw_19=throw_20)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_20]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
              and 
              (
                throw_21=java_lang_NullPointerExceptionLit)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
              )
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)))
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
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_20]
            )
          )
          and 
          TruePred[]
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1)
          and 
          (
            throw_20=throw_21)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_21]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
              and 
              (
                throw_22=java_lang_NullPointerExceptionLit)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
              )
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)))
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
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_21]
            )
          )
          and 
          TruePred[]
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1)
          and 
          (
            throw_21=throw_22)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_22]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
              and 
              (
                throw_23=java_lang_NullPointerExceptionLit)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
              )
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1)))
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
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_22]
            )
          )
          and 
          TruePred[]
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1)
          and 
          (
            throw_22=throw_23)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_23]
          and 
          (
            t_271_1=(equ[var_96_equalVal_1,
               true]=>(true)else(false))
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_23]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_271_0=t_271_1)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_23]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition30[t_271_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_23]
                  and 
                  (
                    var_94_result_2=true)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_23]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    var_94_result_1=var_94_result_2)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_23]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                      and 
                      (
                        throw_24=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0)++((ClassFields)->(true)))
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
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_23]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1)
                  and 
                  (
                    throw_23=throw_24)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_24]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                      and 
                      (
                        throw_25=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1)++((ClassFields)->(false)))
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
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_24]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2)
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
                  roops_core_objectsInstrumented_SinglyLinkedListCondition30[t_271_1])
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2)
              and 
              (
                throw_23=throw_25)
              and 
              (
                var_94_result_1=var_94_result_2)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_23]
            )
          )
          and 
          TruePred[]
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2)
          and 
          (
            var_94_result_1=var_94_result_2)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1)
          and 
          (
            throw_23=throw_25)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_25]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition32[var_93_current_1]
              and 
              (
                throw_26=java_lang_NullPointerExceptionLit)
              and 
              (
                var_93_current_1=var_93_current_2)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition32[var_93_current_1])
              )
              and 
              (
                var_93_current_2=var_93_current_1.roops_core_objectsInstrumented_SinglyLinkedListNode_next_0)
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
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_25]
            )
          )
          and 
          TruePred[]
          and 
          (
            var_93_current_1=var_93_current_2)
          and 
          (
            throw_25=throw_26)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_26]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
              and 
              (
                throw_27=java_lang_NullPointerExceptionLit)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
              )
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1)))
              and 
              (
                throw_26=throw_27)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_26]
            )
          )
          and 
          TruePred[]
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1)
          and 
          (
            throw_26=throw_27)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_27]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
              and 
              (
                throw_28=java_lang_NullPointerExceptionLit)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
              )
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_0)++((ClassFields)->(true)))
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
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_27]
            )
          )
          and 
          TruePred[]
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1)
          and 
          (
            throw_27=throw_28)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_28]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
              and 
              (
                throw_29=java_lang_NullPointerExceptionLit)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
              )
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1)++((ClassFields)->(false)))
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
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_28]
            )
          )
          and 
          TruePred[]
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2)
          and 
          (
            throw_28=throw_29)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_29]
          and 
          (
            t_273_1=(equ[var_94_result_2,
               false]=>(true)else(false))
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_29]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_273_0=t_273_1)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_29]
          and 
          (
            t_274_1=(neq[var_93_current_2,
               null]=>(true)else(false))
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_29]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_274_0=t_274_1)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_29]
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition36[t_273_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_29]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition34[t_274_1]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_29]
                          and 
                          (
                            t_272_1=true)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_29]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_272_0=t_272_1)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition34[t_274_1])
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_29]
                          and 
                          (
                            t_272_1=false)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_29]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_272_0=t_272_1)
                        )
                      )
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_29]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_272_0=t_272_1)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition36[t_273_1])
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_29]
                  and 
                  (
                    t_272_1=false)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_29]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_272_0=t_272_1)
                )
              )
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_29]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_272_0=t_272_1)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_29]
          and 
          (
            var_95_ws_22_2=t_272_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_29]
            )
          )
          and 
          TruePred[]
          and 
          (
            var_95_ws_22_1=var_95_ws_22_2)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition38[exit_stmt_reached_1,
                                                                    throw_29,
                                                                    var_95_ws_22_2]
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
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_29]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                  and 
                  (
                    throw_30=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2)++((ClassFields)->(true)))
                  and 
                  (
                    throw_29=throw_30)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_29]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3)
              and 
              (
                throw_29=throw_30)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_30]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                  and 
                  (
                    throw_31=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_2=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)))
                  and 
                  (
                    throw_30=throw_31)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_30]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_2)
              and 
              (
                throw_30=throw_31)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_31]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                  and 
                  (
                    throw_32=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_2=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2)))
                  and 
                  (
                    throw_31=throw_32)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_31]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_2)
              and 
              (
                throw_31=throw_32)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_32]
              and 
              (
                t_269_2=(equ[value_param_0,
                   null]=>(true)else(false))
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_32]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_269_1=t_269_2)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_32]
              and 
              (
                t_270_2=(equ[var_93_current_2.roops_core_objectsInstrumented_SinglyLinkedListNode_value_0,
                   null]=>(true)else(false))
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_32]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_270_1=t_270_2)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_32]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition22[t_269_2]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_32]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition20[t_270_2]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_32]
                              and 
                              (
                                t_268_2=true)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_32]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_268_1=t_268_2)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition20[t_270_2])
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_32]
                              and 
                              (
                                t_268_2=false)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_32]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_268_1=t_268_2)
                            )
                          )
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_32]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_268_1=t_268_2)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition22[t_269_2])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_32]
                      and 
                      (
                        t_268_2=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_32]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_268_1=t_268_2)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_32]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_268_1=t_268_2)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_32]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition28[t_268_2]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_32]
                      and 
                      (
                        var_96_equalVal_2=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_32]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        var_96_equalVal_1=var_96_equalVal_2)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_32]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                          and 
                          (
                            throw_33=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)++((ClassFields)->(true)))
                          and 
                          (
                            throw_32=throw_33)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_32]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)
                      and 
                      (
                        throw_32=throw_33)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_33]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                          and 
                          (
                            throw_38=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3)++((ClassFields)->(false)))
                          and 
                          (
                            throw_33=throw_38)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_33]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4)
                      and 
                      (
                        throw_33=throw_38)
                    )
                  )
                  and 
                  (
                    t_267_1=t_267_2)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2)
                  and 
                  (
                    t_266_1=t_266_2)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition28[t_268_2])
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_32]
                      and 
                      (
                        t_267_2=(neq[value_param_0,
                           null]=>(true)else(false))
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_32]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_267_1=t_267_2)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_32]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition26[t_267_2]
                          and 
                          TruePred[]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_32]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                                  and 
                                  (
                                    throw_33=java_lang_NullPointerExceptionLit)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)))
                                  and 
                                  (
                                    throw_32=throw_33)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_32]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2)
                              and 
                              (
                                throw_32=throw_33)
                            )
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_33]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                                  and 
                                  (
                                    throw_34=java_lang_NullPointerExceptionLit)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2)))
                                  and 
                                  (
                                    throw_33=throw_34)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_33]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2)
                              and 
                              (
                                throw_33=throw_34)
                            )
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_34]
                              and 
                              (
                                t_266_2=(equ[value_param_0,
                                   var_93_current_2.roops_core_objectsInstrumented_SinglyLinkedListNode_value_0]=>(true)else(false))
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_34]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_266_1=t_266_2)
                            )
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_34]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition24[t_266_2]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_34]
                                      and 
                                      (
                                        var_96_equalVal_2=true)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_34]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        var_96_equalVal_1=var_96_equalVal_2)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_34]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                          and 
                                          (
                                            throw_35=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)++((ClassFields)->(true)))
                                          and 
                                          (
                                            throw_34=throw_35)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_34]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)
                                      and 
                                      (
                                        throw_34=throw_35)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_35]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                          and 
                                          (
                                            throw_36=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3)++((ClassFields)->(false)))
                                          and 
                                          (
                                            throw_35=throw_36)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_35]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4)
                                      and 
                                      (
                                        throw_35=throw_36)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_36]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                          and 
                                          (
                                            throw_38=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)++((ClassFields)->(false)))
                                          and 
                                          (
                                            throw_36=throw_38)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_36]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)
                                      and 
                                      (
                                        throw_36=throw_38)
                                    )
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition24[t_266_2])
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_34]
                                      and 
                                      (
                                        var_96_equalVal_2=false)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_34]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        var_96_equalVal_1=var_96_equalVal_2)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_34]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                          and 
                                          (
                                            throw_35=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)++((ClassFields)->(true)))
                                          and 
                                          (
                                            throw_34=throw_35)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_34]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2)
                                      and 
                                      (
                                        throw_34=throw_35)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_35]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                          and 
                                          (
                                            throw_36=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3)++((ClassFields)->(false)))
                                          and 
                                          (
                                            throw_35=throw_36)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_35]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4)
                                      and 
                                      (
                                        throw_35=throw_36)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_36]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                          and 
                                          (
                                            throw_37=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)++((ClassFields)->(false)))
                                          and 
                                          (
                                            throw_36=throw_37)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_36]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)
                                      and 
                                      (
                                        throw_36=throw_37)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_37]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                          and 
                                          (
                                            throw_38=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)++((ClassFields)->(false)))
                                          and 
                                          (
                                            throw_37=throw_38)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_37]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)
                                      and 
                                      (
                                        throw_37=throw_38)
                                    )
                                  )
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_34]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4)
                              and 
                              (
                                var_96_equalVal_1=var_96_equalVal_2)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2)
                              and 
                              (
                                throw_34=throw_38)
                            )
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition26[t_267_2])
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_32]
                              and 
                              (
                                var_96_equalVal_2=false)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_32]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                var_96_equalVal_1=var_96_equalVal_2)
                            )
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_32]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                  and 
                                  (
                                    throw_33=java_lang_NullPointerExceptionLit)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1)++((ClassFields)->(true)))
                                  and 
                                  (
                                    throw_32=throw_33)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_32]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2)
                              and 
                              (
                                throw_32=throw_33)
                            )
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_33]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                  and 
                                  (
                                    throw_34=java_lang_NullPointerExceptionLit)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3)++((ClassFields)->(false)))
                                  and 
                                  (
                                    throw_33=throw_34)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_33]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4)
                              and 
                              (
                                throw_33=throw_34)
                            )
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_34]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                  and 
                                  (
                                    throw_35=java_lang_NullPointerExceptionLit)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1)++((ClassFields)->(false)))
                                  and 
                                  (
                                    throw_34=throw_35)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_34]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)
                              and 
                              (
                                throw_34=throw_35)
                            )
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_35]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                  and 
                                  (
                                    throw_36=java_lang_NullPointerExceptionLit)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1)++((ClassFields)->(false)))
                                  and 
                                  (
                                    throw_35=throw_36)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_35]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)
                              and 
                              (
                                throw_35=throw_36)
                            )
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_36]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                  and 
                                  (
                                    throw_38=java_lang_NullPointerExceptionLit)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1)++((ClassFields)->(false)))
                                  and 
                                  (
                                    throw_36=throw_38)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_36]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2)
                              and 
                              (
                                throw_36=throw_38)
                            )
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2)
                          and 
                          (
                            t_266_1=t_266_2)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_32]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2)
                      and 
                      (
                        t_266_1=t_266_2)
                      and 
                      (
                        var_96_equalVal_1=var_96_equalVal_2)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2)
                      and 
                      (
                        throw_32=throw_38)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_32]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_267_1=t_267_2)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2)
              and 
              (
                t_266_1=t_266_2)
              and 
              (
                var_96_equalVal_1=var_96_equalVal_2)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2)
              and 
              (
                throw_32=throw_38)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_38]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                  and 
                  (
                    throw_39=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_2=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4)))
                  and 
                  (
                    throw_38=throw_39)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_38]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_2)
              and 
              (
                throw_38=throw_39)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_39]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                  and 
                  (
                    throw_40=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_2=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)))
                  and 
                  (
                    throw_39=throw_40)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_39]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_2)
              and 
              (
                throw_39=throw_40)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_40]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                  and 
                  (
                    throw_41=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_2=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)))
                  and 
                  (
                    throw_40=throw_41)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_40]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_2)
              and 
              (
                throw_40=throw_41)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_41]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                  and 
                  (
                    throw_42=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_2=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2)))
                  and 
                  (
                    throw_41=throw_42)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_41]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_2)
              and 
              (
                throw_41=throw_42)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_42]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                  and 
                  (
                    throw_43=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_2=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2)))
                  and 
                  (
                    throw_42=throw_43)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_42]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_2)
              and 
              (
                throw_42=throw_43)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_43]
              and 
              (
                t_271_2=(equ[var_96_equalVal_2,
                   true]=>(true)else(false))
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_43]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_271_1=t_271_2)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_43]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition30[t_271_2]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_43]
                      and 
                      (
                        var_94_result_3=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_43]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        var_94_result_2=var_94_result_3)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_43]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                          and 
                          (
                            throw_44=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1)++((ClassFields)->(true)))
                          and 
                          (
                            throw_43=throw_44)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_43]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2)
                      and 
                      (
                        throw_43=throw_44)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_44]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                          and 
                          (
                            throw_45=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2)++((ClassFields)->(false)))
                          and 
                          (
                            throw_44=throw_45)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_44]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3)
                      and 
                      (
                        throw_44=throw_45)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition30[t_271_2])
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3)
                  and 
                  (
                    throw_43=throw_45)
                  and 
                  (
                    var_94_result_2=var_94_result_3)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_43]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3)
              and 
              (
                var_94_result_2=var_94_result_3)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2)
              and 
              (
                throw_43=throw_45)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_45]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition32[var_93_current_2]
                  and 
                  (
                    throw_46=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    var_93_current_2=var_93_current_3)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition32[var_93_current_2])
                  )
                  and 
                  (
                    var_93_current_3=var_93_current_2.roops_core_objectsInstrumented_SinglyLinkedListNode_next_0)
                  and 
                  (
                    throw_45=throw_46)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_45]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_93_current_2=var_93_current_3)
              and 
              (
                throw_45=throw_46)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_46]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                  and 
                  (
                    throw_47=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_2=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2)))
                  and 
                  (
                    throw_46=throw_47)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_46]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_2)
              and 
              (
                throw_46=throw_47)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_47]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                  and 
                  (
                    throw_48=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_2)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_2=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1)++((ClassFields)->(true)))
                  and 
                  (
                    throw_47=throw_48)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_47]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_2)
              and 
              (
                throw_47=throw_48)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_48]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                  and 
                  (
                    throw_49=java_lang_NullPointerExceptionLit)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                  )
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2)++((ClassFields)->(false)))
                  and 
                  (
                    throw_48=throw_49)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_48]
                )
              )
              and 
              TruePred[]
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3)
              and 
              (
                throw_48=throw_49)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_49]
              and 
              (
                t_273_2=(equ[var_94_result_3,
                   false]=>(true)else(false))
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_49]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_273_1=t_273_2)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_49]
              and 
              (
                t_274_2=(neq[var_93_current_3,
                   null]=>(true)else(false))
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_49]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_274_1=t_274_2)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_49]
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition36[t_273_2]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_49]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition34[t_274_2]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_49]
                              and 
                              (
                                t_272_2=true)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_49]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_272_1=t_272_2)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition34[t_274_2])
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_49]
                              and 
                              (
                                t_272_2=false)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_49]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_272_1=t_272_2)
                            )
                          )
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_49]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_272_1=t_272_2)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition36[t_273_2])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_49]
                      and 
                      (
                        t_272_2=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_49]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_272_1=t_272_2)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_49]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_272_1=t_272_2)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                       throw_49]
              and 
              (
                var_95_ws_22_3=t_272_2)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_49]
                )
              )
              and 
              TruePred[]
              and 
              (
                var_95_ws_22_2=var_95_ws_22_3)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_SinglyLinkedListCondition38[exit_stmt_reached_1,
                                                                        throw_49,
                                                                        var_95_ws_22_3]
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
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_49]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                      and 
                      (
                        throw_50=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4)++((ClassFields)->(true)))
                      and 
                      (
                        throw_49=throw_50)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_49]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5)
                  and 
                  (
                    throw_49=throw_50)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_50]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                      and 
                      (
                        throw_51=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_3)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_3=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_2)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)))
                      and 
                      (
                        throw_50=throw_51)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_50]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_3)
                  and 
                  (
                    throw_50=throw_51)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_51]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                      and 
                      (
                        throw_52=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_3)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_3=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_2)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3)))
                      and 
                      (
                        throw_51=throw_52)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_51]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_3)
                  and 
                  (
                    throw_51=throw_52)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_52]
                  and 
                  (
                    t_269_3=(equ[value_param_0,
                       null]=>(true)else(false))
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_52]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_269_2=t_269_3)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_52]
                  and 
                  (
                    t_270_3=(equ[var_93_current_3.roops_core_objectsInstrumented_SinglyLinkedListNode_value_0,
                       null]=>(true)else(false))
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_52]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_270_2=t_270_3)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_52]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition22[t_269_3]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_52]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition20[t_270_3]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_52]
                                  and 
                                  (
                                    t_268_3=true)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_52]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    t_268_2=t_268_3)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition20[t_270_3])
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_52]
                                  and 
                                  (
                                    t_268_3=false)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_52]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    t_268_2=t_268_3)
                                )
                              )
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_52]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_268_2=t_268_3)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition22[t_269_3])
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_52]
                          and 
                          (
                            t_268_3=false)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_52]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_268_2=t_268_3)
                        )
                      )
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_52]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_268_2=t_268_3)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_52]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition28[t_268_3]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_52]
                          and 
                          (
                            var_96_equalVal_3=true)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_52]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            var_96_equalVal_2=var_96_equalVal_3)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_52]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                              and 
                              (
                                throw_53=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)++((ClassFields)->(true)))
                              and 
                              (
                                throw_52=throw_53)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_52]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)
                          and 
                          (
                            throw_52=throw_53)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_53]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                              and 
                              (
                                throw_58=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5)++((ClassFields)->(false)))
                              and 
                              (
                                throw_53=throw_58)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_53]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6)
                          and 
                          (
                            throw_53=throw_58)
                        )
                      )
                      and 
                      (
                        t_267_2=t_267_3)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3)
                      and 
                      (
                        t_266_2=t_266_3)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition28[t_268_3])
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_52]
                          and 
                          (
                            t_267_3=(neq[value_param_0,
                               null]=>(true)else(false))
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_52]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_267_2=t_267_3)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_52]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition26[t_267_3]
                              and 
                              TruePred[]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_52]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                                      and 
                                      (
                                        throw_53=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)))
                                      and 
                                      (
                                        throw_52=throw_53)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_52]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3)
                                  and 
                                  (
                                    throw_52=throw_53)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_53]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                                      and 
                                      (
                                        throw_54=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3)))
                                      and 
                                      (
                                        throw_53=throw_54)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_53]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3)
                                  and 
                                  (
                                    throw_53=throw_54)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_54]
                                  and 
                                  (
                                    t_266_3=(equ[value_param_0,
                                       var_93_current_3.roops_core_objectsInstrumented_SinglyLinkedListNode_value_0]=>(true)else(false))
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_54]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    t_266_2=t_266_3)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_54]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition24[t_266_3]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_54]
                                          and 
                                          (
                                            var_96_equalVal_3=true)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_54]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            var_96_equalVal_2=var_96_equalVal_3)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_54]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                              and 
                                              (
                                                throw_55=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)++((ClassFields)->(true)))
                                              and 
                                              (
                                                throw_54=throw_55)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_54]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)
                                          and 
                                          (
                                            throw_54=throw_55)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_55]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                              and 
                                              (
                                                throw_56=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5)++((ClassFields)->(false)))
                                              and 
                                              (
                                                throw_55=throw_56)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_55]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6)
                                          and 
                                          (
                                            throw_55=throw_56)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_56]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                              and 
                                              (
                                                throw_58=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)++((ClassFields)->(false)))
                                              and 
                                              (
                                                throw_56=throw_58)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_56]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)
                                          and 
                                          (
                                            throw_56=throw_58)
                                        )
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition24[t_266_3])
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_54]
                                          and 
                                          (
                                            var_96_equalVal_3=false)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_54]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            var_96_equalVal_2=var_96_equalVal_3)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_54]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                              and 
                                              (
                                                throw_55=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2)++((ClassFields)->(true)))
                                              and 
                                              (
                                                throw_54=throw_55)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_54]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3)
                                          and 
                                          (
                                            throw_54=throw_55)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_55]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                              and 
                                              (
                                                throw_56=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5)++((ClassFields)->(false)))
                                              and 
                                              (
                                                throw_55=throw_56)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_55]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6)
                                          and 
                                          (
                                            throw_55=throw_56)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_56]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                              and 
                                              (
                                                throw_57=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)++((ClassFields)->(false)))
                                              and 
                                              (
                                                throw_56=throw_57)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_56]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)
                                          and 
                                          (
                                            throw_56=throw_57)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_57]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                              and 
                                              (
                                                throw_58=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)++((ClassFields)->(false)))
                                              and 
                                              (
                                                throw_57=throw_58)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_57]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)
                                          and 
                                          (
                                            throw_57=throw_58)
                                        )
                                      )
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_54]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6)
                                  and 
                                  (
                                    var_96_equalVal_2=var_96_equalVal_3)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3)
                                  and 
                                  (
                                    throw_54=throw_58)
                                )
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition26[t_267_3])
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_52]
                                  and 
                                  (
                                    var_96_equalVal_3=false)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_52]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    var_96_equalVal_2=var_96_equalVal_3)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_52]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_53=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2)++((ClassFields)->(true)))
                                      and 
                                      (
                                        throw_52=throw_53)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_52]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3)
                                  and 
                                  (
                                    throw_52=throw_53)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_53]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_54=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5)++((ClassFields)->(false)))
                                      and 
                                      (
                                        throw_53=throw_54)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_53]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6)
                                  and 
                                  (
                                    throw_53=throw_54)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_54]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_55=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2)++((ClassFields)->(false)))
                                      and 
                                      (
                                        throw_54=throw_55)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_54]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)
                                  and 
                                  (
                                    throw_54=throw_55)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_55]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_56=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2)++((ClassFields)->(false)))
                                      and 
                                      (
                                        throw_55=throw_56)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_55]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)
                                  and 
                                  (
                                    throw_55=throw_56)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_56]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_58=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2)++((ClassFields)->(false)))
                                      and 
                                      (
                                        throw_56=throw_58)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_56]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3)
                                  and 
                                  (
                                    throw_56=throw_58)
                                )
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3)
                              and 
                              (
                                t_266_2=t_266_3)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_52]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3)
                          and 
                          (
                            t_266_2=t_266_3)
                          and 
                          (
                            var_96_equalVal_2=var_96_equalVal_3)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3)
                          and 
                          (
                            throw_52=throw_58)
                        )
                      )
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_52]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_267_2=t_267_3)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3)
                  and 
                  (
                    t_266_2=t_266_3)
                  and 
                  (
                    var_96_equalVal_2=var_96_equalVal_3)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3)
                  and 
                  (
                    throw_52=throw_58)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_58]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                      and 
                      (
                        throw_59=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_3)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_3=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_2)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6)))
                      and 
                      (
                        throw_58=throw_59)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_58]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_3)
                  and 
                  (
                    throw_58=throw_59)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_59]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                      and 
                      (
                        throw_60=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_3)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_3=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_2)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)))
                      and 
                      (
                        throw_59=throw_60)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_59]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_3)
                  and 
                  (
                    throw_59=throw_60)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_60]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                      and 
                      (
                        throw_61=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_3)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_3=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_2)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)))
                      and 
                      (
                        throw_60=throw_61)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_60]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_3)
                  and 
                  (
                    throw_60=throw_61)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_61]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                      and 
                      (
                        throw_62=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_3)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_3=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_2)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3)))
                      and 
                      (
                        throw_61=throw_62)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_61]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_3)
                  and 
                  (
                    throw_61=throw_62)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_62]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                      and 
                      (
                        throw_63=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_3)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_3=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_2)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3)))
                      and 
                      (
                        throw_62=throw_63)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_62]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_3)
                  and 
                  (
                    throw_62=throw_63)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_63]
                  and 
                  (
                    t_271_3=(equ[var_96_equalVal_3,
                       true]=>(true)else(false))
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_63]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_271_2=t_271_3)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_63]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition30[t_271_3]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_63]
                          and 
                          (
                            var_94_result_4=true)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_63]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            var_94_result_3=var_94_result_4)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_63]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                              and 
                              (
                                throw_64=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2)++((ClassFields)->(true)))
                              and 
                              (
                                throw_63=throw_64)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_63]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3)
                          and 
                          (
                            throw_63=throw_64)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_64]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                              and 
                              (
                                throw_65=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3)++((ClassFields)->(false)))
                              and 
                              (
                                throw_64=throw_65)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_64]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4)
                          and 
                          (
                            throw_64=throw_65)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition30[t_271_3])
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4)
                      and 
                      (
                        throw_63=throw_65)
                      and 
                      (
                        var_94_result_3=var_94_result_4)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_63]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4)
                  and 
                  (
                    var_94_result_3=var_94_result_4)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3)
                  and 
                  (
                    throw_63=throw_65)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_65]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition32[var_93_current_3]
                      and 
                      (
                        throw_66=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        var_93_current_3=var_93_current_4)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition32[var_93_current_3])
                      )
                      and 
                      (
                        var_93_current_4=var_93_current_3.roops_core_objectsInstrumented_SinglyLinkedListNode_next_0)
                      and 
                      (
                        throw_65=throw_66)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_65]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    var_93_current_3=var_93_current_4)
                  and 
                  (
                    throw_65=throw_66)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_66]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                      and 
                      (
                        throw_67=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_3)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_3=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_2)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3)))
                      and 
                      (
                        throw_66=throw_67)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_66]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_3)
                  and 
                  (
                    throw_66=throw_67)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_67]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                      and 
                      (
                        throw_68=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_3)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_3=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_2)++((ClassFields)->(true)))
                      and 
                      (
                        throw_67=throw_68)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_67]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_3)
                  and 
                  (
                    throw_67=throw_68)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_68]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                      and 
                      (
                        throw_69=java_lang_NullPointerExceptionLit)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                      )
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3)++((ClassFields)->(false)))
                      and 
                      (
                        throw_68=throw_69)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_68]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4)
                  and 
                  (
                    throw_68=throw_69)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_69]
                  and 
                  (
                    t_273_3=(equ[var_94_result_4,
                       false]=>(true)else(false))
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_69]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_273_2=t_273_3)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_69]
                  and 
                  (
                    t_274_3=(neq[var_93_current_4,
                       null]=>(true)else(false))
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_69]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_274_2=t_274_3)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_69]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition36[t_273_3]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_69]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition34[t_274_3]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_69]
                                  and 
                                  (
                                    t_272_3=true)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_69]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    t_272_2=t_272_3)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition34[t_274_3])
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_69]
                                  and 
                                  (
                                    t_272_3=false)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_69]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    t_272_2=t_272_3)
                                )
                              )
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_69]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_272_2=t_272_3)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition36[t_273_3])
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_69]
                          and 
                          (
                            t_272_3=false)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_69]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_272_2=t_272_3)
                        )
                      )
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_69]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_272_2=t_272_3)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                           throw_69]
                  and 
                  (
                    var_95_ws_22_4=t_272_3)
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_69]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    var_95_ws_22_3=var_95_ws_22_4)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition38[exit_stmt_reached_1,
                                                                            throw_69,
                                                                            var_95_ws_22_4]
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
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_69]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                          and 
                          (
                            throw_70=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6)++((ClassFields)->(true)))
                          and 
                          (
                            throw_69=throw_70)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_69]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7)
                      and 
                      (
                        throw_69=throw_70)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_70]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                          and 
                          (
                            throw_71=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_4)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_4=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_3)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)))
                          and 
                          (
                            throw_70=throw_71)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_70]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_4)
                      and 
                      (
                        throw_70=throw_71)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_71]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                          and 
                          (
                            throw_72=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_4)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_4=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_3)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4)))
                          and 
                          (
                            throw_71=throw_72)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_71]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_4)
                      and 
                      (
                        throw_71=throw_72)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_72]
                      and 
                      (
                        t_269_4=(equ[value_param_0,
                           null]=>(true)else(false))
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_72]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_269_3=t_269_4)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_72]
                      and 
                      (
                        t_270_4=(equ[var_93_current_4.roops_core_objectsInstrumented_SinglyLinkedListNode_value_0,
                           null]=>(true)else(false))
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_72]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_270_3=t_270_4)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_72]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition22[t_269_4]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_72]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition20[t_270_4]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_72]
                                      and 
                                      (
                                        t_268_4=true)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_72]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        t_268_3=t_268_4)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition20[t_270_4])
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_72]
                                      and 
                                      (
                                        t_268_4=false)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_72]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        t_268_3=t_268_4)
                                    )
                                  )
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_72]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_268_3=t_268_4)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition22[t_269_4])
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_72]
                              and 
                              (
                                t_268_4=false)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_72]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_268_3=t_268_4)
                            )
                          )
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_72]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_268_3=t_268_4)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_72]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition28[t_268_4]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_72]
                              and 
                              (
                                var_96_equalVal_4=true)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_72]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                var_96_equalVal_3=var_96_equalVal_4)
                            )
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_72]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                  and 
                                  (
                                    throw_73=java_lang_NullPointerExceptionLit)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)++((ClassFields)->(true)))
                                  and 
                                  (
                                    throw_72=throw_73)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_72]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)
                              and 
                              (
                                throw_72=throw_73)
                            )
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_73]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                  and 
                                  (
                                    throw_78=java_lang_NullPointerExceptionLit)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7)++((ClassFields)->(false)))
                                  and 
                                  (
                                    throw_73=throw_78)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_73]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8)
                              and 
                              (
                                throw_73=throw_78)
                            )
                          )
                          and 
                          (
                            t_267_3=t_267_4)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4)
                          and 
                          (
                            t_266_3=t_266_4)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition28[t_268_4])
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_72]
                              and 
                              (
                                t_267_4=(neq[value_param_0,
                                   null]=>(true)else(false))
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_72]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_267_3=t_267_4)
                            )
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_72]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition26[t_267_4]
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_72]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                                          and 
                                          (
                                            throw_73=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)))
                                          and 
                                          (
                                            throw_72=throw_73)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_72]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4)
                                      and 
                                      (
                                        throw_72=throw_73)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_73]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                                          and 
                                          (
                                            throw_74=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4)))
                                          and 
                                          (
                                            throw_73=throw_74)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_73]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4)
                                      and 
                                      (
                                        throw_73=throw_74)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_74]
                                      and 
                                      (
                                        t_266_4=(equ[value_param_0,
                                           var_93_current_4.roops_core_objectsInstrumented_SinglyLinkedListNode_value_0]=>(true)else(false))
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_74]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        t_266_3=t_266_4)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_74]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition24[t_266_4]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_74]
                                              and 
                                              (
                                                var_96_equalVal_4=true)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_74]
                                                )
                                              )
                                              and 
                                              TruePred[]
                                              and 
                                              (
                                                var_96_equalVal_3=var_96_equalVal_4)
                                            )
                                          )
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_74]
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                  and 
                                                  (
                                                    throw_75=java_lang_NullPointerExceptionLit)
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                  )
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)++((ClassFields)->(true)))
                                                  and 
                                                  (
                                                    throw_74=throw_75)
                                                )
                                              )
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_74]
                                                )
                                              )
                                              and 
                                              TruePred[]
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)
                                              and 
                                              (
                                                throw_74=throw_75)
                                            )
                                          )
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_75]
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                  and 
                                                  (
                                                    throw_76=java_lang_NullPointerExceptionLit)
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8)
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                  )
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7)++((ClassFields)->(false)))
                                                  and 
                                                  (
                                                    throw_75=throw_76)
                                                )
                                              )
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_75]
                                                )
                                              )
                                              and 
                                              TruePred[]
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8)
                                              and 
                                              (
                                                throw_75=throw_76)
                                            )
                                          )
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_76]
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                  and 
                                                  (
                                                    throw_78=java_lang_NullPointerExceptionLit)
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                  )
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)++((ClassFields)->(false)))
                                                  and 
                                                  (
                                                    throw_76=throw_78)
                                                )
                                              )
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_76]
                                                )
                                              )
                                              and 
                                              TruePred[]
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)
                                              and 
                                              (
                                                throw_76=throw_78)
                                            )
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition24[t_266_4])
                                          )
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_74]
                                              and 
                                              (
                                                var_96_equalVal_4=false)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_74]
                                                )
                                              )
                                              and 
                                              TruePred[]
                                              and 
                                              (
                                                var_96_equalVal_3=var_96_equalVal_4)
                                            )
                                          )
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_74]
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                  and 
                                                  (
                                                    throw_75=java_lang_NullPointerExceptionLit)
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4)
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                  )
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3)++((ClassFields)->(true)))
                                                  and 
                                                  (
                                                    throw_74=throw_75)
                                                )
                                              )
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_74]
                                                )
                                              )
                                              and 
                                              TruePred[]
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4)
                                              and 
                                              (
                                                throw_74=throw_75)
                                            )
                                          )
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_75]
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                  and 
                                                  (
                                                    throw_76=java_lang_NullPointerExceptionLit)
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8)
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                  )
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7)++((ClassFields)->(false)))
                                                  and 
                                                  (
                                                    throw_75=throw_76)
                                                )
                                              )
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_75]
                                                )
                                              )
                                              and 
                                              TruePred[]
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8)
                                              and 
                                              (
                                                throw_75=throw_76)
                                            )
                                          )
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_76]
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                  and 
                                                  (
                                                    throw_77=java_lang_NullPointerExceptionLit)
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                  )
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)++((ClassFields)->(false)))
                                                  and 
                                                  (
                                                    throw_76=throw_77)
                                                )
                                              )
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_76]
                                                )
                                              )
                                              and 
                                              TruePred[]
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)
                                              and 
                                              (
                                                throw_76=throw_77)
                                            )
                                          )
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_77]
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                  and 
                                                  (
                                                    throw_78=java_lang_NullPointerExceptionLit)
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                  )
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)++((ClassFields)->(false)))
                                                  and 
                                                  (
                                                    throw_77=throw_78)
                                                )
                                              )
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_77]
                                                )
                                              )
                                              and 
                                              TruePred[]
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)
                                              and 
                                              (
                                                throw_77=throw_78)
                                            )
                                          )
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_74]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8)
                                      and 
                                      (
                                        var_96_equalVal_3=var_96_equalVal_4)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4)
                                      and 
                                      (
                                        throw_74=throw_78)
                                    )
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition26[t_267_4])
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_72]
                                      and 
                                      (
                                        var_96_equalVal_4=false)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_72]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        var_96_equalVal_3=var_96_equalVal_4)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_72]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                          and 
                                          (
                                            throw_73=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3)++((ClassFields)->(true)))
                                          and 
                                          (
                                            throw_72=throw_73)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_72]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4)
                                      and 
                                      (
                                        throw_72=throw_73)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_73]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                          and 
                                          (
                                            throw_74=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7)++((ClassFields)->(false)))
                                          and 
                                          (
                                            throw_73=throw_74)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_73]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8)
                                      and 
                                      (
                                        throw_73=throw_74)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_74]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                          and 
                                          (
                                            throw_75=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3)++((ClassFields)->(false)))
                                          and 
                                          (
                                            throw_74=throw_75)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_74]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)
                                      and 
                                      (
                                        throw_74=throw_75)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_75]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                          and 
                                          (
                                            throw_76=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3)++((ClassFields)->(false)))
                                          and 
                                          (
                                            throw_75=throw_76)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_75]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)
                                      and 
                                      (
                                        throw_75=throw_76)
                                    )
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_76]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                          and 
                                          (
                                            throw_78=java_lang_NullPointerExceptionLit)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                          )
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3)++((ClassFields)->(false)))
                                          and 
                                          (
                                            throw_76=throw_78)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_76]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4)
                                      and 
                                      (
                                        throw_76=throw_78)
                                    )
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4)
                                  and 
                                  (
                                    t_266_3=t_266_4)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_72]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4)
                              and 
                              (
                                t_266_3=t_266_4)
                              and 
                              (
                                var_96_equalVal_3=var_96_equalVal_4)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4)
                              and 
                              (
                                throw_72=throw_78)
                            )
                          )
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_72]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_267_3=t_267_4)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4)
                      and 
                      (
                        t_266_3=t_266_4)
                      and 
                      (
                        var_96_equalVal_3=var_96_equalVal_4)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4)
                      and 
                      (
                        throw_72=throw_78)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_78]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                          and 
                          (
                            throw_79=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_4)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_4=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_3)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8)))
                          and 
                          (
                            throw_78=throw_79)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_78]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_4)
                      and 
                      (
                        throw_78=throw_79)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_79]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                          and 
                          (
                            throw_80=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_4)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_4=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_3)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)))
                          and 
                          (
                            throw_79=throw_80)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_79]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_4)
                      and 
                      (
                        throw_79=throw_80)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_80]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                          and 
                          (
                            throw_81=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_4)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_4=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_3)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)))
                          and 
                          (
                            throw_80=throw_81)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_80]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_4)
                      and 
                      (
                        throw_80=throw_81)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_81]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                          and 
                          (
                            throw_82=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_4)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_4=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_3)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4)))
                          and 
                          (
                            throw_81=throw_82)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_81]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_4)
                      and 
                      (
                        throw_81=throw_82)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_82]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                          and 
                          (
                            throw_83=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_4)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_4=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_3)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4)))
                          and 
                          (
                            throw_82=throw_83)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_82]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_4)
                      and 
                      (
                        throw_82=throw_83)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_83]
                      and 
                      (
                        t_271_4=(equ[var_96_equalVal_4,
                           true]=>(true)else(false))
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_83]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_271_3=t_271_4)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_83]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition30[t_271_4]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_83]
                              and 
                              (
                                var_94_result_5=true)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_83]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                var_94_result_4=var_94_result_5)
                            )
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_83]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                  and 
                                  (
                                    throw_84=java_lang_NullPointerExceptionLit)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3)++((ClassFields)->(true)))
                                  and 
                                  (
                                    throw_83=throw_84)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_83]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4)
                              and 
                              (
                                throw_83=throw_84)
                            )
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_84]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                  and 
                                  (
                                    throw_85=java_lang_NullPointerExceptionLit)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                  )
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4)++((ClassFields)->(false)))
                                  and 
                                  (
                                    throw_84=throw_85)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_84]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5)
                              and 
                              (
                                throw_84=throw_85)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition30[t_271_4])
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5)
                          and 
                          (
                            throw_83=throw_85)
                          and 
                          (
                            var_94_result_4=var_94_result_5)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_83]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5)
                      and 
                      (
                        var_94_result_4=var_94_result_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4)
                      and 
                      (
                        throw_83=throw_85)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_85]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition32[var_93_current_4]
                          and 
                          (
                            throw_86=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            var_93_current_4=var_93_current_5)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition32[var_93_current_4])
                          )
                          and 
                          (
                            var_93_current_5=var_93_current_4.roops_core_objectsInstrumented_SinglyLinkedListNode_next_0)
                          and 
                          (
                            throw_85=throw_86)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_85]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        var_93_current_4=var_93_current_5)
                      and 
                      (
                        throw_85=throw_86)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_86]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                          and 
                          (
                            throw_87=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_4)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_4=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_3)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4)))
                          and 
                          (
                            throw_86=throw_87)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_86]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_4)
                      and 
                      (
                        throw_86=throw_87)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_87]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                          and 
                          (
                            throw_88=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_4)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_4=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_3)++((ClassFields)->(true)))
                          and 
                          (
                            throw_87=throw_88)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_87]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_4)
                      and 
                      (
                        throw_87=throw_88)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_88]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                          and 
                          (
                            throw_89=java_lang_NullPointerExceptionLit)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                          )
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4)++((ClassFields)->(false)))
                          and 
                          (
                            throw_88=throw_89)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_88]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5)
                      and 
                      (
                        throw_88=throw_89)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_89]
                      and 
                      (
                        t_273_4=(equ[var_94_result_5,
                           false]=>(true)else(false))
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_89]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_273_3=t_273_4)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_89]
                      and 
                      (
                        t_274_4=(neq[var_93_current_5,
                           null]=>(true)else(false))
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_89]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_274_3=t_274_4)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_89]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition36[t_273_4]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_89]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition34[t_274_4]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_89]
                                      and 
                                      (
                                        t_272_4=true)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_89]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        t_272_3=t_272_4)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition34[t_274_4])
                                  )
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_89]
                                      and 
                                      (
                                        t_272_4=false)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_89]
                                        )
                                      )
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        t_272_3=t_272_4)
                                    )
                                  )
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_89]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_272_3=t_272_4)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition36[t_273_4])
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_89]
                              and 
                              (
                                t_272_4=false)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_89]
                                )
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                t_272_3=t_272_4)
                            )
                          )
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_89]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_272_3=t_272_4)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                               throw_89]
                      and 
                      (
                        var_95_ws_22_5=t_272_4)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_89]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        var_95_ws_22_4=var_95_ws_22_5)
                    )
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition38[exit_stmt_reached_1,
                                                                                throw_89,
                                                                                var_95_ws_22_5]
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
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_89]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                              and 
                              (
                                throw_90=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8)++((ClassFields)->(true)))
                              and 
                              (
                                throw_89=throw_90)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_89]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9)
                          and 
                          (
                            throw_89=throw_90)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_90]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                              and 
                              (
                                throw_91=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_5)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_5=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_4)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)))
                              and 
                              (
                                throw_90=throw_91)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_90]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_5)
                          and 
                          (
                            throw_90=throw_91)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_91]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                              and 
                              (
                                throw_92=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_5)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_5=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_4)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5)))
                              and 
                              (
                                throw_91=throw_92)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_91]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_5)
                          and 
                          (
                            throw_91=throw_92)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_92]
                          and 
                          (
                            t_269_5=(equ[value_param_0,
                               null]=>(true)else(false))
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_92]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_269_4=t_269_5)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_92]
                          and 
                          (
                            t_270_5=(equ[var_93_current_5.roops_core_objectsInstrumented_SinglyLinkedListNode_value_0,
                               null]=>(true)else(false))
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_92]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_270_4=t_270_5)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_92]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition22[t_269_5]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_92]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition20[t_270_5]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_92]
                                          and 
                                          (
                                            t_268_5=true)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_92]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            t_268_4=t_268_5)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition20[t_270_5])
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_92]
                                          and 
                                          (
                                            t_268_5=false)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_92]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            t_268_4=t_268_5)
                                        )
                                      )
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_92]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    t_268_4=t_268_5)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition22[t_269_5])
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_92]
                                  and 
                                  (
                                    t_268_5=false)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_92]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    t_268_4=t_268_5)
                                )
                              )
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_92]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_268_4=t_268_5)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_92]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition28[t_268_5]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_92]
                                  and 
                                  (
                                    var_96_equalVal_5=true)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_92]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    var_96_equalVal_4=var_96_equalVal_5)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_92]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_93=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)++((ClassFields)->(true)))
                                      and 
                                      (
                                        throw_92=throw_93)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_92]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
                                  and 
                                  (
                                    throw_92=throw_93)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_93]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_98=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9)++((ClassFields)->(false)))
                                      and 
                                      (
                                        throw_93=throw_98)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_93]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
                                  and 
                                  (
                                    throw_93=throw_98)
                                )
                              )
                              and 
                              (
                                t_267_4=t_267_5)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5)
                              and 
                              (
                                t_266_4=t_266_5)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition28[t_268_5])
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_92]
                                  and 
                                  (
                                    t_267_5=(neq[value_param_0,
                                       null]=>(true)else(false))
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_92]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    t_267_4=t_267_5)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_92]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition26[t_267_5]
                                      and 
                                      TruePred[]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_92]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                                              and 
                                              (
                                                throw_93=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1)))
                                              and 
                                              (
                                                throw_92=throw_93)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_92]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5)
                                          and 
                                          (
                                            throw_92=throw_93)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_93]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                                              and 
                                              (
                                                throw_94=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5)))
                                              and 
                                              (
                                                throw_93=throw_94)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_93]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5)
                                          and 
                                          (
                                            throw_93=throw_94)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_94]
                                          and 
                                          (
                                            t_266_5=(equ[value_param_0,
                                               var_93_current_5.roops_core_objectsInstrumented_SinglyLinkedListNode_value_0]=>(true)else(false))
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_94]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            t_266_4=t_266_5)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_94]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition24[t_266_5]
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_94]
                                                  and 
                                                  (
                                                    var_96_equalVal_5=true)
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                               throw_94]
                                                    )
                                                  )
                                                  and 
                                                  TruePred[]
                                                  and 
                                                  (
                                                    var_96_equalVal_4=var_96_equalVal_5)
                                                )
                                              )
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_94]
                                                  and 
                                                  (
                                                    (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                      and 
                                                      (
                                                        throw_95=java_lang_NullPointerExceptionLit)
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
                                                    )
                                                    or 
                                                    (
                                                      (
                                                        not (
                                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                      )
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)++((ClassFields)->(true)))
                                                      and 
                                                      (
                                                        throw_94=throw_95)
                                                    )
                                                  )
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                               throw_94]
                                                    )
                                                  )
                                                  and 
                                                  TruePred[]
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
                                                  and 
                                                  (
                                                    throw_94=throw_95)
                                                )
                                              )
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_95]
                                                  and 
                                                  (
                                                    (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                      and 
                                                      (
                                                        throw_96=java_lang_NullPointerExceptionLit)
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
                                                    )
                                                    or 
                                                    (
                                                      (
                                                        not (
                                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                      )
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9)++((ClassFields)->(false)))
                                                      and 
                                                      (
                                                        throw_95=throw_96)
                                                    )
                                                  )
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                               throw_95]
                                                    )
                                                  )
                                                  and 
                                                  TruePred[]
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
                                                  and 
                                                  (
                                                    throw_95=throw_96)
                                                )
                                              )
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_96]
                                                  and 
                                                  (
                                                    (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                      and 
                                                      (
                                                        throw_98=java_lang_NullPointerExceptionLit)
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
                                                    )
                                                    or 
                                                    (
                                                      (
                                                        not (
                                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                      )
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)++((ClassFields)->(false)))
                                                      and 
                                                      (
                                                        throw_96=throw_98)
                                                    )
                                                  )
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                               throw_96]
                                                    )
                                                  )
                                                  and 
                                                  TruePred[]
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
                                                  and 
                                                  (
                                                    throw_96=throw_98)
                                                )
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition24[t_266_5])
                                              )
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_94]
                                                  and 
                                                  (
                                                    var_96_equalVal_5=false)
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                               throw_94]
                                                    )
                                                  )
                                                  and 
                                                  TruePred[]
                                                  and 
                                                  (
                                                    var_96_equalVal_4=var_96_equalVal_5)
                                                )
                                              )
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_94]
                                                  and 
                                                  (
                                                    (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                      and 
                                                      (
                                                        throw_95=java_lang_NullPointerExceptionLit)
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
                                                    )
                                                    or 
                                                    (
                                                      (
                                                        not (
                                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                      )
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4)++((ClassFields)->(true)))
                                                      and 
                                                      (
                                                        throw_94=throw_95)
                                                    )
                                                  )
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                               throw_94]
                                                    )
                                                  )
                                                  and 
                                                  TruePred[]
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
                                                  and 
                                                  (
                                                    throw_94=throw_95)
                                                )
                                              )
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_95]
                                                  and 
                                                  (
                                                    (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                      and 
                                                      (
                                                        throw_96=java_lang_NullPointerExceptionLit)
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
                                                    )
                                                    or 
                                                    (
                                                      (
                                                        not (
                                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                      )
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9)++((ClassFields)->(false)))
                                                      and 
                                                      (
                                                        throw_95=throw_96)
                                                    )
                                                  )
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                               throw_95]
                                                    )
                                                  )
                                                  and 
                                                  TruePred[]
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
                                                  and 
                                                  (
                                                    throw_95=throw_96)
                                                )
                                              )
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_96]
                                                  and 
                                                  (
                                                    (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                      and 
                                                      (
                                                        throw_97=java_lang_NullPointerExceptionLit)
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
                                                    )
                                                    or 
                                                    (
                                                      (
                                                        not (
                                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                      )
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)++((ClassFields)->(false)))
                                                      and 
                                                      (
                                                        throw_96=throw_97)
                                                    )
                                                  )
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                               throw_96]
                                                    )
                                                  )
                                                  and 
                                                  TruePred[]
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
                                                  and 
                                                  (
                                                    throw_96=throw_97)
                                                )
                                              )
                                              and 
                                              (
                                                (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                           throw_97]
                                                  and 
                                                  (
                                                    (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                                      and 
                                                      (
                                                        throw_98=java_lang_NullPointerExceptionLit)
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
                                                    )
                                                    or 
                                                    (
                                                      (
                                                        not (
                                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                                      )
                                                      and 
                                                      (
                                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)++((ClassFields)->(false)))
                                                      and 
                                                      (
                                                        throw_97=throw_98)
                                                    )
                                                  )
                                                )
                                                or 
                                                (
                                                  (
                                                    not (
                                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                               throw_97]
                                                    )
                                                  )
                                                  and 
                                                  TruePred[]
                                                  and 
                                                  (
                                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
                                                  and 
                                                  (
                                                    throw_97=throw_98)
                                                )
                                              )
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_94]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
                                          and 
                                          (
                                            var_96_equalVal_4=var_96_equalVal_5)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
                                          and 
                                          (
                                            throw_94=throw_98)
                                        )
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition26[t_267_5])
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_92]
                                          and 
                                          (
                                            var_96_equalVal_5=false)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_92]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            var_96_equalVal_4=var_96_equalVal_5)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_92]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                              and 
                                              (
                                                throw_93=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4)++((ClassFields)->(true)))
                                              and 
                                              (
                                                throw_92=throw_93)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_92]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5)
                                          and 
                                          (
                                            throw_92=throw_93)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_93]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                              and 
                                              (
                                                throw_94=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9)++((ClassFields)->(false)))
                                              and 
                                              (
                                                throw_93=throw_94)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_93]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
                                          and 
                                          (
                                            throw_93=throw_94)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_94]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                              and 
                                              (
                                                throw_95=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4)++((ClassFields)->(false)))
                                              and 
                                              (
                                                throw_94=throw_95)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_94]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
                                          and 
                                          (
                                            throw_94=throw_95)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_95]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                              and 
                                              (
                                                throw_96=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4)++((ClassFields)->(false)))
                                              and 
                                              (
                                                throw_95=throw_96)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_95]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
                                          and 
                                          (
                                            throw_95=throw_96)
                                        )
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_96]
                                          and 
                                          (
                                            (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                              and 
                                              (
                                                throw_98=java_lang_NullPointerExceptionLit)
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
                                            )
                                            or 
                                            (
                                              (
                                                not (
                                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                              )
                                              and 
                                              (
                                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4)++((ClassFields)->(false)))
                                              and 
                                              (
                                                throw_96=throw_98)
                                            )
                                          )
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_96]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
                                          and 
                                          (
                                            throw_96=throw_98)
                                        )
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5)
                                      and 
                                      (
                                        t_266_4=t_266_5)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_92]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5)
                                  and 
                                  (
                                    t_266_4=t_266_5)
                                  and 
                                  (
                                    var_96_equalVal_4=var_96_equalVal_5)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
                                  and 
                                  (
                                    throw_92=throw_98)
                                )
                              )
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_92]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_267_4=t_267_5)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5)
                          and 
                          (
                            t_266_4=t_266_5)
                          and 
                          (
                            var_96_equalVal_4=var_96_equalVal_5)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
                          and 
                          (
                            throw_92=throw_98)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_98]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                              and 
                              (
                                throw_99=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_5)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_5=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_4)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)))
                              and 
                              (
                                throw_98=throw_99)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_98]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_5)
                          and 
                          (
                            throw_98=throw_99)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_99]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                              and 
                              (
                                throw_100=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_5)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_5=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_4)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)))
                              and 
                              (
                                throw_99=throw_100)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_99]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_5)
                          and 
                          (
                            throw_99=throw_100)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_100]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                              and 
                              (
                                throw_101=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_5)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_5=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_4)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)))
                              and 
                              (
                                throw_100=throw_101)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_100]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_5)
                          and 
                          (
                            throw_100=throw_101)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_101]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                              and 
                              (
                                throw_102=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_5)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_5=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_4)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)))
                              and 
                              (
                                throw_101=throw_102)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_101]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_5)
                          and 
                          (
                            throw_101=throw_102)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_102]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                              and 
                              (
                                throw_103=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_5)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_5=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_4)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5)))
                              and 
                              (
                                throw_102=throw_103)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_102]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_5)
                          and 
                          (
                            throw_102=throw_103)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_103]
                          and 
                          (
                            t_271_5=(equ[var_96_equalVal_5,
                               true]=>(true)else(false))
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_103]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_271_4=t_271_5)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_103]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition30[t_271_5]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_103]
                                  and 
                                  (
                                    var_94_result_6=true)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_103]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    var_94_result_5=var_94_result_6)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_103]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_104=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4)++((ClassFields)->(true)))
                                      and 
                                      (
                                        throw_103=throw_104)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_103]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5)
                                  and 
                                  (
                                    throw_103=throw_104)
                                )
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_104]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                                      and 
                                      (
                                        throw_105=java_lang_NullPointerExceptionLit)
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6)
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                                      )
                                      and 
                                      (
                                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5)++((ClassFields)->(false)))
                                      and 
                                      (
                                        throw_104=throw_105)
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_104]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6)
                                  and 
                                  (
                                    throw_104=throw_105)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition30[t_271_5])
                              )
                              and 
                              TruePred[]
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6)
                              and 
                              (
                                throw_103=throw_105)
                              and 
                              (
                                var_94_result_5=var_94_result_6)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_103]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6)
                          and 
                          (
                            var_94_result_5=var_94_result_6)
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5)
                          and 
                          (
                            throw_103=throw_105)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_105]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition32[var_93_current_5]
                              and 
                              (
                                throw_106=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                var_93_current_5=var_93_current_6)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition32[var_93_current_5])
                              )
                              and 
                              (
                                var_93_current_6=var_93_current_5.roops_core_objectsInstrumented_SinglyLinkedListNode_next_0)
                              and 
                              (
                                throw_105=throw_106)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_105]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            var_93_current_5=var_93_current_6)
                          and 
                          (
                            throw_105=throw_106)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_106]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
                              and 
                              (
                                throw_107=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_5)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_5=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_4)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5)))
                              and 
                              (
                                throw_106=throw_107)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_106]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_5)
                          and 
                          (
                            throw_106=throw_107)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_107]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                              and 
                              (
                                throw_108=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_5)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_5=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_4)++((ClassFields)->(true)))
                              and 
                              (
                                throw_107=throw_108)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_107]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_5)
                          and 
                          (
                            throw_107=throw_108)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_108]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition0[]
                              and 
                              (
                                throw_109=java_lang_NullPointerExceptionLit)
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_6)
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition0[])
                              )
                              and 
                              (
                                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_6=(roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5)++((ClassFields)->(false)))
                              and 
                              (
                                throw_108=throw_109)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_108]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_6)
                          and 
                          (
                            throw_108=throw_109)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_109]
                          and 
                          (
                            t_273_5=(equ[var_94_result_6,
                               false]=>(true)else(false))
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_109]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_273_4=t_273_5)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_109]
                          and 
                          (
                            t_274_5=(neq[var_93_current_6,
                               null]=>(true)else(false))
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_109]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_274_4=t_274_5)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_109]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition36[t_273_5]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_109]
                                  and 
                                  (
                                    (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition34[t_274_5]
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_109]
                                          and 
                                          (
                                            t_272_5=true)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_109]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            t_272_4=t_272_5)
                                        )
                                      )
                                    )
                                    or 
                                    (
                                      (
                                        not (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition34[t_274_5])
                                      )
                                      and 
                                      (
                                        (
                                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                   throw_109]
                                          and 
                                          (
                                            t_272_5=false)
                                        )
                                        or 
                                        (
                                          (
                                            not (
                                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                                       throw_109]
                                            )
                                          )
                                          and 
                                          TruePred[]
                                          and 
                                          (
                                            t_272_4=t_272_5)
                                        )
                                      )
                                    )
                                  )
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_109]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    t_272_4=t_272_5)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition36[t_273_5])
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                           throw_109]
                                  and 
                                  (
                                    t_272_5=false)
                                )
                                or 
                                (
                                  (
                                    not (
                                      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                               throw_109]
                                    )
                                  )
                                  and 
                                  TruePred[]
                                  and 
                                  (
                                    t_272_4=t_272_5)
                                )
                              )
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_109]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_272_4=t_272_5)
                        )
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                   throw_109]
                          and 
                          (
                            var_95_ws_22_6=t_272_5)
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                                       throw_109]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            var_95_ws_22_5=var_95_ws_22_6)
                        )
                      )
                      and 
                      TruePred[]
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_SinglyLinkedListCondition38[exit_stmt_reached_1,
                                                                                    throw_89,
                                                                                    var_95_ws_22_5]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_269_4=t_269_5)
                      and 
                      (
                        t_267_4=t_267_5)
                      and 
                      (
                        t_268_4=t_268_5)
                      and 
                      (
                        var_94_result_5=var_94_result_6)
                      and 
                      (
                        t_266_4=t_266_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_6)
                      and 
                      (
                        var_93_current_5=var_93_current_6)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_5)
                      and 
                      (
                        t_274_4=t_274_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5)
                      and 
                      (
                        t_270_4=t_270_5)
                      and 
                      (
                        t_271_4=t_271_5)
                      and 
                      (
                        t_272_4=t_272_5)
                      and 
                      (
                        t_273_4=t_273_5)
                      and 
                      (
                        var_96_equalVal_4=var_96_equalVal_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_4=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
                      and 
                      (
                        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
                      and 
                      (
                        throw_89=throw_109)
                      and 
                      (
                        var_95_ws_22_5=var_95_ws_22_6)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_SinglyLinkedListCondition38[exit_stmt_reached_1,
                                                                                throw_69,
                                                                                var_95_ws_22_4]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_269_3=t_269_5)
                  and 
                  (
                    t_267_3=t_267_5)
                  and 
                  (
                    var_94_result_4=var_94_result_6)
                  and 
                  (
                    t_268_3=t_268_5)
                  and 
                  (
                    t_266_3=t_266_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_6)
                  and 
                  (
                    var_93_current_4=var_93_current_6)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_5)
                  and 
                  (
                    t_274_3=t_274_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5)
                  and 
                  (
                    t_270_3=t_270_5)
                  and 
                  (
                    t_271_3=t_271_5)
                  and 
                  (
                    t_272_3=t_272_5)
                  and 
                  (
                    t_273_3=t_273_5)
                  and 
                  (
                    var_96_equalVal_3=var_96_equalVal_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_3=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
                  and 
                  (
                    roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
                  and 
                  (
                    throw_69=throw_109)
                  and 
                  (
                    var_95_ws_22_4=var_95_ws_22_6)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_SinglyLinkedListCondition38[exit_stmt_reached_1,
                                                                            throw_49,
                                                                            var_95_ws_22_3]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_269_2=t_269_5)
              and 
              (
                t_267_2=t_267_5)
              and 
              (
                t_268_2=t_268_5)
              and 
              (
                var_94_result_3=var_94_result_6)
              and 
              (
                t_266_2=t_266_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_6)
              and 
              (
                var_93_current_3=var_93_current_6)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_5)
              and 
              (
                t_274_2=t_274_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5)
              and 
              (
                t_270_2=t_270_5)
              and 
              (
                t_271_2=t_271_5)
              and 
              (
                t_272_2=t_272_5)
              and 
              (
                t_273_2=t_273_5)
              and 
              (
                var_96_equalVal_2=var_96_equalVal_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_2=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
              and 
              (
                roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
              and 
              (
                throw_49=throw_109)
              and 
              (
                var_95_ws_22_3=var_95_ws_22_6)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition38[exit_stmt_reached_1,
                                                                        throw_29,
                                                                        var_95_ws_22_2]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_269_1=t_269_5)
          and 
          (
            t_267_1=t_267_5)
          and 
          (
            t_268_1=t_268_5)
          and 
          (
            var_94_result_2=var_94_result_6)
          and 
          (
            t_266_1=t_266_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_6)
          and 
          (
            var_93_current_2=var_93_current_6)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_5)
          and 
          (
            t_274_1=t_274_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5)
          and 
          (
            t_270_1=t_270_5)
          and 
          (
            t_271_1=t_271_5)
          and 
          (
            t_272_1=t_272_5)
          and 
          (
            t_273_1=t_273_5)
          and 
          (
            var_96_equalVal_1=var_96_equalVal_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
          and 
          (
            throw_29=throw_109)
          and 
          (
            var_95_ws_22_2=var_95_ws_22_6)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition38[exit_stmt_reached_1,
                                                                    throw_9,
                                                                    var_95_ws_22_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_269_0=t_269_5)
      and 
      (
        t_267_0=t_267_5)
      and 
      (
        t_268_0=t_268_5)
      and 
      (
        var_94_result_1=var_94_result_6)
      and 
      (
        t_266_0=t_266_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_6)
      and 
      (
        var_93_current_1=var_93_current_6)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_5)
      and 
      (
        t_274_0=t_274_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5)
      and 
      (
        t_270_0=t_270_5)
      and 
      (
        t_271_0=t_271_5)
      and 
      (
        t_272_0=t_272_5)
      and 
      (
        t_273_0=t_273_5)
      and 
      (
        var_96_equalVal_0=var_96_equalVal_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5)
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0=roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5)
      and 
      (
        throw_9=throw_109)
      and 
      (
        var_95_ws_22_1=var_95_ws_22_6)
    )
  )
  and 
  (
    not (
      roops_core_objectsInstrumented_SinglyLinkedListCondition38[exit_stmt_reached_1,
                                                                throw_109,
                                                                var_95_ws_22_6]
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_109]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
          and 
          (
            throw_110=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6)))
          and 
          (
            throw_109=throw_110)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_109]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1)
      and 
      (
        throw_109=throw_110)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_110]
      and 
      (
        (
          roops_core_objectsInstrumented_SinglyLinkedListCondition10[]
          and 
          (
            throw_111=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_SinglyLinkedListCondition10[])
          )
          and 
          (
            roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1=(roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_0)++((ClassFields)->(ClassFields.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5)))
          and 
          (
            throw_110=throw_111)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_110]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_0=roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1)
      and 
      (
        throw_110=throw_111)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                               throw_111]
      and 
      (
        return_1=var_94_result_6)
      and 
      (
        exit_stmt_reached_2=true)
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_SinglyLinkedListCondition2[exit_stmt_reached_1,
                                                                   throw_111]
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

one sig QF {
  l3_exit_stmt_reached_1: boolean,
  l3_l0_exit_stmt_reached_1: boolean,
  l3_l1_exit_stmt_reached_0: boolean,
  l3_l1_exit_stmt_reached_1: boolean,
  l3_l1_exit_stmt_reached_2: boolean,
  l3_l2_exit_stmt_reached_0: boolean,
  l3_l2_exit_stmt_reached_1: boolean,
  l3_l2_exit_stmt_reached_2: boolean,
  l3_l2_t_263_0: boolean,
  l3_l2_t_263_1: boolean,
  l3_l2_t_264_0: boolean,
  l3_l2_t_264_1: boolean,
  l3_l2_t_265_0: boolean,
  l3_l2_t_265_1: boolean,
  l3_l2_t_266_0: boolean,
  l3_l2_t_266_1: boolean,
  l3_l2_t_266_2: boolean,
  l3_l2_t_266_3: boolean,
  l3_l2_t_266_4: boolean,
  l3_l2_t_266_5: boolean,
  l3_l2_t_267_0: boolean,
  l3_l2_t_267_1: boolean,
  l3_l2_t_267_2: boolean,
  l3_l2_t_267_3: boolean,
  l3_l2_t_267_4: boolean,
  l3_l2_t_267_5: boolean,
  l3_l2_t_268_0: boolean,
  l3_l2_t_268_1: boolean,
  l3_l2_t_268_2: boolean,
  l3_l2_t_268_3: boolean,
  l3_l2_t_268_4: boolean,
  l3_l2_t_268_5: boolean,
  l3_l2_t_269_0: boolean,
  l3_l2_t_269_1: boolean,
  l3_l2_t_269_2: boolean,
  l3_l2_t_269_3: boolean,
  l3_l2_t_269_4: boolean,
  l3_l2_t_269_5: boolean,
  l3_l2_t_270_0: boolean,
  l3_l2_t_270_1: boolean,
  l3_l2_t_270_2: boolean,
  l3_l2_t_270_3: boolean,
  l3_l2_t_270_4: boolean,
  l3_l2_t_270_5: boolean,
  l3_l2_t_271_0: boolean,
  l3_l2_t_271_1: boolean,
  l3_l2_t_271_2: boolean,
  l3_l2_t_271_3: boolean,
  l3_l2_t_271_4: boolean,
  l3_l2_t_271_5: boolean,
  l3_l2_t_272_0: boolean,
  l3_l2_t_272_1: boolean,
  l3_l2_t_272_2: boolean,
  l3_l2_t_272_3: boolean,
  l3_l2_t_272_4: boolean,
  l3_l2_t_272_5: boolean,
  l3_l2_t_273_0: boolean,
  l3_l2_t_273_1: boolean,
  l3_l2_t_273_2: boolean,
  l3_l2_t_273_3: boolean,
  l3_l2_t_273_4: boolean,
  l3_l2_t_273_5: boolean,
  l3_l2_t_274_0: boolean,
  l3_l2_t_274_1: boolean,
  l3_l2_t_274_2: boolean,
  l3_l2_t_274_3: boolean,
  l3_l2_t_274_4: boolean,
  l3_l2_t_274_5: boolean,
  l3_l2_var_93_current_0: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l3_l2_var_93_current_1: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l3_l2_var_93_current_2: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l3_l2_var_93_current_3: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l3_l2_var_93_current_4: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l3_l2_var_93_current_5: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l3_l2_var_93_current_6: null + roops_core_objectsInstrumented_SinglyLinkedListNode,
  l3_l2_var_94_result_0: boolean,
  l3_l2_var_94_result_1: boolean,
  l3_l2_var_94_result_2: boolean,
  l3_l2_var_94_result_3: boolean,
  l3_l2_var_94_result_4: boolean,
  l3_l2_var_94_result_5: boolean,
  l3_l2_var_94_result_6: boolean,
  l3_l2_var_95_ws_22_0: boolean,
  l3_l2_var_95_ws_22_1: boolean,
  l3_l2_var_95_ws_22_2: boolean,
  l3_l2_var_95_ws_22_3: boolean,
  l3_l2_var_95_ws_22_4: boolean,
  l3_l2_var_95_ws_22_5: boolean,
  l3_l2_var_95_ws_22_6: boolean,
  l3_l2_var_96_equalVal_0: boolean,
  l3_l2_var_96_equalVal_1: boolean,
  l3_l2_var_96_equalVal_2: boolean,
  l3_l2_var_96_equalVal_3: boolean,
  l3_l2_var_96_equalVal_4: boolean,
  l3_l2_var_96_equalVal_5: boolean,
  l3_t_253_0: boolean,
  l3_t_253_1: boolean,
  l3_t_254_0: boolean,
  l3_t_254_1: boolean,
  l3_t_255_0: boolean,
  l3_t_255_1: boolean,
  l3_t_256_0: boolean,
  l3_t_256_1: boolean,
  l3_var_92_ret_val_0: boolean,
  l3_var_92_ret_val_1: boolean,
  list_0: null + roops_core_objectsInstrumented_SinglyLinkedList,
  roops_core_objectsInstrumented_SinglyLinkedListNode_next_0: ( roops_core_objectsInstrumented_SinglyLinkedListNode ) -> one ( null + roops_core_objectsInstrumented_SinglyLinkedListNode ),
  roops_core_objectsInstrumented_SinglyLinkedListNode_value_0: ( roops_core_objectsInstrumented_SinglyLinkedListNode ) -> one ( java_lang_Object + null ),
  roops_core_objectsInstrumented_SinglyLinkedList_header_0: ( roops_core_objectsInstrumented_SinglyLinkedList ) -> one ( null + roops_core_objectsInstrumented_SinglyLinkedListNode ),
  roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_0: ( ClassFields ) -> one ( null + roops_utilInstrumented_RoopsArray ),
  roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_1: ( ClassFields ) -> one ( null + roops_utilInstrumented_RoopsArray ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_7: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_7: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_11: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9: ( ClassFields ) -> one ( boolean ),
  throw_0: java_lang_Throwable + null,
  throw_1: java_lang_Throwable + null,
  throw_10: java_lang_Throwable + null,
  throw_100: java_lang_Throwable + null,
  throw_101: java_lang_Throwable + null,
  throw_102: java_lang_Throwable + null,
  throw_103: java_lang_Throwable + null,
  throw_104: java_lang_Throwable + null,
  throw_105: java_lang_Throwable + null,
  throw_106: java_lang_Throwable + null,
  throw_107: java_lang_Throwable + null,
  throw_108: java_lang_Throwable + null,
  throw_109: java_lang_Throwable + null,
  throw_11: java_lang_Throwable + null,
  throw_110: java_lang_Throwable + null,
  throw_111: java_lang_Throwable + null,
  throw_112: java_lang_Throwable + null,
  throw_113: java_lang_Throwable + null,
  throw_114: java_lang_Throwable + null,
  throw_115: java_lang_Throwable + null,
  throw_116: java_lang_Throwable + null,
  throw_117: java_lang_Throwable + null,
  throw_118: java_lang_Throwable + null,
  throw_119: java_lang_Throwable + null,
  throw_12: java_lang_Throwable + null,
  throw_120: java_lang_Throwable + null,
  throw_121: java_lang_Throwable + null,
  throw_122: java_lang_Throwable + null,
  throw_123: java_lang_Throwable + null,
  throw_124: java_lang_Throwable + null,
  throw_125: java_lang_Throwable + null,
  throw_126: java_lang_Throwable + null,
  throw_127: java_lang_Throwable + null,
  throw_128: java_lang_Throwable + null,
  throw_129: java_lang_Throwable + null,
  throw_13: java_lang_Throwable + null,
  throw_130: java_lang_Throwable + null,
  throw_131: java_lang_Throwable + null,
  throw_132: java_lang_Throwable + null,
  throw_133: java_lang_Throwable + null,
  throw_134: java_lang_Throwable + null,
  throw_135: java_lang_Throwable + null,
  throw_136: java_lang_Throwable + null,
  throw_137: java_lang_Throwable + null,
  throw_138: java_lang_Throwable + null,
  throw_139: java_lang_Throwable + null,
  throw_14: java_lang_Throwable + null,
  throw_140: java_lang_Throwable + null,
  throw_141: java_lang_Throwable + null,
  throw_142: java_lang_Throwable + null,
  throw_143: java_lang_Throwable + null,
  throw_144: java_lang_Throwable + null,
  throw_145: java_lang_Throwable + null,
  throw_146: java_lang_Throwable + null,
  throw_147: java_lang_Throwable + null,
  throw_148: java_lang_Throwable + null,
  throw_149: java_lang_Throwable + null,
  throw_15: java_lang_Throwable + null,
  throw_150: java_lang_Throwable + null,
  throw_151: java_lang_Throwable + null,
  throw_152: java_lang_Throwable + null,
  throw_153: java_lang_Throwable + null,
  throw_154: java_lang_Throwable + null,
  throw_16: java_lang_Throwable + null,
  throw_17: java_lang_Throwable + null,
  throw_18: java_lang_Throwable + null,
  throw_19: java_lang_Throwable + null,
  throw_2: java_lang_Throwable + null,
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
  throw_3: java_lang_Throwable + null,
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
  throw_4: java_lang_Throwable + null,
  throw_40: java_lang_Throwable + null,
  throw_41: java_lang_Throwable + null,
  throw_42: java_lang_Throwable + null,
  throw_43: java_lang_Throwable + null,
  throw_44: java_lang_Throwable + null,
  throw_45: java_lang_Throwable + null,
  throw_46: java_lang_Throwable + null,
  throw_47: java_lang_Throwable + null,
  throw_48: java_lang_Throwable + null,
  throw_49: java_lang_Throwable + null,
  throw_5: java_lang_Throwable + null,
  throw_50: java_lang_Throwable + null,
  throw_51: java_lang_Throwable + null,
  throw_52: java_lang_Throwable + null,
  throw_53: java_lang_Throwable + null,
  throw_54: java_lang_Throwable + null,
  throw_55: java_lang_Throwable + null,
  throw_56: java_lang_Throwable + null,
  throw_57: java_lang_Throwable + null,
  throw_58: java_lang_Throwable + null,
  throw_59: java_lang_Throwable + null,
  throw_6: java_lang_Throwable + null,
  throw_60: java_lang_Throwable + null,
  throw_61: java_lang_Throwable + null,
  throw_62: java_lang_Throwable + null,
  throw_63: java_lang_Throwable + null,
  throw_64: java_lang_Throwable + null,
  throw_65: java_lang_Throwable + null,
  throw_66: java_lang_Throwable + null,
  throw_67: java_lang_Throwable + null,
  throw_68: java_lang_Throwable + null,
  throw_69: java_lang_Throwable + null,
  throw_7: java_lang_Throwable + null,
  throw_70: java_lang_Throwable + null,
  throw_71: java_lang_Throwable + null,
  throw_72: java_lang_Throwable + null,
  throw_73: java_lang_Throwable + null,
  throw_74: java_lang_Throwable + null,
  throw_75: java_lang_Throwable + null,
  throw_76: java_lang_Throwable + null,
  throw_77: java_lang_Throwable + null,
  throw_78: java_lang_Throwable + null,
  throw_79: java_lang_Throwable + null,
  throw_8: java_lang_Throwable + null,
  throw_80: java_lang_Throwable + null,
  throw_81: java_lang_Throwable + null,
  throw_82: java_lang_Throwable + null,
  throw_83: java_lang_Throwable + null,
  throw_84: java_lang_Throwable + null,
  throw_85: java_lang_Throwable + null,
  throw_86: java_lang_Throwable + null,
  throw_87: java_lang_Throwable + null,
  throw_88: java_lang_Throwable + null,
  throw_89: java_lang_Throwable + null,
  throw_9: java_lang_Throwable + null,
  throw_90: java_lang_Throwable + null,
  throw_91: java_lang_Throwable + null,
  throw_92: java_lang_Throwable + null,
  throw_93: java_lang_Throwable + null,
  throw_94: java_lang_Throwable + null,
  throw_95: java_lang_Throwable + null,
  throw_96: java_lang_Throwable + null,
  throw_97: java_lang_Throwable + null,
  throw_98: java_lang_Throwable + null,
  throw_99: java_lang_Throwable + null,
  value_param_0: java_lang_Object + null
}


fact {
  precondition_roops_core_objectsInstrumented_SinglyLinkedList_containsTest_0[QF.roops_core_objectsInstrumented_SinglyLinkedListNode_next_0,
                                                                             QF.roops_core_objectsInstrumented_SinglyLinkedList_header_0,
                                                                             QF.throw_0]

}

fact {
  roops_core_objectsInstrumented_SinglyLinkedList_containsTest_0[QF.throw_1,
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
                                                                QF.throw_48,
                                                                QF.throw_49,
                                                                QF.throw_50,
                                                                QF.throw_51,
                                                                QF.throw_52,
                                                                QF.throw_53,
                                                                QF.throw_54,
                                                                QF.throw_55,
                                                                QF.throw_56,
                                                                QF.throw_57,
                                                                QF.throw_58,
                                                                QF.throw_59,
                                                                QF.throw_60,
                                                                QF.throw_61,
                                                                QF.throw_62,
                                                                QF.throw_63,
                                                                QF.throw_64,
                                                                QF.throw_65,
                                                                QF.throw_66,
                                                                QF.throw_67,
                                                                QF.throw_68,
                                                                QF.throw_69,
                                                                QF.throw_70,
                                                                QF.throw_71,
                                                                QF.throw_72,
                                                                QF.throw_73,
                                                                QF.throw_74,
                                                                QF.throw_75,
                                                                QF.throw_76,
                                                                QF.throw_77,
                                                                QF.throw_78,
                                                                QF.throw_79,
                                                                QF.throw_80,
                                                                QF.throw_81,
                                                                QF.throw_82,
                                                                QF.throw_83,
                                                                QF.throw_84,
                                                                QF.throw_85,
                                                                QF.throw_86,
                                                                QF.throw_87,
                                                                QF.throw_88,
                                                                QF.throw_89,
                                                                QF.throw_90,
                                                                QF.throw_91,
                                                                QF.throw_92,
                                                                QF.throw_93,
                                                                QF.throw_94,
                                                                QF.throw_95,
                                                                QF.throw_96,
                                                                QF.throw_97,
                                                                QF.throw_98,
                                                                QF.throw_99,
                                                                QF.throw_100,
                                                                QF.throw_101,
                                                                QF.throw_102,
                                                                QF.throw_103,
                                                                QF.throw_104,
                                                                QF.throw_105,
                                                                QF.throw_106,
                                                                QF.throw_107,
                                                                QF.throw_108,
                                                                QF.throw_109,
                                                                QF.throw_110,
                                                                QF.throw_111,
                                                                QF.throw_112,
                                                                QF.throw_113,
                                                                QF.throw_114,
                                                                QF.throw_115,
                                                                QF.throw_116,
                                                                QF.throw_117,
                                                                QF.throw_118,
                                                                QF.throw_119,
                                                                QF.throw_120,
                                                                QF.throw_121,
                                                                QF.throw_122,
                                                                QF.throw_123,
                                                                QF.throw_124,
                                                                QF.throw_125,
                                                                QF.throw_126,
                                                                QF.throw_127,
                                                                QF.throw_128,
                                                                QF.throw_129,
                                                                QF.throw_130,
                                                                QF.throw_131,
                                                                QF.throw_132,
                                                                QF.throw_133,
                                                                QF.throw_134,
                                                                QF.throw_135,
                                                                QF.throw_136,
                                                                QF.throw_137,
                                                                QF.throw_138,
                                                                QF.throw_139,
                                                                QF.throw_140,
                                                                QF.throw_141,
                                                                QF.throw_142,
                                                                QF.throw_143,
                                                                QF.throw_144,
                                                                QF.throw_145,
                                                                QF.throw_146,
                                                                QF.throw_147,
                                                                QF.throw_148,
                                                                QF.throw_149,
                                                                QF.throw_150,
                                                                QF.throw_151,
                                                                QF.throw_152,
                                                                QF.throw_153,
                                                                QF.throw_154,
                                                                QF.list_0,
                                                                QF.value_param_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_header_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_myRoopsArray_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_7,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_8,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_9,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_10,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_9_11,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_8_7,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_7_7,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_6_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedListNode_next_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_5_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_4_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_3_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_2_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_1_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_0_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_4_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedListNode_value_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_5_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_2_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_3_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_8_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_9_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_6_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_7_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_10_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_17_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_15_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_16_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_13_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_14_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_11_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_roops_goal_12_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_14_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_15_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_10_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_11_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_12_6,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_0,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_1,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_2,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_3,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_4,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_5,
                                                                QF.roops_core_objectsInstrumented_SinglyLinkedList_variable_definition_13_6,
                                                                QF.l3_var_92_ret_val_0,
                                                                QF.l3_var_92_ret_val_1,
                                                                QF.l3_exit_stmt_reached_1,
                                                                QF.l3_t_253_0,
                                                                QF.l3_t_253_1,
                                                                QF.l3_t_254_0,
                                                                QF.l3_t_254_1,
                                                                QF.l3_t_255_0,
                                                                QF.l3_t_255_1,
                                                                QF.l3_t_256_0,
                                                                QF.l3_t_256_1,
                                                                QF.l3_l0_exit_stmt_reached_1,
                                                                QF.l3_l2_var_93_current_0,
                                                                QF.l3_l2_var_93_current_1,
                                                                QF.l3_l2_var_93_current_2,
                                                                QF.l3_l2_var_93_current_3,
                                                                QF.l3_l2_var_93_current_4,
                                                                QF.l3_l2_var_93_current_5,
                                                                QF.l3_l2_var_93_current_6,
                                                                QF.l3_l2_t_263_0,
                                                                QF.l3_l2_t_263_1,
                                                                QF.l3_l2_t_267_0,
                                                                QF.l3_l2_t_267_1,
                                                                QF.l3_l2_t_267_2,
                                                                QF.l3_l2_t_267_3,
                                                                QF.l3_l2_t_267_4,
                                                                QF.l3_l2_t_267_5,
                                                                QF.l3_l2_var_96_equalVal_0,
                                                                QF.l3_l2_var_96_equalVal_1,
                                                                QF.l3_l2_var_96_equalVal_2,
                                                                QF.l3_l2_var_96_equalVal_3,
                                                                QF.l3_l2_var_96_equalVal_4,
                                                                QF.l3_l2_var_96_equalVal_5,
                                                                QF.l3_l2_t_266_0,
                                                                QF.l3_l2_t_266_1,
                                                                QF.l3_l2_t_266_2,
                                                                QF.l3_l2_t_266_3,
                                                                QF.l3_l2_t_266_4,
                                                                QF.l3_l2_t_266_5,
                                                                QF.l3_l2_t_265_0,
                                                                QF.l3_l2_t_265_1,
                                                                QF.l3_l2_t_264_0,
                                                                QF.l3_l2_t_264_1,
                                                                QF.l3_l1_exit_stmt_reached_0,
                                                                QF.l3_l1_exit_stmt_reached_1,
                                                                QF.l3_l1_exit_stmt_reached_2,
                                                                QF.l3_l2_exit_stmt_reached_0,
                                                                QF.l3_l2_exit_stmt_reached_1,
                                                                QF.l3_l2_exit_stmt_reached_2,
                                                                QF.l3_l2_t_273_0,
                                                                QF.l3_l2_t_273_1,
                                                                QF.l3_l2_t_273_2,
                                                                QF.l3_l2_t_273_3,
                                                                QF.l3_l2_t_273_4,
                                                                QF.l3_l2_t_273_5,
                                                                QF.l3_l2_t_274_0,
                                                                QF.l3_l2_t_274_1,
                                                                QF.l3_l2_t_274_2,
                                                                QF.l3_l2_t_274_3,
                                                                QF.l3_l2_t_274_4,
                                                                QF.l3_l2_t_274_5,
                                                                QF.l3_l2_t_271_0,
                                                                QF.l3_l2_t_271_1,
                                                                QF.l3_l2_t_271_2,
                                                                QF.l3_l2_t_271_3,
                                                                QF.l3_l2_t_271_4,
                                                                QF.l3_l2_t_271_5,
                                                                QF.l3_l2_t_272_0,
                                                                QF.l3_l2_t_272_1,
                                                                QF.l3_l2_t_272_2,
                                                                QF.l3_l2_t_272_3,
                                                                QF.l3_l2_t_272_4,
                                                                QF.l3_l2_t_272_5,
                                                                QF.l3_l2_t_268_0,
                                                                QF.l3_l2_t_268_1,
                                                                QF.l3_l2_t_268_2,
                                                                QF.l3_l2_t_268_3,
                                                                QF.l3_l2_t_268_4,
                                                                QF.l3_l2_t_268_5,
                                                                QF.l3_l2_t_269_0,
                                                                QF.l3_l2_t_269_1,
                                                                QF.l3_l2_t_269_2,
                                                                QF.l3_l2_t_269_3,
                                                                QF.l3_l2_t_269_4,
                                                                QF.l3_l2_t_269_5,
                                                                QF.l3_l2_t_270_0,
                                                                QF.l3_l2_t_270_1,
                                                                QF.l3_l2_t_270_2,
                                                                QF.l3_l2_t_270_3,
                                                                QF.l3_l2_t_270_4,
                                                                QF.l3_l2_t_270_5,
                                                                QF.l3_l2_var_94_result_0,
                                                                QF.l3_l2_var_94_result_1,
                                                                QF.l3_l2_var_94_result_2,
                                                                QF.l3_l2_var_94_result_3,
                                                                QF.l3_l2_var_94_result_4,
                                                                QF.l3_l2_var_94_result_5,
                                                                QF.l3_l2_var_94_result_6,
                                                                QF.l3_l2_var_95_ws_22_0,
                                                                QF.l3_l2_var_95_ws_22_1,
                                                                QF.l3_l2_var_95_ws_22_2,
                                                                QF.l3_l2_var_95_ws_22_3,
                                                                QF.l3_l2_var_95_ws_22_4,
                                                                QF.l3_l2_var_95_ws_22_5,
                                                                QF.l3_l2_var_95_ws_22_6]

}

assert check_roops_core_objectsInstrumented_SinglyLinkedList_containsTest_0{
  postcondition_roops_core_objectsInstrumented_SinglyLinkedList_containsTest_0[QF.throw_154]}
