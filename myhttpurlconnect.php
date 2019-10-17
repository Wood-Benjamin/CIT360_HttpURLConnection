<?php
    if(isset($_GET['firstname'])){
        $firstname = $_GET['firstname'];
        $lastname = $_GET['lastname'];
        echo "Hello $firstname $lastname, thank you for using my HttpURLConnection!";
    }
?>