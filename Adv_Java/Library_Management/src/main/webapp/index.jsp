<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Library Management System</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body class="bg-slate-900 text-slate-100 font-sans min-h-screen flex flex-col justify-between selection:bg-indigo-500 selection:text-white">

    <div class="h-1.5 w-full bg-gradient-to-r from-teal-400 via-indigo-500 to-purple-600"></div>

    <main class="flex-1 flex items-center justify-center p-6">
        <div class="max-w-md w-full text-center space-y-8 bg-slate-800/50 border border-slate-700/50 p-8 rounded-2xl shadow-2xl backdrop-blur-sm">
            
            <div class="mx-auto w-16 h-16 bg-gradient-to-br from-indigo-500 to-purple-600 rounded-2xl flex items-center justify-center shadow-lg shadow-indigo-500/20">
                <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="w-8 h-8 text-white">
                    <path stroke-linecap="round" stroke-linejoin="round" d="M12 21v-8.25M15.75 21v-8.25M8.25 21v-8.25M3 9l9-6 9 6m-1.5 12V10.332A48.36 48.36 0 0 0 12 9.75c-2.551 0-5.056.2-7.5.582V21M3 21h18M12 6.75h.008v.008H12V6.75Z" />
                </svg>
            </div>

            <div class="space-y-2">
                <h1 class="text-3xl font-extrabold tracking-tight text-white bg-clip-text bg-gradient-to-r from-slate-100 to-slate-300">
                    Digital Library Portal
                </h1>
                <p class="text-slate-400 text-sm">
                    View / Manage Book
                </p>
            </div>

            <div class="pt-4">
                <a href="library/list" class="group relative inline-flex items-center justify-center w-full px-6 py-3.5 text-base font-medium text-white bg-indigo-600 hover:bg-indigo-500 active:bg-indigo-700 rounded-xl transition-all duration-200 shadow-lg shadow-indigo-600/20 hover:shadow-indigo-500/30 hover:-translate-y-0.5">
                    <span>Explore Book Directory</span>
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" class="w-4 h-4 ml-2 transform group-hover:translate-x-1 transition-transform duration-200">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M13.5 4.5L21 12m0 0l-7.5 7.5M21 12H3" />
                    </svg>
                </a>
            </div>
        </div>
    </main>

    <footer class="w-full text-center py-4 text-xs text-slate-600 border-t border-slate-800/50">
 Library Dashboard. All Rights Reserved.  </footer>

</body>
</html>