const fromDropdown = document.getElementById('from');
const toDropdown = document.getElementById('to');

const cities = ['Chennai', 'Delhi', 'Mumbai', 'Banglore'];

cities.forEach(city => {
    const option = document.createElement('option');
    option.value = city.toLowerCase().replace(' ', '_');
    option.textContent = city;
    fromDropdown.appendChild(option.cloneNode(true));
    toDropdown.appendChild(option);
});
