# A1 - Piraten Karpen

  * Author: Desmond Rasie
  * Email: desmond.rasie@live.ca

## Build and Execution

  * To clean your working directory:
    * `mvn clean`
  * To compile the project:
    * `mvn compile`
  * To run the project in development mode:
    * `mvn -q exec:java` (here, `-q` tells maven to be _quiet_)
  * To package the project as a turn-key artefact:
    * `mvn package`
  * To run the packaged delivery:
    * `java -jar target/piraten-karpen-jar-with-dependencies.jar` 
  * To activate/deactivate tracing functionality, navigate to `src/resources/log4j2.xml` and edit the following:
    * `Root level = <option>` --> Where <option> can either be "OFF" or "TRACE"

Remark: **We are assuming here you are using a _real_ shell (e.g., anything but PowerShell on Windows)**

## Feature Backlog

 * Status: 
   * Pending (P), Started (S), Blocked (B), Done (D)
 * Definition of Done (DoD):
   * The feature must work as intended, while also bringing value to the user.
   * If the feature can be integrated into the existing project and work alongside existing features without causing conflicts, this feature is considered Done.
   

### Backlog 

| MVP? | Id  | Feature  | Status  |  Started  | Delivered |
| :-:  |:-:  |---       | :-:     | :-:       | :-:       |
| x   | F01 | Roll a dice | D | 01/01/23 | 01/25/23 | 
| x   | F02 | Roll all dices  | D | 01/25/23 | 01/26/23 |
| x   | F03 | Return score for a single round  | D | 01/26/23 | 01/26/23 |
| x   | F04 | Player Decision to ReRoll | D | 01/26/23 | 01/26/23 |
| x   | F05 | Return score for a single turn | D | 01/26/23 | 01/26/23 |
| x   | F06 | Return outcome for a single game | D | 01/26/23 | 01/26/23 |
| x   | F07 | Return final Win % per Player | D | 01/26/23 | 01/26/23 |
| o   | F08 | Return score for a single game; including combo scoring | D | 01/26/23 | 01/26/23 |
| o   | F09 | Return score for a single game; maximizing combos strategy | D | 01/27/23 | 01/27/23 |
| o   | F10 | Allow player to select strategy via command line | S | 01/27/23 | 01/27/23 |