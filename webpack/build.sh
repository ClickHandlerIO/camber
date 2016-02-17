#!/usr/bin/env bash

# remove files
echo "Cleaning...";
rm -f ../src/main/java/camber/resources/js/webpack-output.js;
rm -f ../src/main/java/camber/public/webpack-output.js.map;

# run webpack
echo "Building Webpack...";
webpack --config webpack-production.config.js --progress --colors;

# copy files
echo "Copying...";
mv build/webpack-output.js ../src/main/java/camber/resources/js/webpack-output.js;
mv build/webpack-output.js.map ../src/main/java/camber/public/webpack-output.js.map;

# cleanup
rm -rf build;

echo "Success!";