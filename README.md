scamandrill
===========
* Paper Culture Notes

  In order to publish this package, you must have a github personal access token established. 
  1. [![Create a Personal Access Token](https://docs.github.com/en/github/authenticating-to-github/creating-a-personal-access-token)] on github. Select the scope `write:packages`.
  2. Open your `~/.gitconfig` If you don't have one, create it. Add the following section to it: 
     ```
     [github]
        token = YOUR_TOKEN_FROM_STEP_1
    ```
  3. To publish this package, use the following sbt command: 
  ```
     > publish
  ```


[![Build Status](https://img.shields.io/travis/scamandrill/scamandrill.svg)](https://travis-ci.org/scamandrill/scamandrill)
[![codecov](https://img.shields.io/codecov/c/github/scamandrill/scamandrill.svg)](https://codecov.io/gh/scamandrill/scamandrill)

Originally forked from https://github.com/dzsessona/scamandrill

Please view the documentation [here](http://scamandrill.github.io/scamandrill/)
