((root) ->

  root.App = {} unless root.App?

  require.config(
    paths:
      'jquery': '/vendors/jquery/dist/jquery',
      'handlebars': '/vendors/handlebars/handlebars.amd',
      'underscore': '/vendors/underscore/underscore',
      'bootstrap': '/vendors/bootstrap/dist/js/bootstrap',
      'text': '/vendors/requirejs-text/text'

    shim:
      'handlebars':
        'deps': ['jquery', 'text']

      'bootstrap':
        'deps': ['jquery']

    waitSeconds: 20
  )

  require ['jquery', 'bootstrap'], ($) ->

    $(document).ready ->
      alert "Login"

)(this)