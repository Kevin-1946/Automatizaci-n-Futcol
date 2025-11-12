$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/creacion_torneo_futcol.feature");
formatter.feature({
  "name": "Quiero crear un torneo",
  "description": "",
  "keyword": "Característica"
});
formatter.scenario({
  "name": "Crear torneo exitosamente",
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
  "name": "rellena el formulario de torneo",
  "rows": [
    {
      "cells": [
        "tipoTorneo",
        "categoria",
        "fechaInicio",
        "fechaFin",
        "modalidad",
        "organizador",
        "precio",
        "sede"
      ]
    },
    {
      "cells": [
        "Liga",
        "Juvenil",
        "20/12/2025",
        "25/01/2026",
        "Todos contra todos",
        "Futcol",
        "100.000",
        "SENA - Complejo sur"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "CreacionTorneoStepDefinitionsFutcol.rellenaElFormularioDeTorneo(CredencialesCrearTorneoFutcol\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "creara un torneo visible en todos los modulos",
  "keyword": "Entonces "
});
formatter.match({
  "location": "CreacionTorneoStepDefinitionsFutcol.crearaUnTorneoVisibleEnTodosLosModulos()"
});
formatter.result({
  "status": "passed"
});
});