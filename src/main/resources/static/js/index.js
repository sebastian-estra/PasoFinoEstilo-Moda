document.addEventListener('DOMContentLoaded', () => {
  const menuBtn = document.getElementById('menu-btn');
  const sideMenu = document.getElementById('side-menu');
  const closeBtn = document.getElementById('close-menu');

  if (menuBtn && sideMenu) {
    menuBtn.addEventListener('click', () => {
      sideMenu.classList.add('open');
      sideMenu.setAttribute('aria-hidden', 'false');
    });
  }

  if (closeBtn && sideMenu) {
    closeBtn.addEventListener('click', () => {
      sideMenu.classList.remove('open');
      sideMenu.setAttribute('aria-hidden', 'true');
    });
  }

  document.querySelectorAll('.menu-movil a').forEach(link => {
    link.addEventListener('click', () => {
      if (sideMenu) sideMenu.classList.remove('open');
    });
  });
});
