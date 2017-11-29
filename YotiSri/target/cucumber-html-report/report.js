$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Register.feature");
formatter.feature({
  "line": 1,
  "name": "New customer Registeration",
  "description": "",
  "id": "new-customer-registeration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify the new register customer",
  "description": "",
  "id": "new-customer-registeration;verify-the-new-register-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@raghu"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am in Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on SignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see Register page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter E-mail id and continue as guest",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter the Details",
  "rows": [
    {
      "cells": [
        "Password",
        "Test123@"
      ],
      "line": 11
    },
    {
      "cells": [
        "DOB",
        "21/11/1988"
      ],
      "line": 12
    },
    {
      "cells": [
        "Address",
        "40"
      ],
      "line": 13
    },
    {
      "cells": [
        "City",
        "Juneau"
      ],
      "line": 14
    },
    {
      "cells": [
        "Postcode",
        "99801"
      ],
      "line": 15
    },
    {
      "cells": [
        "MobilePhone",
        "123456789"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see user registered",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_in_Homepage()"
});
formatter.result({
  "duration": 9474993958,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.i_click_on_SignIn_link()"
});
formatter.result({
  "duration": 1650501847,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.i_should_see_Register_page()"
});
formatter.result({
  "duration": 149199294,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.i_enter_E_mail_id()"
});
formatter.result({
  "duration": 487164343,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.i_enter_the_Details(DataTable)"
});
formatter.result({
  "duration": 8627993144,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStepDef.i_should_see_user_registered()"
});
formatter.result({
  "duration": 80062254,
  "status": "passed"
});
});