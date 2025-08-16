document.addEventListener('DOMContentLoaded', () => {
  const menuBtn = document.getElementById('menu-btn');
  const sideMenu = document.getElementById('side-menu');
  const closeBtn = document.getElementById('close-menu');

  // Abrir menú lateral
  if (menuBtn && sideMenu) {
    menuBtn.addEventListener('click', () => {
      sideMenu.classList.add('open');
      sideMenu.setAttribute('aria-hidden', 'false');
    });
  }

  // Cerrar menú lateral
  if (closeBtn && sideMenu) {
    closeBtn.addEventListener('click', () => {
      sideMenu.classList.remove('open');
      sideMenu.setAttribute('aria-hidden', 'true');
    });
  }

  // Manejo de enlaces del menú móvil
  document.querySelectorAll('.menu-movil a').forEach(link => {
    link.addEventListener('click', (e) => {
      // Si el enlace es para abrir submenú, NO cerrar el menú principal
      if (link.classList.contains('toggle-submenu')) {
        e.preventDefault(); // Evita salto de página
        e.stopPropagation(); // Evita cierre del menú
        let submenu = link.nextElementSibling;
        submenu.classList.toggle('open');
        return;
      }
      // Si no es submenú, cerrar el menú lateral
      if (sideMenu) sideMenu.classList.remove('open');
    });
  });
});
