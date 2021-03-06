var webpack = require('webpack');
var path = require('path');
var buildPath = path.resolve(__dirname, 'build');
var nodeModulesPath = path.resolve(__dirname, 'node_modules');

var config = {
  entry: [path.join(__dirname, '/src/app.jsx')],
  resolve: {
    //When require, do not have to add these extensions to file's name
    extensions: ["", ".js", ".jsx"]
    //node_modules: ["web_modules", "node_modules"]  (Default Settings)
  },
  //Render source-map file for final build
  devtool: 'source-map',

  //output config
  output: {
    libraryTarget: "var",
    library: "Camber",
    path: buildPath,    //Path of output file
    filename: 'webpack-output.js'  //Name of output file
  },
  plugins: [
    //Minify the bundle
    new webpack.optimize.UglifyJsPlugin({
      compress: {
        //supresses warnings, usually from module minification
        warnings: false
      }
    }),
    //Allows error warnings but does not stop compiling. Will remove when eslint is added
    new webpack.NoErrorsPlugin(),
  ],
  module: {
    preLoaders: [
      {
        test: /\.(js|jsx)?$/,
        loader: 'eslint-loader',
        include: [path.resolve(__dirname, "src")],
        exclude: [nodeModulesPath]
      }
    ],
    loaders: [
      {
        test: /\.(js|jsx)?$/, //All .js and .jsx files
        loaders: ['babel'], //react-hot is like browser sync and babel loads jsx and es6-7
        exclude: [nodeModulesPath]
      }
    ]
  },
  //Eslint config
  eslint: {
    configFile: '.eslintrc' //Rules for eslint
  },
};

module.exports = config;
