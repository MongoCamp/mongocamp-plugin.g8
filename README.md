# Merlin Scala G8 Template

## Usage

Run Template in console
    $ g8 https://github.com/MongoCamp/mongocamp-plugin.g8.git
    
    or
    
    $ sbt new git@github.com:MongoCamp/mongocamp-plugin.g8.git



You'll be prompted for each parameter, with its default
value in square brackets:

    name [example-name]:

## Development
`rm -rf sample-plugin; g8 file://mongocamp-plugin.g8; rm -rf target; rm -rf project; cd ./sample-plugin; sbt clean test dependencyUpdates; pnpm outdated;`
