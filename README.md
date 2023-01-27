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

Remark: **We are assuming here you are using a _real_ shell (e.g., anything but PowerShell on Windows)**

## Feature Backlog

 * Status: 
   * Pending (P), Started (S), Blocked (B), Done (D)
 * Definition of Done (DoD):
   * < Your DoD goes here >

### Backlog 

| MVP? | Id  | Feature  | Status  |  Started  | Delivered |
| :-:  |:-:  |---       | :-:     | :-:       | :-:       |
| x   | F01 | Roll a dice | D | 01/01/23 | 01/25/23 | 
| x   | F02 | Roll eight dices  | D | 01/25/23 | 01/26/23 |
| x   | F03 | Return score for a single round  | D | 01/26/23 | 01/26/23 |
| x   | F04 | Player Decision to ReRoll | S | 01/26/23 |
| x   | F05 | Return score for a single turn | B (F04) |
| x   | F06 | Return outcome for a single game | B(F05) |
| x   | F07 | Return final Win % per Player | B (F06) | 

