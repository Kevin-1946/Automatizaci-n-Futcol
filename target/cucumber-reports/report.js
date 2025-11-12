$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/automatizacion_sedes.feature");
formatter.feature({
  "name": "quiero crear una sede",
  "description": "",
  "keyword": "Característica"
});
formatter.scenario({
  "name": "crear una sede",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@autenticacion"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "ingrese la informacion en los campos",
  "rows": [
    {
      "cells": [
        "sede",
        "direccion"
      ]
    },
    {
      "cells": [
        "SENA - Complejo sur",
        "Av. Cra. 30 #17-28, Bogotá"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "SedesStepDefinitionsFutcol.ingreseLaInformacionEnLosCampos(CredencialesSedesFutcol\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se creara una sede visible en otro modulos",
  "keyword": "Entonces "
});
formatter.match({
  "location": "SedesStepDefinitionsFutcol.seCrearaUnaSedeVisibleEnOtroModulos()"
});
formatter.result({
  "status": "passed"
});
});