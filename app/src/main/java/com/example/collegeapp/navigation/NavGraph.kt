package com.example.collegeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.collegeapp.admin.screens.AdminDashboard
import com.example.collegeapp.admin.screens.ManageBanner
import com.example.collegeapp.admin.screens.ManageCollegeInfo
import com.example.collegeapp.admin.screens.ManageFaculty
import com.example.collegeapp.admin.screens.ManageGallery
import com.example.collegeapp.screens.AboutUs
import com.example.collegeapp.screens.BottomNav
import com.example.collegeapp.screens.Faculty
import com.example.collegeapp.screens.Gallery
import com.example.collegeapp.screens.Home
import java.security.AccessController

@Composable
fun NavGraph(navController: NavHostController) {

    val isAdmin = true

    NavHost(
        navController = navController,
        startDestination = if (isAdmin) Routes.AdminDashboard.route else Routes.BottomNav.route
    ){
        composable(Routes.BottomNav.route){
            BottomNav(navController)
        }

        composable(Routes.Home.route){
            Home()
        }

        composable(Routes.AboutUs.route){
            AboutUs()
        }

        composable(Routes.Gallery.route){
            Gallery()
        }

        composable(Routes.Faculty.route){
            Faculty()
        }

        composable(Routes.ManageGallery.route){
            ManageGallery()
        }

        composable(Routes.AdminDashboard.route){
            AdminDashboard(navController)
        }

        composable(Routes.ManageBanner.route){
           ManageBanner(navController)
        }
        composable(Routes.ManageCollegeInfo.route){
            ManageCollegeInfo()
        }
        composable(Routes.ManageFaculty.route){
            ManageFaculty()
        }


    }
}