using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace EmployeeApi.Controllers
{
    public class Controller : Controller
    {
        // GET: Controller
        public ActionResult Index()
        {
            return View();
        }

        // GET: Controller/Details/5
        public ActionResult Details(int id)
        {
            return View();
        }

        // GET: Controller/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Controller/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: Controller/Edit/5
        public ActionResult Edit(int id)
        {
            return View();
        }

        // POST: Controller/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: Controller/Delete/5
        public ActionResult Delete(int id)
        {
            return View();
        }

        // POST: Controller/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}
