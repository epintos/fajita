/* 
 * DynAlloy translator options 
 * --------------------------- 
 * assertionId= check_roops_core_objectsInstrumented_MCCTest_test9_0
 * loopUnroll= 3
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
pred pred_empty_list[l: seq univ] { (no l) } 

fun fun_list_add[
  l: seq univ,
  e: univ
]: seq univ {
  sequniv/add[l,e] 
} 

fun fun_list_get[
  l: seq univ, 
  index: Int
]: univ { 
  index.l 
} 

fun fun_list_contains[
  l: seq univ, 
  e: univ
]: boolean { 
  (e in Int.l) => true else false 
} 

fun fun_list_remove[
  l: seq univ, 
  index: Int
]: seq univ { 
  sequniv/delete[l,index] 
} 

fun fun_list_size[s: seq univ]: Int { #s } 

fun fun_list_equals[
  s1:seq univ, 
  s2: seq univ
]: boolean { 
  (s1=s2) => true else false 
} 

fun fun_list_empty[s: seq univ]: boolean { (#s = 0) => true else false } 

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
    (a==true) => false else true 
}
fun Or[a: boolean, b: boolean]: boolean {
    (a==true or b==true) => true else false
}
fun And[a: boolean, b: boolean]: boolean {
    (a==true and b==true) => true else false
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

pred havocArrayContentsPost[array:  univ,
                            domain: set univ,
                            Object_Array_0: univ -> (seq univ),
                            Object_Array_1: univ -> (seq univ)
                           ] {
  Object_Array_1 - (array->(domain->univ)) = Object_Array_0 - (array->(domain->univ))
  (array.Object_Array_1).univ = (array.Object_Array_0).univ
}
pred havocFieldContentsPost[target: univ, 
                            field_0: univ -> univ, 
                            field_1: univ -> univ] { 
  field_1 - (target->univ) = field_0 - (target->univ) 
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




//-------------- java_lang_Throwable--------------//
abstract sig java_lang_Throwable {}
{}




//-------------- java_lang_Object--------------//
sig java_lang_Object {}
{}




//-------------- java_lang_NullPointerException--------------//
abstract one sig java_lang_NullPointerException extends java_lang_RuntimeException {}
{}



one
sig java_lang_NullPointerExceptionLit extends java_lang_NullPointerException {}
{}

//-------------- roops_core_objectsInstrumented_MCCTest--------------//
sig roops_core_objectsInstrumented_MCCTest extends java_lang_Object {}
{}




pred roops_core_objectsInstrumented_MCCTestCondition1[
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

pred roops_core_objectsInstrumented_MCCTestCondition29[
  t_38:univ
]{
   not (
     t_38=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition0[
  exit_stmt_reached:univ,
  throw:univ
]{
   (
     throw=null)
   and 
   (
     exit_stmt_reached=false)

}

pred roops_core_objectsInstrumented_MCCTestCondition28[
  t_38:univ
]{
   t_38=true

}

pred roops_core_objectsInstrumented_MCCTestCondition12[
  c:univ
]{
   c=true

}

pred roops_core_objectsInstrumented_MCCTestCondition23[
  t_41:univ
]{
   not (
     t_41=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition13[
  c:univ
]{
   not (
     c=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition25[
  t_40:univ
]{
   not (
     t_40=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition22[
  t_41:univ
]{
   t_41=true

}

pred roops_core_objectsInstrumented_MCCTestCondition24[
  t_40:univ
]{
   t_40=true

}

pred roops_core_objectsInstrumented_MCCTestCondition26[
  t_39:univ
]{
   t_39=true

}

pred postcondition_roops_core_objectsInstrumented_MCCTest_test9_0[
  throw':univ
]{
   roops_core_objectsInstrumented_MCCTest_ensures[throw']
   and 
   (
     not (
       throw'=AssertionFailureLit)
   )

}

pred roops_core_objectsInstrumented_MCCTestCondition19[
]{
   not (
     isEmptyOrNull[ClassFields])

}

pred roops_core_objectsInstrumented_MCCTestCondition5[
  a:univ
]{
   not (
     a=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition2[
  b:univ
]{
   b=true

}

pred roops_core_objectsInstrumented_MCCTestCondition18[
]{
   isEmptyOrNull[ClassFields]

}

pred roops_core_objectsInstrumented_MCCTestCondition3[
  b:univ
]{
   not (
     b=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition4[
  a:univ
]{
   a=true

}

pred roops_core_objectsInstrumented_MCCTestCondition6[
  e:univ
]{
   e=true

}

pred roops_core_objectsInstrumented_MCCTestCondition8[
  d:univ
]{
   d=true

}

pred roops_core_objectsInstrumented_MCCTestCondition9[
  d:univ
]{
   not (
     d=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition7[
  e:univ
]{
   not (
     e=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition20[
  t_36:univ
]{
   t_36=true

}

pred roops_core_objectsInstrumented_MCCTestCondition21[
  t_36:univ
]{
   not (
     t_36=true)

}

pred precondition_roops_core_objectsInstrumented_MCCTest_test9_0[
  throw:univ
]{
   equ[throw,
      null]

}

pred roops_core_objectsInstrumented_MCCTest_ensures[
  throw':univ
]{
   liftExpression[false]
   and 
   equ[throw',
      null]

}

pred roops_core_objectsInstrumented_MCCTestCondition10[
  t_33:univ
]{
   t_33=true

}

pred roops_core_objectsInstrumented_MCCTestCondition27[
  t_39:univ
]{
   not (
     t_39=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition11[
  t_33:univ
]{
   not (
     t_33=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition16[
  t_31:univ
]{
   t_31=true

}

pred roops_core_objectsInstrumented_MCCTestCondition17[
  t_31:univ
]{
   not (
     t_31=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition14[
  t_32:univ
]{
   t_32=true

}

pred roops_core_objectsInstrumented_MCCTestCondition15[
  t_32:univ
]{
   not (
     t_32=true)

}
check check_roops_core_objectsInstrumented_MCCTest_test9_0 for 3 but 4 int, 7 seq



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


pred havocArrayContents[
  array_0: univ,
  domain_0: set univ,
  Object_Array_0: univ -> ( seq univ ),
  Object_Array_1: univ -> ( seq univ )
]{
  TruePred[]
  and 
  havocArrayContentsPost[array_0,
                        domain_0,
                        Object_Array_0,
                        Object_Array_1]
}


pred roops_core_objectsInstrumented_MCCTest_test9_0[
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
  a_0: boolean,
  b_0: boolean,
  c_0: boolean,
  d_0: boolean,
  e_0: boolean,
  roops_core_objectsInstrumented_MCCTest_roops_goal_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_6_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_7_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_4_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_5_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_2_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_2_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_2_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_3_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_3_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_3_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_0_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_0_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_0_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_1_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_1_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_1_2: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_8_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_8_2: ( ClassFields ) -> one ( boolean ),
  t_36_0: boolean,
  t_36_1: boolean,
  t_35_0: boolean,
  t_35_1: boolean,
  t_38_0: boolean,
  t_38_1: boolean,
  exit_stmt_reached_1: boolean,
  t_37_0: boolean,
  t_37_1: boolean,
  t_32_0: boolean,
  t_32_1: boolean,
  t_31_0: boolean,
  t_31_1: boolean,
  t_34_0: boolean,
  t_34_1: boolean,
  t_33_0: boolean,
  t_33_1: boolean,
  t_41_0: boolean,
  t_41_1: boolean,
  t_40_0: boolean,
  t_40_1: boolean,
  t_30_0: boolean,
  t_30_1: boolean,
  t_39_0: boolean,
  t_39_1: boolean,
  l0_exit_stmt_reached_1: boolean
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
  TruePred[]
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  TruePred[]
  and 
  roops_core_objectsInstrumented_MCCTest_fajita_roopsGoal_initialization_0[throw_2,
                                                                          throw_3,
                                                                          throw_4,
                                                                          throw_5,
                                                                          throw_6,
                                                                          throw_7,
                                                                          throw_8,
                                                                          throw_9,
                                                                          throw_10,
                                                                          throw_11,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_6_0,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_6_1,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_7_0,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_7_1,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_4_0,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_4_1,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_5_0,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_5_1,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_2_0,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_2_1,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_3_0,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_3_1,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_0_0,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_0_1,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_1_0,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_1_1,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_8_0,
                                                                          roops_core_objectsInstrumented_MCCTest_roops_goal_8_1,
                                                                          l0_exit_stmt_reached_1]
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_11]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition4[a_0]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_11]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition2[b_0]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_11]
                      and 
                      (
                        t_31_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_11]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_31_0=t_31_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition2[b_0])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_11]
                      and 
                      (
                        t_31_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_11]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_31_0=t_31_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_11]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_31_0=t_31_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition4[a_0])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_11]
              and 
              (
                t_31_1=false)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_11]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_31_0=t_31_1)
            )
          )
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_11]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_31_0=t_31_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_11]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition8[d_0]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_11]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition6[e_0]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_11]
                      and 
                      (
                        t_33_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_11]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_33_0=t_33_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition6[e_0])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_11]
                      and 
                      (
                        t_33_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_11]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_33_0=t_33_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_11]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_33_0=t_33_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition8[d_0])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_11]
              and 
              (
                t_33_1=false)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_11]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_33_0=t_33_1)
            )
          )
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_11]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_33_0=t_33_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_11]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition12[c_0]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_11]
              and 
              (
                t_32_1=true)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_11]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_32_0=t_32_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition12[c_0])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_11]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition10[t_33_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_11]
                      and 
                      (
                        t_32_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_11]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_32_0=t_32_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition10[t_33_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_11]
                      and 
                      (
                        t_32_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_11]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_32_0=t_32_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_11]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_32_0=t_32_1)
            )
          )
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_11]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_32_0=t_32_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_11]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition16[t_31_1]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_11]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition14[t_32_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_11]
                      and 
                      (
                        t_30_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_11]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_30_0=t_30_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition14[t_32_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_11]
                      and 
                      (
                        t_30_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_11]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_30_0=t_30_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_11]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_30_0=t_30_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition16[t_31_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_11]
              and 
              (
                t_30_1=false)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_11]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_30_0=t_30_1)
            )
          )
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_11]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_30_0=t_30_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_11]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_12=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_0_1=roops_core_objectsInstrumented_MCCTest_roops_goal_0_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_0_2=(roops_core_objectsInstrumented_MCCTest_roops_goal_0_1)++((ClassFields)->(t_30_1)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_11]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_0_1=roops_core_objectsInstrumented_MCCTest_roops_goal_0_2)
      and 
      (
        throw_11=throw_12)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_12]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition4[a_0]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_12]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition2[b_0]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_12]
                      and 
                      (
                        t_34_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_12]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_34_0=t_34_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition2[b_0])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_12]
                      and 
                      (
                        t_34_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_12]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_34_0=t_34_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_12]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_34_0=t_34_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition4[a_0])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_12]
              and 
              (
                t_34_1=false)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_12]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_34_0=t_34_1)
            )
          )
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_12]
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
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_12]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_13=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_1_1=roops_core_objectsInstrumented_MCCTest_roops_goal_1_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_1_2=(roops_core_objectsInstrumented_MCCTest_roops_goal_1_1)++((ClassFields)->(t_34_1)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_12]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_1_1=roops_core_objectsInstrumented_MCCTest_roops_goal_1_2)
      and 
      (
        throw_12=throw_13)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_13]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_14=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_2_1=roops_core_objectsInstrumented_MCCTest_roops_goal_2_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_2_2=(roops_core_objectsInstrumented_MCCTest_roops_goal_2_1)++((ClassFields)->(a_0)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_13]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_2_1=roops_core_objectsInstrumented_MCCTest_roops_goal_2_2)
      and 
      (
        throw_13=throw_14)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_14]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_15=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_3_1=roops_core_objectsInstrumented_MCCTest_roops_goal_3_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_3_2=(roops_core_objectsInstrumented_MCCTest_roops_goal_3_1)++((ClassFields)->(b_0)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_14]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_3_1=roops_core_objectsInstrumented_MCCTest_roops_goal_3_2)
      and 
      (
        throw_14=throw_15)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_15]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition8[d_0]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_15]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition6[e_0]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_15]
                      and 
                      (
                        t_36_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_15]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_36_0=t_36_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition6[e_0])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_15]
                      and 
                      (
                        t_36_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_15]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_36_0=t_36_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_15]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_36_0=t_36_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition8[d_0])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_15]
              and 
              (
                t_36_1=false)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_15]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_36_0=t_36_1)
            )
          )
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_15]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_36_0=t_36_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_15]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition12[c_0]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_15]
              and 
              (
                t_35_1=true)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_15]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_35_0=t_35_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition12[c_0])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_15]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition20[t_36_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_15]
                      and 
                      (
                        t_35_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_15]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_35_0=t_35_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition20[t_36_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_15]
                      and 
                      (
                        t_35_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_15]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_35_0=t_35_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_15]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_35_0=t_35_1)
            )
          )
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_15]
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
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_15]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_16=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_4_1=roops_core_objectsInstrumented_MCCTest_roops_goal_4_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_4_2=(roops_core_objectsInstrumented_MCCTest_roops_goal_4_1)++((ClassFields)->(t_35_1)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_15]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_4_1=roops_core_objectsInstrumented_MCCTest_roops_goal_4_2)
      and 
      (
        throw_15=throw_16)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_16]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_17=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_5_1=roops_core_objectsInstrumented_MCCTest_roops_goal_5_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_5_2=(roops_core_objectsInstrumented_MCCTest_roops_goal_5_1)++((ClassFields)->(c_0)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_16]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_5_1=roops_core_objectsInstrumented_MCCTest_roops_goal_5_2)
      and 
      (
        throw_16=throw_17)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_17]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition8[d_0]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_17]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition6[e_0]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_17]
                      and 
                      (
                        t_37_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_17]
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
                      roops_core_objectsInstrumented_MCCTestCondition6[e_0])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_17]
                      and 
                      (
                        t_37_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_17]
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
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_17]
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
              roops_core_objectsInstrumented_MCCTestCondition8[d_0])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_17]
              and 
              (
                t_37_1=false)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_17]
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_17]
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
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_17]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_18=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_6_1=roops_core_objectsInstrumented_MCCTest_roops_goal_6_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_6_2=(roops_core_objectsInstrumented_MCCTest_roops_goal_6_1)++((ClassFields)->(t_37_1)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_17]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_6_1=roops_core_objectsInstrumented_MCCTest_roops_goal_6_2)
      and 
      (
        throw_17=throw_18)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_18]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_19=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_7_1=roops_core_objectsInstrumented_MCCTest_roops_goal_7_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_7_2=(roops_core_objectsInstrumented_MCCTest_roops_goal_7_1)++((ClassFields)->(d_0)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_18]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_7_1=roops_core_objectsInstrumented_MCCTest_roops_goal_7_2)
      and 
      (
        throw_18=throw_19)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_19]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_20=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_8_1=roops_core_objectsInstrumented_MCCTest_roops_goal_8_2)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_8_2=(roops_core_objectsInstrumented_MCCTest_roops_goal_8_1)++((ClassFields)->(e_0)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_19]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_8_1=roops_core_objectsInstrumented_MCCTest_roops_goal_8_2)
      and 
      (
        throw_19=throw_20)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_20]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition4[a_0]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_20]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition2[b_0]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_20]
                      and 
                      (
                        t_39_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_20]
                        )
                      )
                      and 
                      TruePred[]
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
                      roops_core_objectsInstrumented_MCCTestCondition2[b_0])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_20]
                      and 
                      (
                        t_39_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_20]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_39_0=t_39_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_20]
                )
              )
              and 
              TruePred[]
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
              roops_core_objectsInstrumented_MCCTestCondition4[a_0])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_20]
              and 
              (
                t_39_1=false)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_20]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_39_0=t_39_1)
            )
          )
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_20]
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
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_20]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition8[d_0]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_20]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition6[e_0]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_20]
                      and 
                      (
                        t_41_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_20]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_41_0=t_41_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition6[e_0])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_20]
                      and 
                      (
                        t_41_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_20]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_41_0=t_41_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_20]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_41_0=t_41_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition8[d_0])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_20]
              and 
              (
                t_41_1=false)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_20]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_41_0=t_41_1)
            )
          )
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_20]
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
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_20]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition12[c_0]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_20]
              and 
              (
                t_40_1=true)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_20]
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
              roops_core_objectsInstrumented_MCCTestCondition12[c_0])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_20]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition22[t_41_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_20]
                      and 
                      (
                        t_40_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_20]
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
                      roops_core_objectsInstrumented_MCCTestCondition22[t_41_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_20]
                      and 
                      (
                        t_40_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_20]
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
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_20]
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_20]
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
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_20]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition26[t_39_1]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_20]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition24[t_40_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_20]
                      and 
                      (
                        t_38_1=true)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_20]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_38_0=t_38_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition24[t_40_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_20]
                      and 
                      (
                        t_38_1=false)
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_20]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_38_0=t_38_1)
                    )
                  )
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_20]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_38_0=t_38_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition26[t_39_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_20]
              and 
              (
                t_38_1=false)
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_20]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_38_0=t_38_1)
            )
          )
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_20]
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
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_20]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition28[t_38_1]
          and 
          TruePred[]
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition28[t_38_1])
          )
          and 
          TruePred[]
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_20]
        )
      )
      and 
      TruePred[]
    )
  )
  and 
  TruePred[]

}



pred roops_core_objectsInstrumented_MCCTest_fajita_roopsGoal_initialization_0[
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
  roops_core_objectsInstrumented_MCCTest_roops_goal_6_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_6_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_7_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_7_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_4_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_4_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_5_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_5_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_2_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_2_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_3_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_3_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_0_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_0_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_1_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_1_1: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_8_0: ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_8_1: ( ClassFields ) -> one ( boolean ),
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
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_1]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_2=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_0_0=roops_core_objectsInstrumented_MCCTest_roops_goal_0_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_0_1=(roops_core_objectsInstrumented_MCCTest_roops_goal_0_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_0_0=roops_core_objectsInstrumented_MCCTest_roops_goal_0_1)
      and 
      (
        throw_1=throw_2)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_2]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_3=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_1_0=roops_core_objectsInstrumented_MCCTest_roops_goal_1_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_1_1=(roops_core_objectsInstrumented_MCCTest_roops_goal_1_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_2]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_1_0=roops_core_objectsInstrumented_MCCTest_roops_goal_1_1)
      and 
      (
        throw_2=throw_3)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_3]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_4=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_2_0=roops_core_objectsInstrumented_MCCTest_roops_goal_2_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_2_1=(roops_core_objectsInstrumented_MCCTest_roops_goal_2_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_3]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_2_0=roops_core_objectsInstrumented_MCCTest_roops_goal_2_1)
      and 
      (
        throw_3=throw_4)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_4]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_5=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_3_0=roops_core_objectsInstrumented_MCCTest_roops_goal_3_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_3_1=(roops_core_objectsInstrumented_MCCTest_roops_goal_3_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_4]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_3_0=roops_core_objectsInstrumented_MCCTest_roops_goal_3_1)
      and 
      (
        throw_4=throw_5)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_5]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_6=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_4_0=roops_core_objectsInstrumented_MCCTest_roops_goal_4_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_4_1=(roops_core_objectsInstrumented_MCCTest_roops_goal_4_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_5]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_4_0=roops_core_objectsInstrumented_MCCTest_roops_goal_4_1)
      and 
      (
        throw_5=throw_6)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_6]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_7=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_5_0=roops_core_objectsInstrumented_MCCTest_roops_goal_5_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_5_1=(roops_core_objectsInstrumented_MCCTest_roops_goal_5_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_6]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_5_0=roops_core_objectsInstrumented_MCCTest_roops_goal_5_1)
      and 
      (
        throw_6=throw_7)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_7]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_8=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_6_0=roops_core_objectsInstrumented_MCCTest_roops_goal_6_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_6_1=(roops_core_objectsInstrumented_MCCTest_roops_goal_6_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_7]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_6_0=roops_core_objectsInstrumented_MCCTest_roops_goal_6_1)
      and 
      (
        throw_7=throw_8)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_8]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_9=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_7_0=roops_core_objectsInstrumented_MCCTest_roops_goal_7_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_7_1=(roops_core_objectsInstrumented_MCCTest_roops_goal_7_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_8]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_7_0=roops_core_objectsInstrumented_MCCTest_roops_goal_7_1)
      and 
      (
        throw_8=throw_9)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_9]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition18[]
          and 
          (
            throw_10=java_lang_NullPointerExceptionLit)
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_8_0=roops_core_objectsInstrumented_MCCTest_roops_goal_8_1)
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition18[])
          )
          and 
          (
            roops_core_objectsInstrumented_MCCTest_roops_goal_8_1=(roops_core_objectsInstrumented_MCCTest_roops_goal_8_0)++((ClassFields)->(false)))
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_9]
        )
      )
      and 
      TruePred[]
      and 
      (
        roops_core_objectsInstrumented_MCCTest_roops_goal_8_0=roops_core_objectsInstrumented_MCCTest_roops_goal_8_1)
      and 
      (
        throw_9=throw_10)
    )
  )
  and 
  TruePred[]

}

//-------------SMB sigs-------------// 
//-----SMB: local_ordering()-----//
//-----SMB: global_ordering()-----//
fun globalNext[]: java_lang_Object -> lone java_lang_Object {
none -> none
}
fun globalMin[s : set java_lang_Object] : lone java_lang_Object {
s - s.^globalNext[] 
}
//-----SMB: define_min_parent()-----//
//-----SMB: define_freach()-----//
//-----SMB: order_root_nodes()-----//
//-----SMB: root_is_minimum()-----//
//-----SMB: order_same_min_parent()-----//
//-----SMB: order_same_min_parent_type()-----//
//-----SMB: order_diff_min_parent_type()-----//
//-----SMB: avoid_holes()-----//
/*
type ordering:
==============

root nodes ordering:
====================
1) a:boolean
2) b:boolean
3) c:boolean
4) d:boolean
5) e:boolean

recursive field ordering:
=========================

non-recursive field ordering:
=============================
*/
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
  a_0:  boolean,
  b_0:  boolean,
  c_0:  boolean,
  d_0:  boolean,
  e_0:  boolean,
  l1_exit_stmt_reached_1:  boolean,
  l1_l0_exit_stmt_reached_1:  boolean,
  l1_t_30_0:  boolean,
  l1_t_30_1:  boolean,
  l1_t_31_0:  boolean,
  l1_t_31_1:  boolean,
  l1_t_32_0:  boolean,
  l1_t_32_1:  boolean,
  l1_t_33_0:  boolean,
  l1_t_33_1:  boolean,
  l1_t_34_0:  boolean,
  l1_t_34_1:  boolean,
  l1_t_35_0:  boolean,
  l1_t_35_1:  boolean,
  l1_t_36_0:  boolean,
  l1_t_36_1:  boolean,
  l1_t_37_0:  boolean,
  l1_t_37_1:  boolean,
  l1_t_38_0:  boolean,
  l1_t_38_1:  boolean,
  l1_t_39_0:  boolean,
  l1_t_39_1:  boolean,
  l1_t_40_0:  boolean,
  l1_t_40_1:  boolean,
  l1_t_41_0:  boolean,
  l1_t_41_1:  boolean,
  roops_core_objectsInstrumented_MCCTest_roops_goal_0_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_0_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_0_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_1_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_1_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_1_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_2_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_2_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_2_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_3_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_3_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_3_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_4_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_4_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_4_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_5_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_5_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_5_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_6_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_6_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_6_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_7_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_7_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_7_2:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_8_0:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_8_1:  ( ClassFields ) -> one ( boolean ),
  roops_core_objectsInstrumented_MCCTest_roops_goal_8_2:  ( ClassFields ) -> one ( boolean ),
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
  throw_3:  java_lang_Throwable + null,
  throw_4:  java_lang_Throwable + null,
  throw_5:  java_lang_Throwable + null,
  throw_6:  java_lang_Throwable + null,
  throw_7:  java_lang_Throwable + null,
  throw_8:  java_lang_Throwable + null,
  throw_9:  java_lang_Throwable + null
}


fact {
  precondition_roops_core_objectsInstrumented_MCCTest_test9_0[QF.throw_0]
}

fact {
  roops_core_objectsInstrumented_MCCTest_test9_0[QF.throw_1,
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
                                                QF.a_0,
                                                QF.b_0,
                                                QF.c_0,
                                                QF.d_0,
                                                QF.e_0,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_6_0,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_6_1,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_6_2,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_7_0,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_7_1,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_7_2,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_4_0,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_4_1,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_4_2,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_5_0,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_5_1,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_5_2,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_2_0,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_2_1,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_2_2,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_3_0,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_3_1,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_3_2,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_0_0,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_0_1,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_0_2,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_1_0,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_1_1,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_1_2,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_8_0,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_8_1,
                                                QF.roops_core_objectsInstrumented_MCCTest_roops_goal_8_2,
                                                QF.l1_t_36_0,
                                                QF.l1_t_36_1,
                                                QF.l1_t_35_0,
                                                QF.l1_t_35_1,
                                                QF.l1_t_38_0,
                                                QF.l1_t_38_1,
                                                QF.l1_exit_stmt_reached_1,
                                                QF.l1_t_37_0,
                                                QF.l1_t_37_1,
                                                QF.l1_t_32_0,
                                                QF.l1_t_32_1,
                                                QF.l1_t_31_0,
                                                QF.l1_t_31_1,
                                                QF.l1_t_34_0,
                                                QF.l1_t_34_1,
                                                QF.l1_t_33_0,
                                                QF.l1_t_33_1,
                                                QF.l1_t_41_0,
                                                QF.l1_t_41_1,
                                                QF.l1_t_40_0,
                                                QF.l1_t_40_1,
                                                QF.l1_t_30_0,
                                                QF.l1_t_30_1,
                                                QF.l1_t_39_0,
                                                QF.l1_t_39_1,
                                                QF.l1_l0_exit_stmt_reached_1]

}

assert check_roops_core_objectsInstrumented_MCCTest_test9_0{
  postcondition_roops_core_objectsInstrumented_MCCTest_test9_0[QF.throw_20]}
fact {
  QF.BQ__0=true iff ClassFields.(QF.roops_core_objectsInstrumented_MCCTest_roops_goal_0_2)=true
  QF.BQ__1=true iff ClassFields.(QF.roops_core_objectsInstrumented_MCCTest_roops_goal_1_2)=true
  QF.BQ__2=true iff ClassFields.(QF.roops_core_objectsInstrumented_MCCTest_roops_goal_2_2)=true
  QF.BQ__3=true iff ClassFields.(QF.roops_core_objectsInstrumented_MCCTest_roops_goal_3_2)=true
  QF.BQ__4=true iff ClassFields.(QF.roops_core_objectsInstrumented_MCCTest_roops_goal_4_2)=true
  QF.BQ__5=true iff ClassFields.(QF.roops_core_objectsInstrumented_MCCTest_roops_goal_5_2)=true
  QF.BQ__6=true iff ClassFields.(QF.roops_core_objectsInstrumented_MCCTest_roops_goal_6_2)=true
  QF.BQ__7=true iff ClassFields.(QF.roops_core_objectsInstrumented_MCCTest_roops_goal_7_2)=true
  QF.BQ__8=true iff ClassFields.(QF.roops_core_objectsInstrumented_MCCTest_roops_goal_8_2)=true
}
