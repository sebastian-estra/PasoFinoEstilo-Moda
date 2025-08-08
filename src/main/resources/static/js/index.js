 const menuBtn = document.getElementById('menu-btn');
    const sideMenu = document.getElementById('side-menu');
    const closeBtn = document.getElementById('close-menu');

    menuBtn.addEventListener('click', () => {
      sideMenu.classList.add('open');
    });

    closeBtn.addEventListener('click', () => {
      sideMenu.classList.remove('open');
    });
    // Cierra el menú al hacer click en un enlace
    document.querySelectorAll('.menu-movil a').forEach(link => {
      link.addEventListener('click', () => {
        sideMenu.classList.remove('open');
      });
    });