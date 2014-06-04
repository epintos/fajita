/* 
 * DynAlloy translator options 
 * --------------------------- 
 * assertionId= check_roops_core_objectsInstrumented_MCCTest_test3_0
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
//-------------- java_lang_Throwable--------------//
abstract sig java_lang_Throwable {}
{}




//-------------- java_lang_Object--------------//
sig java_lang_Object {}
{}




//-------------- roops_core_objectsInstrumented_MCCTest--------------//
sig roops_core_objectsInstrumented_MCCTest extends java_lang_Object {}
{}




pred roops_core_objectsInstrumented_MCCTestCondition3[
  var_12_b:univ
]{
   not (
     var_12_b=true)

}

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

pred roops_core_objectsInstrumented_MCCTestCondition2[
  var_12_b:univ
]{
   var_12_b=true

}

pred roops_core_objectsInstrumented_MCCTestCondition24[
  exit_stmt_reached:univ,
  throw:univ,
  var_16_ws_1:univ
]{
   liftExpression[var_16_ws_1]
   and 
   (
     throw=null)
   and 
   (
     exit_stmt_reached=false)

}

pred roops_core_objectsInstrumented_MCCTestCondition17[
  t_10:univ
]{
   not (
     t_10=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition16[
  t_10:univ
]{
   t_10=true

}

pred postcondition_roops_core_objectsInstrumented_MCCTest_test3_0[
  throw':univ
]{
   roops_core_objectsInstrumented_MCCTest_ensures[throw']
   and 
   (
     not (
       throw'=AssertionFailureLit)
   )

}

pred roops_core_objectsInstrumented_MCCTestCondition11[
  t_12:univ
]{
   not (
     t_12=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition10[
  t_12:univ
]{
   t_12=true

}

pred roops_core_objectsInstrumented_MCCTestCondition13[
  t_11:univ
]{
   not (
     t_11=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition12[
  t_11:univ
]{
   t_11=true

}

pred roops_core_objectsInstrumented_MCCTestCondition15[
  var_15_e:univ
]{
   not (
     var_15_e=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition14[
  var_15_e:univ
]{
   var_15_e=true

}

pred roops_core_objectsInstrumented_MCCTestCondition19[
  t_16:univ
]{
   not (
     t_16=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition18[
  t_16:univ
]{
   t_16=true

}

pred roops_core_objectsInstrumented_MCCTestCondition21[
  t_15:univ
]{
   not (
     t_15=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition23[
  t_14:univ
]{
   not (
     t_14=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition22[
  t_14:univ
]{
   t_14=true

}

pred roops_core_objectsInstrumented_MCCTestCondition6[
  var_14_d:univ
]{
   var_14_d=true

}

pred roops_core_objectsInstrumented_MCCTestCondition20[
  t_15:univ
]{
   t_15=true

}

pred roops_core_objectsInstrumented_MCCTestCondition7[
  var_14_d:univ
]{
   not (
     var_14_d=true)

}

pred precondition_roops_core_objectsInstrumented_MCCTest_test3_0[
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

pred roops_core_objectsInstrumented_MCCTestCondition4[
  var_11_a:univ
]{
   var_11_a=true

}

pred roops_core_objectsInstrumented_MCCTestCondition5[
  var_11_a:univ
]{
   not (
     var_11_a=true)

}

pred roops_core_objectsInstrumented_MCCTestCondition8[
  var_13_c:univ
]{
   var_13_c=true

}

pred roops_core_objectsInstrumented_MCCTestCondition9[
  var_13_c:univ
]{
   not (
     var_13_c=true)

}
check check_roops_core_objectsInstrumented_MCCTest_test3_0 for 3 but 4 int, 7 seq



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


pred roops_core_objectsInstrumented_MCCTest_fajita_roopsGoal_initialization_0[
  throw_1: java_lang_Throwable + null,
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
  TruePred[]
  and 
  TruePred[]

}



pred roops_core_objectsInstrumented_MCCTest_test3_0[
  throw_1: java_lang_Throwable + null,
  throw_2: java_lang_Throwable + null,
  var_16_ws_1_0: boolean,
  var_16_ws_1_1: boolean,
  var_16_ws_1_2: boolean,
  var_16_ws_1_3: boolean,
  var_16_ws_1_4: boolean,
  var_15_e_0: boolean,
  var_15_e_1: boolean,
  var_14_d_0: boolean,
  var_14_d_1: boolean,
  var_11_a_0: boolean,
  var_11_a_1: boolean,
  var_13_c_0: boolean,
  var_13_c_1: boolean,
  t_15_0: boolean,
  t_15_1: boolean,
  t_15_2: boolean,
  t_15_3: boolean,
  t_16_0: boolean,
  t_16_1: boolean,
  t_16_2: boolean,
  t_16_3: boolean,
  t_13_0: boolean,
  t_13_1: boolean,
  t_13_2: boolean,
  t_13_3: boolean,
  t_14_0: boolean,
  t_14_1: boolean,
  t_14_2: boolean,
  t_14_3: boolean,
  t_11_0: boolean,
  t_11_1: boolean,
  t_12_0: boolean,
  t_12_1: boolean,
  t_10_0: boolean,
  t_10_1: boolean,
  exit_stmt_reached_1: boolean,
  t_9_0: boolean,
  t_9_1: boolean,
  var_12_b_0: boolean,
  var_12_b_1: boolean,
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
  roops_core_objectsInstrumented_MCCTest_fajita_roopsGoal_initialization_0[throw_2,
                                                                          l0_exit_stmt_reached_1]
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_2]
      and 
      (
        var_11_a_1=false)
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
        var_11_a_0=var_11_a_1)
    )
  )
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_2]
      and 
      (
        var_12_b_1=false)
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
        var_12_b_0=var_12_b_1)
    )
  )
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_2]
      and 
      (
        var_13_c_1=false)
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
        var_13_c_0=var_13_c_1)
    )
  )
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_2]
      and 
      (
        var_14_d_1=false)
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
        var_14_d_0=var_14_d_1)
    )
  )
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_2]
      and 
      (
        var_15_e_1=false)
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
        var_15_e_0=var_15_e_1)
    )
  )
  and 
  TruePred[]
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_2]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition4[var_11_a_1]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                t_11_1=true)
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
                t_11_0=t_11_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition4[var_11_a_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition2[var_12_b_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        t_11_1=true)
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
                        t_11_0=t_11_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition2[var_12_b_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        t_11_1=false)
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
                        t_11_0=t_11_1)
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
                                                                  throw_2]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_11_0=t_11_1)
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
                                                          throw_2]
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
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_2]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition8[var_13_c_1]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                t_12_1=true)
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
                t_12_0=t_12_1)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition8[var_13_c_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition6[var_14_d_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        t_12_1=true)
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
                        t_12_0=t_12_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition6[var_14_d_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        t_12_1=false)
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
                        t_12_0=t_12_1)
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
                                                                  throw_2]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_12_0=t_12_1)
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
                                                          throw_2]
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
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_2]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition12[t_11_1]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition10[t_12_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        t_10_1=true)
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
                        t_10_0=t_10_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition10[t_12_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        t_10_1=false)
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
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_2]
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
              roops_core_objectsInstrumented_MCCTestCondition12[t_11_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                t_10_1=false)
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_2]
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
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_2]
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition16[t_10_1]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition14[var_15_e_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        t_9_1=true)
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
                        t_9_0=t_9_1)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition14[var_15_e_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        t_9_1=false)
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
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_2]
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
              roops_core_objectsInstrumented_MCCTestCondition16[t_10_1])
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                t_9_1=false)
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_2]
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
    (
      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                      throw_2]
      and 
      (
        var_16_ws_1_1=t_9_1)
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
        var_16_ws_1_0=var_16_ws_1_1)
    )
  )
  and 
  (
    (
      roops_core_objectsInstrumented_MCCTestCondition24[exit_stmt_reached_1,
                                                       throw_2,
                                                       var_16_ws_1_1]
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
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_2]
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition4[var_11_a_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_2]
                  and 
                  (
                    t_15_1=true)
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
                    t_15_0=t_15_1)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition4[var_11_a_1])
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_2]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition2[var_12_b_1]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            t_15_1=true)
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
                            t_15_0=t_15_1)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition2[var_12_b_1])
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            t_15_1=false)
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
                            t_15_0=t_15_1)
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
                                                                      throw_2]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_15_0=t_15_1)
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
                                                              throw_2]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_15_0=t_15_1)
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
              roops_core_objectsInstrumented_MCCTestCondition8[var_13_c_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_2]
                  and 
                  (
                    t_16_1=true)
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
                    t_16_0=t_16_1)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition8[var_13_c_1])
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_2]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition6[var_14_d_1]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            t_16_1=true)
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
                            t_16_0=t_16_1)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition6[var_14_d_1])
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            t_16_1=false)
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
                            t_16_0=t_16_1)
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
                                                                      throw_2]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_16_0=t_16_1)
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
                                                              throw_2]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_16_0=t_16_1)
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
              roops_core_objectsInstrumented_MCCTestCondition20[t_15_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_2]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition18[t_16_1]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            t_14_1=true)
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
                            t_14_0=t_14_1)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition18[t_16_1])
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            t_14_1=false)
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
                            t_14_0=t_14_1)
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
                                                                      throw_2]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_14_0=t_14_1)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition20[t_15_1])
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_2]
                  and 
                  (
                    t_14_1=false)
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
                    t_14_0=t_14_1)
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
                                                              throw_2]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_14_0=t_14_1)
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
              roops_core_objectsInstrumented_MCCTestCondition22[t_14_1]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_2]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition14[var_15_e_1]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            t_13_1=true)
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
                            t_13_0=t_13_1)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition14[var_15_e_1])
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            t_13_1=false)
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
                            t_13_0=t_13_1)
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
                                                                      throw_2]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_13_0=t_13_1)
                )
              )
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition22[t_14_1])
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_2]
                  and 
                  (
                    t_13_1=false)
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
                    t_13_0=t_13_1)
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
                                                              throw_2]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_13_0=t_13_1)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                          throw_2]
          and 
          (
            var_16_ws_1_2=t_13_1)
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
            var_16_ws_1_1=var_16_ws_1_2)
        )
      )
      and 
      (
        (
          roops_core_objectsInstrumented_MCCTestCondition24[exit_stmt_reached_1,
                                                           throw_2,
                                                           var_16_ws_1_2]
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
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition4[var_11_a_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        t_15_2=true)
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
                        t_15_1=t_15_2)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition4[var_11_a_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition2[var_12_b_1]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                              throw_2]
                              and 
                              (
                                t_15_2=true)
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
                                t_15_1=t_15_2)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_MCCTestCondition2[var_12_b_1])
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                              throw_2]
                              and 
                              (
                                t_15_2=false)
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
                                t_15_1=t_15_2)
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
                                                                          throw_2]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_15_1=t_15_2)
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
                                                                  throw_2]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_15_1=t_15_2)
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
                  roops_core_objectsInstrumented_MCCTestCondition8[var_13_c_1]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        t_16_2=true)
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
                        t_16_1=t_16_2)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition8[var_13_c_1])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition6[var_14_d_1]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                              throw_2]
                              and 
                              (
                                t_16_2=true)
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
                                t_16_1=t_16_2)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_MCCTestCondition6[var_14_d_1])
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                              throw_2]
                              and 
                              (
                                t_16_2=false)
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
                                t_16_1=t_16_2)
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
                                                                          throw_2]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_16_1=t_16_2)
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
                                                                  throw_2]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_16_1=t_16_2)
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
                  roops_core_objectsInstrumented_MCCTestCondition20[t_15_2]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition18[t_16_2]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                              throw_2]
                              and 
                              (
                                t_14_2=true)
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
                                t_14_1=t_14_2)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_MCCTestCondition18[t_16_2])
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                              throw_2]
                              and 
                              (
                                t_14_2=false)
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
                                t_14_1=t_14_2)
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
                                                                          throw_2]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_14_1=t_14_2)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition20[t_15_2])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        t_14_2=false)
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
                        t_14_1=t_14_2)
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
                                                                  throw_2]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_14_1=t_14_2)
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
                  roops_core_objectsInstrumented_MCCTestCondition22[t_14_2]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition14[var_15_e_1]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                              throw_2]
                              and 
                              (
                                t_13_2=true)
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
                                t_13_1=t_13_2)
                            )
                          )
                        )
                        or 
                        (
                          (
                            not (
                              roops_core_objectsInstrumented_MCCTestCondition14[var_15_e_1])
                          )
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                              throw_2]
                              and 
                              (
                                t_13_2=false)
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
                                t_13_1=t_13_2)
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
                                                                          throw_2]
                        )
                      )
                      and 
                      TruePred[]
                      and 
                      (
                        t_13_1=t_13_2)
                    )
                  )
                )
                or 
                (
                  (
                    not (
                      roops_core_objectsInstrumented_MCCTestCondition22[t_14_2])
                  )
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                      throw_2]
                      and 
                      (
                        t_13_2=false)
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
                        t_13_1=t_13_2)
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
                                                                  throw_2]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_13_1=t_13_2)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                              throw_2]
              and 
              (
                var_16_ws_1_3=t_13_2)
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
                var_16_ws_1_2=var_16_ws_1_3)
            )
          )
          and 
          (
            (
              roops_core_objectsInstrumented_MCCTestCondition24[exit_stmt_reached_1,
                                                               throw_2,
                                                               var_16_ws_1_3]
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
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_2]
                  and 
                  (
                    (
                      roops_core_objectsInstrumented_MCCTestCondition4[var_11_a_1]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            t_15_3=true)
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
                            t_15_2=t_15_3)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition4[var_11_a_1])
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_MCCTestCondition2[var_12_b_1]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                                  throw_2]
                                  and 
                                  (
                                    t_15_3=true)
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
                                    t_15_2=t_15_3)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_MCCTestCondition2[var_12_b_1])
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                                  throw_2]
                                  and 
                                  (
                                    t_15_3=false)
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
                                    t_15_2=t_15_3)
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
                                                                              throw_2]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_15_2=t_15_3)
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
                                                                      throw_2]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_15_2=t_15_3)
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
                      roops_core_objectsInstrumented_MCCTestCondition8[var_13_c_1]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            t_16_3=true)
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
                            t_16_2=t_16_3)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition8[var_13_c_1])
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_MCCTestCondition6[var_14_d_1]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                                  throw_2]
                                  and 
                                  (
                                    t_16_3=true)
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
                                    t_16_2=t_16_3)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_MCCTestCondition6[var_14_d_1])
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                                  throw_2]
                                  and 
                                  (
                                    t_16_3=false)
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
                                    t_16_2=t_16_3)
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
                                                                              throw_2]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_16_2=t_16_3)
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
                                                                      throw_2]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_16_2=t_16_3)
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
                      roops_core_objectsInstrumented_MCCTestCondition20[t_15_3]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_MCCTestCondition18[t_16_3]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                                  throw_2]
                                  and 
                                  (
                                    t_14_3=true)
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
                                    t_14_2=t_14_3)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_MCCTestCondition18[t_16_3])
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                                  throw_2]
                                  and 
                                  (
                                    t_14_3=false)
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
                                    t_14_2=t_14_3)
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
                                                                              throw_2]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_14_2=t_14_3)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition20[t_15_3])
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            t_14_3=false)
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
                            t_14_2=t_14_3)
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
                                                                      throw_2]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_14_2=t_14_3)
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
                      roops_core_objectsInstrumented_MCCTestCondition22[t_14_3]
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            (
                              roops_core_objectsInstrumented_MCCTestCondition14[var_15_e_1]
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                                  throw_2]
                                  and 
                                  (
                                    t_13_3=true)
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
                                    t_13_2=t_13_3)
                                )
                              )
                            )
                            or 
                            (
                              (
                                not (
                                  roops_core_objectsInstrumented_MCCTestCondition14[var_15_e_1])
                              )
                              and 
                              (
                                (
                                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                                  throw_2]
                                  and 
                                  (
                                    t_13_3=false)
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
                                    t_13_2=t_13_3)
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
                                                                              throw_2]
                            )
                          )
                          and 
                          TruePred[]
                          and 
                          (
                            t_13_2=t_13_3)
                        )
                      )
                    )
                    or 
                    (
                      (
                        not (
                          roops_core_objectsInstrumented_MCCTestCondition22[t_14_3])
                      )
                      and 
                      (
                        (
                          roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                          throw_2]
                          and 
                          (
                            t_13_3=false)
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
                            t_13_2=t_13_3)
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
                                                                      throw_2]
                    )
                  )
                  and 
                  TruePred[]
                  and 
                  (
                    t_13_2=t_13_3)
                )
              )
              and 
              (
                (
                  roops_core_objectsInstrumented_MCCTestCondition0[exit_stmt_reached_1,
                                                                  throw_2]
                  and 
                  (
                    var_16_ws_1_4=t_13_3)
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
                    var_16_ws_1_3=var_16_ws_1_4)
                )
              )
              and 
              TruePred[]
            )
            or 
            (
              (
                not (
                  roops_core_objectsInstrumented_MCCTestCondition24[exit_stmt_reached_1,
                                                                   throw_2,
                                                                   var_16_ws_1_3]
                )
              )
              and 
              TruePred[]
              and 
              (
                t_14_2=t_14_3)
              and 
              (
                t_15_2=t_15_3)
              and 
              (
                t_13_2=t_13_3)
              and 
              (
                t_16_2=t_16_3)
              and 
              (
                var_16_ws_1_3=var_16_ws_1_4)
            )
          )
        )
        or 
        (
          (
            not (
              roops_core_objectsInstrumented_MCCTestCondition24[exit_stmt_reached_1,
                                                               throw_2,
                                                               var_16_ws_1_2]
            )
          )
          and 
          TruePred[]
          and 
          (
            t_14_1=t_14_3)
          and 
          (
            t_15_1=t_15_3)
          and 
          (
            t_13_1=t_13_3)
          and 
          (
            t_16_1=t_16_3)
          and 
          (
            var_16_ws_1_2=var_16_ws_1_4)
        )
      )
    )
    or 
    (
      (
        not (
          roops_core_objectsInstrumented_MCCTestCondition24[exit_stmt_reached_1,
                                                           throw_2,
                                                           var_16_ws_1_1]
        )
      )
      and 
      TruePred[]
      and 
      (
        t_14_0=t_14_3)
      and 
      (
        t_15_0=t_15_3)
      and 
      (
        t_13_0=t_13_3)
      and 
      (
        t_16_0=t_16_3)
      and 
      (
        var_16_ws_1_1=var_16_ws_1_4)
    )
  )
  and 
  (
    not (
      roops_core_objectsInstrumented_MCCTestCondition24[exit_stmt_reached_1,
                                                       throw_2,
                                                       var_16_ws_1_4]
    )
  )
  and 
  TruePred[]

}

one sig QF {
  l1_exit_stmt_reached_1:  boolean,
  l1_l0_exit_stmt_reached_1:  boolean,
  l1_t_10_0:  boolean,
  l1_t_10_1:  boolean,
  l1_t_11_0:  boolean,
  l1_t_11_1:  boolean,
  l1_t_12_0:  boolean,
  l1_t_12_1:  boolean,
  l1_t_13_0:  boolean,
  l1_t_13_1:  boolean,
  l1_t_13_2:  boolean,
  l1_t_13_3:  boolean,
  l1_t_14_0:  boolean,
  l1_t_14_1:  boolean,
  l1_t_14_2:  boolean,
  l1_t_14_3:  boolean,
  l1_t_15_0:  boolean,
  l1_t_15_1:  boolean,
  l1_t_15_2:  boolean,
  l1_t_15_3:  boolean,
  l1_t_16_0:  boolean,
  l1_t_16_1:  boolean,
  l1_t_16_2:  boolean,
  l1_t_16_3:  boolean,
  l1_t_9_0:  boolean,
  l1_t_9_1:  boolean,
  l1_var_11_a_0:  boolean,
  l1_var_11_a_1:  boolean,
  l1_var_12_b_0:  boolean,
  l1_var_12_b_1:  boolean,
  l1_var_13_c_0:  boolean,
  l1_var_13_c_1:  boolean,
  l1_var_14_d_0:  boolean,
  l1_var_14_d_1:  boolean,
  l1_var_15_e_0:  boolean,
  l1_var_15_e_1:  boolean,
  l1_var_16_ws_1_0:  boolean,
  l1_var_16_ws_1_1:  boolean,
  l1_var_16_ws_1_2:  boolean,
  l1_var_16_ws_1_3:  boolean,
  l1_var_16_ws_1_4:  boolean,
  throw_0:  java_lang_Throwable + null,
  throw_1:  java_lang_Throwable + null,
  throw_2:  java_lang_Throwable + null
}


fact {
  precondition_roops_core_objectsInstrumented_MCCTest_test3_0[QF.throw_0]
}

fact {
  roops_core_objectsInstrumented_MCCTest_test3_0[QF.throw_1,
                                                QF.throw_2,
                                                QF.l1_var_16_ws_1_0,
                                                QF.l1_var_16_ws_1_1,
                                                QF.l1_var_16_ws_1_2,
                                                QF.l1_var_16_ws_1_3,
                                                QF.l1_var_16_ws_1_4,
                                                QF.l1_var_15_e_0,
                                                QF.l1_var_15_e_1,
                                                QF.l1_var_14_d_0,
                                                QF.l1_var_14_d_1,
                                                QF.l1_var_11_a_0,
                                                QF.l1_var_11_a_1,
                                                QF.l1_var_13_c_0,
                                                QF.l1_var_13_c_1,
                                                QF.l1_t_15_0,
                                                QF.l1_t_15_1,
                                                QF.l1_t_15_2,
                                                QF.l1_t_15_3,
                                                QF.l1_t_16_0,
                                                QF.l1_t_16_1,
                                                QF.l1_t_16_2,
                                                QF.l1_t_16_3,
                                                QF.l1_t_13_0,
                                                QF.l1_t_13_1,
                                                QF.l1_t_13_2,
                                                QF.l1_t_13_3,
                                                QF.l1_t_14_0,
                                                QF.l1_t_14_1,
                                                QF.l1_t_14_2,
                                                QF.l1_t_14_3,
                                                QF.l1_t_11_0,
                                                QF.l1_t_11_1,
                                                QF.l1_t_12_0,
                                                QF.l1_t_12_1,
                                                QF.l1_t_10_0,
                                                QF.l1_t_10_1,
                                                QF.l1_exit_stmt_reached_1,
                                                QF.l1_t_9_0,
                                                QF.l1_t_9_1,
                                                QF.l1_var_12_b_0,
                                                QF.l1_var_12_b_1,
                                                QF.l1_l0_exit_stmt_reached_1]

}

assert check_roops_core_objectsInstrumented_MCCTest_test3_0{
  postcondition_roops_core_objectsInstrumented_MCCTest_test3_0[QF.throw_2]}
fact {
}
