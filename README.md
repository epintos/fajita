Fajita
========

Final project for Software Engineering at ITBA. Year 2013-2014.

Fajita is a SAT-based automatic tool for test input generation. Fajita is specially aimed at the generation of complex linked data structures satisfying challenging invariants. 

Fajita depends on the following projects:

* AlloyCli
* DynAlloy4
* JDynAlloy
* Taco

Instructions
=============

To import the projects to `Eclipse` and include the respectives projects dependecies, some configuration files were included in the source code.

##### Parameters

* `-cp`, `--classpath` `<arg>`                    classpath storing source code to be verified
 
* `-c`, `--class_to_check` `<arg>`                fully qualified class name to verify
 
* `-m`, `--method_to_check` `<arg> `              method name to be verified
 
* `-tf`, `--properties_template_file` `<arg>`     properties template file with all required Taco settings
 
* `-rp`, `--result_path` `<arg>`                  result path for Fajita output
 
* `-r`, `--coverage_criteria` `<arg>`             selects coverage (goal, class, branch or dual). Dual does an iteration of class coverage to quickly cover easy goals
                                                  and continues with the missing goals for branch coverage (default is
                                                  goal coverage)

* `-u`, `--loop_unroll` `<arg>`                   number of unrolls (default is 3)
 
* `-s`, `--object_scope` `<arg>`                  size of the object pool to be used (default is 3)
 
* `-iu`, `--incremental_unroll`                   turns the unroll-scope exploration heuristic on
 
* `-ig`, `--ignore_goals` `<arg>`                 Considers the given goals as covered (separated by commas and no
                                                  whitespaces). If non-empty while using dual coverage triggers an
                                                  execution with branch coverage, otherwise it uses class coverage.

* `-rc`, `--relevant_classes` `<arg>`             a comma separated list of the classes required to compile to run
                                                  the one being checked

* `-to`, `--timeout_secs` `<arg>`                 seconds to wait for a particular sat solution to be obtained

* `-o`, `--append_bounds_if_available` `<arg>`    if a tight bound is in the repository, add it to the Alloy
                                                  model (default is true)

* `-a`, `--only_alloy`                            don't solve; just translate to Alloy (default is false)
 
* `-gu`, `--generate_junit` `<arg>`               generate a junit file with the set of tests found
 
* `-b`, `--int_bitwidth` `<arg>`                  alloy integer bitwidth (default is 4)
 
* `-cs`, `--choose_solver` `<arg>`                sets the SAT solver (default is minisat, we support sat4j)
 
* `-cf`, `--config_file` `<arg>`                  config file with all required Fajita settings
 
* `-v`, `--version`                               show version information
 
* `-h`, `--help`                                  display this text

* tip: classpath and (config_file or (class_to_check and method_to_check)) are mandatory arguments.

* Examples:
	* Branch Coverage: -cp roops -cf config/roops_core_objects_LinkedList/addLastTest.fajita.config -tf config/taco.properties.template -rp result -gu true -cs sat4j
	* All Uses Coverage: -cp roops -cf config/roops_core_objects_OurTests/allDef.fajita.config -tf config/taco.properties.template -rp result -gu true -cs sat4j -r uses -m test2
	* MCC Coverage: -cp roops -cf config/roops_core_objects_OurTests/MCC.fajita.config -tf config/taco.properties.template -rp result -gu true -cs sat4j -r mcc -m test1
