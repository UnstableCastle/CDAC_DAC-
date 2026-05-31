<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List of Books Available</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body class="bg-slate-900 text-slate-100 font-sans min-h-screen flex flex-col justify-between selection:bg-indigo-500 selection:text-white">

    <div class="h-1.5 w-full bg-gradient-to-r from-teal-400 via-indigo-500 to-purple-600"></div>

    <main class="flex-1 w-full max-w-5xl mx-auto p-4 sm:p-6 lg:p-8 space-y-6">
        
        <div class="flex flex-col sm:flex-row sm:items-center sm:justify-between gap-4 p-6 bg-slate-800/40 border border-slate-700/50 rounded-2xl shadow-xl backdrop-blur-sm">
            <div>
                <h1 class="text-2xl font-bold tracking-tight text-white flex items-center gap-2">
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.8" stroke="currentColor" class="w-6 h-6 text-indigo-400">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M3.75 12h16.5m-16.5 3.75h16.5M3.75 19.5h16.5M5.625 4.5h12.75c.621 0 1.125.504 1.125 1.125v1.875c0 .621-.504 1.125-1.125 1.125H5.625A1.125 1.125 0 0 1 4.5 7.5V5.625c0-.621.504-1.125 1.125-1.125Z" />
                    </svg>
                    Books Available
                </h1>
                <p class="text-slate-400 text-sm mt-0.5">Browse records or introduce new listings to the master directory.</p>
            </div>
            
            <button onclick="window.location.href = 'showForm'; return false;" class="inline-flex items-center justify-center px-4 py-2.5 bg-indigo-600 hover:bg-indigo-500 text-white font-medium text-sm rounded-xl shadow-lg transition-all cursor-pointer">
                <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="2.5" stroke="currentColor" class="w-4 h-4 mr-1.5">
                    <path stroke-linecap="round" stroke-linejoin="round" d="M12 4.5v15m7.5-7.5h-15" />
                </svg>
                Add New Book
            </button>
        </div>

        <div class="bg-slate-800/30 border border-slate-700/50 rounded-2xl overflow-hidden shadow-2xl backdrop-blur-sm">
            <div class="overflow-x-auto">
                <table class="w-full text-left border-collapse">
                    <thead>
                        <tr class="bg-slate-800/80 border-b border-slate-700/70 text-slate-400 text-xs font-bold uppercase tracking-wider">
                            <th class="px-6 py-4">Name</th>
                            <th class="px-6 py-4">Author Name</th>
                            <th class="px-6 py-4">Price</th>
                            <th class="px-6 py-4 text-right">Actions</th>
                        </tr>
                    </thead>
                    <tbody class="divide-y divide-slate-800 text-sm text-slate-300">
                        <c:forEach var="tempLibrary" items="${thelibrary}">
                            <c:url var="updateLink" value="/library/showFormForUpdate">
                                <c:param name="libraryId" value="${tempLibrary.id}" />
                            </c:url>
                            <c:url var="deleteLink" value="/library/delete">
                                <c:param name="libraryId" value="${tempLibrary.id}" />
                            </c:url>
                            
                            <tr class="hover:bg-slate-800/40 transition-colors">
                                <td class="px-6 py-4 font-semibold text-white">${tempLibrary.name}</td> 
                                <td class="px-6 py-4 text-slate-400">${tempLibrary.authorName}</td>
                                <td class="px-6 py-4 font-mono font-medium text-teal-400">${tempLibrary.price}</td>
                                <td class="px-6 py-4 text-right space-x-3">
                                    <a href="${updateLink}" class="inline-flex text-indigo-400 hover:text-indigo-300 font-semibold text-xs bg-indigo-500/10 hover:bg-indigo-500/20 px-2.5 py-1 rounded-md transition-colors">
                                        Update
                                    </a>
                                    <a href="${deleteLink}" onclick="if (!(confirm('Are you sure you want to delete this book?'))) return false" class="inline-flex text-rose-400 hover:text-rose-300 font-semibold text-xs bg-rose-500/10 hover:bg-rose-500/20 px-2.5 py-1 rounded-md transition-colors">
                                        Delete
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                        
                        <c:if test="${empty thelibrary}">
                            <tr>
                                <td colspan="4" class="px-6 py-10 text-center text-slate-500 text-sm italic">
                                    No books found in the registry catalog. Click "Add New Book" to populate.
                                </td>
                            </tr>
                        </c:if>
                    </tbody>
                </table>
            </div>
        </div>
    </main>

    <footer class="w-full text-center py-4 text-xs text-slate-600 border-t border-slate-800/50">
      Library Dashboard. All Rights Reserved.
    </footer>

</body>
</html>