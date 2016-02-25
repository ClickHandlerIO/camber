#!/usr/bin/env bash

# remove files
echo "Cleaning...";
rm -f ../src/main/java/camber/resources/js/webpack-output.js;

# run webpack
echo "Building Webpack...";
webpack --config webpack-production.config.js --progress --colors;

# copy files
echo "Copying...";
mv build/webpack-output.js ../src/main/java/camber/resources/js/webpack-output.js;

# cleanup
rm -rf build;

echo "Success!";