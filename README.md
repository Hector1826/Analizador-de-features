# Analizador-de-features
  Se encarga de analizar un archivo .feature(lenguaje gherkin) y obtiene la siguiente información:
  * Nombre de la feature
  * Muestra en una tabla:
    * Tag de cada Scenario
    * Nombre del Scenario
    * Factibilidad ( Si tiene tag manual, si tiene el tag backen-smoke, o si de descarto)
    * Jira( en dado caso que aplique)
    * Si es Outline
      * Para los Outline se generan los nombres correspondientes a cada Example.
