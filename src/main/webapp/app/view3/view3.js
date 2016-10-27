'use strict';

angular.module('myApp.view3', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider.when('/view3', {
                    templateUrl: 'app/view3/view3.html',
                    controller: 'View3Ctrl'
                });
            }])

        .controller('View3Ctrl', function ($http, $scope) {
            $http.get('api/allusers')
                    .success(function (response) {
                        $scope.users = response;
                    })
                    .error(function (response) {
                        $scope.error = response;
                    });
        });