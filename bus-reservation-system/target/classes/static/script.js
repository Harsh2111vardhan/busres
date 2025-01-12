const fromDropdown = document.getElementById('from');
const toDropdown = document.getElementById('to');

const cities = ['City 1', 'City 2', 'City 3', 'City 4'];

cities.forEach(city => {
    const option = document.createElement('option');
    option.value = city.toLowerCase().replace(' ', '_');
    option.textContent = city;
    fromDropdown.appendChild(option.cloneNode(true));
    toDropdown.appendChild(option);
});
