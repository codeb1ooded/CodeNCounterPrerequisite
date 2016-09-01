<?php
function get_student_list(){
    // Data that normally is pulled from a database
    $student_list = array("students" => array("0" => array("id" => 1, "name" => "Dale Cooper"),
                          array("id" => 2, "name" => "Harry Truman"),
                          array("id" => 3, "name" => "Shelly Johnson"),
                          array("id" => 4, "name" => "Bobby Briggs"),
                          array("id" => 5, "name" => "Donna Hayward")));
    return  $student_list;
}
var_dump($_POST);

// Access data with key 'names' in the body of GET request
echo $_POST['names'];

// We can use database function here to store data into databases
$value = get_student_list();
exit(json_encode($value));
?>
