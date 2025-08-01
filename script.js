// Color palettes with names and hex values
const colorPalettes = {
    green: [
        { name: "Forest Green", color: "#228B22" },
        { name: "Lime Green", color: "#32CD32" },
        { name: "Mint Green", color: "#98FB98" },
        { name: "Sea Green", color: "#2E8B57" },
        { name: "Spring Green", color: "#00FF7F" },
        { name: "Olive Green", color: "#6B8E23" },
        { name: "Dark Green", color: "#006400" },
        { name: "Light Green", color: "#90EE90" },
        { name: "Yellow Green", color: "#9ACD32" },
        { name: "Emerald Green", color: "#50C878" }
    ],
    purple: [
        { name: "Lavender", color: "#E6E6FA" },
        { name: "Plum", color: "#DDA0DD" },
        { name: "Orchid", color: "#DA70D6" },
        { name: "Violet", color: "#8A2BE2" },
        { name: "Magenta", color: "#FF00FF" },
        { name: "Indigo", color: "#4B0082" },
        { name: "Purple", color: "#800080" },
        { name: "Dark Violet", color: "#9400D3" },
        { name: "Medium Purple", color: "#9370DB" },
        { name: "Royal Purple", color: "#7851A9" }
    ]
};

// App state
let currentScreen = 'welcome';
let currentBackground = '#ffffff';

// DOM elements
const welcomeScreen = document.getElementById('welcome-screen');
const greenScreen = document.getElementById('green-screen');
const purpleScreen = document.getElementById('purple-screen');
const greenBtn = document.getElementById('green-btn');
const purpleBtn = document.getElementById('purple-btn');
const backFromGreen = document.getElementById('back-from-green');
const backFromPurple = document.getElementById('back-from-purple');
const greenShadesContainer = document.getElementById('green-shades');
const purpleShadesContainer = document.getElementById('purple-shades');

// Utility functions
function setBackground(color) {
    currentBackground = color;
    document.body.style.backgroundColor = color;
}

function showScreen(screenName) {
    // Hide all screens
    document.querySelectorAll('.screen').forEach(screen => {
        screen.classList.remove('active');
    });
    
    // Show target screen
    currentScreen = screenName;
    switch(screenName) {
        case 'welcome':
            welcomeScreen.classList.add('active');
            setBackground('#ffffff');
            break;
        case 'green':
            greenScreen.classList.add('active');
            setBackground('#4CAF50'); // Base green
            break;
        case 'purple':
            purpleScreen.classList.add('active');
            setBackground('#9C27B0'); // Base purple
            break;
    }
}

function createShadeButton(shade) {
    const button = document.createElement('button');
    button.className = 'shade-button';
    button.textContent = shade.name;
    button.style.backgroundColor = shade.color;
    
    // Add click event to change background
    button.addEventListener('click', () => {
        setBackground(shade.color);
        
        // Add a subtle animation effect
        button.style.transform = 'scale(0.95)';
        setTimeout(() => {
            button.style.transform = '';
        }, 150);
    });
    
    return button;
}

function populateShades() {
    // Clear existing buttons
    greenShadesContainer.innerHTML = '';
    purpleShadesContainer.innerHTML = '';
    
    // Create green shade buttons
    colorPalettes.green.forEach(shade => {
        const button = createShadeButton(shade);
        greenShadesContainer.appendChild(button);
    });
    
    // Create purple shade buttons
    colorPalettes.purple.forEach(shade => {
        const button = createShadeButton(shade);
        purpleShadesContainer.appendChild(button);
    });
}

// Event listeners
greenBtn.addEventListener('click', () => {
    showScreen('green');
});

purpleBtn.addEventListener('click', () => {
    showScreen('purple');
});

backFromGreen.addEventListener('click', () => {
    showScreen('welcome');
});

backFromPurple.addEventListener('click', () => {
    showScreen('welcome');
});

// Keyboard navigation
document.addEventListener('keydown', (e) => {
    if (e.key === 'Escape' || e.key === 'Backspace') {
        if (currentScreen !== 'welcome') {
            showScreen('welcome');
        }
    }
});

// Touch/click effects for better mobile experience
document.addEventListener('touchstart', (e) => {
    if (e.target.classList.contains('color-button') || 
        e.target.classList.contains('shade-button') || 
        e.target.classList.contains('back-button')) {
        e.target.style.transform = 'scale(0.95)';
    }
});

document.addEventListener('touchend', (e) => {
    if (e.target.classList.contains('color-button') || 
        e.target.classList.contains('shade-button') || 
        e.target.classList.contains('back-button')) {
        setTimeout(() => {
            e.target.style.transform = '';
        }, 150);
    }
});

// Initialize the app
document.addEventListener('DOMContentLoaded', () => {
    populateShades();
    showScreen('welcome');
    
    console.log('🎨 Violet\'s Color App is ready!');
    console.log('Color palettes loaded:', {
        green: colorPalettes.green.length + ' shades',
        purple: colorPalettes.purple.length + ' shades'
    });
});