package com.example.navygayion13;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.HashMap;

public class Elements {

    /**
     * The list of all of the elements
     */
    private static final Element[] ELEMENTS = new Element[] {
            new Element(
                    1,
                    "H",
                    1,
                    1,
                    's',
                    1.00794,
                    0.00008988,
                    14.01,
                    20.28,
                    14.304,
                    2.2,
                    1400.0,
                    0,
                    new Element.Configuration(null, new Element.Orbital[] {
                            new Element.Orbital(1, 's', 1)
                    }),
                    new Integer[] {1},
                    false
            ),
            new Element(
                    2,
                    "He",
                    18,
                    1,
                    's',
                    4.002602,
                    0.0001785,
                    0.95,
                    4.22,
                    5.193,
                    null,
                    0.008,
                    1,
                    new Element.Configuration(null, new Element.Orbital[] {
                            new Element.Orbital(1, 's', 2)
                    }),
                    new Integer[] {2},
                    false
            ),
            new Element(
                    3,
                    "Li",
                    1,
                    2,
                    's',
                    6.941,
                    0.534,
                    453.69,
                    1615.0,
                    3.582,
                    0.98,
                    20.0,
                    2,
                    new Element.Configuration(null, new Element.Orbital[] {
                            new Element.Orbital(1, 's', 2),
                            new Element.Orbital(2, 's', 1)
                    }),
                    new Integer[] {2, 1},
                    false
            ),
            new Element(
                    4,
                    "Be",
                    2,
                    2,
                    's',
                    9.012182,
                    1.85,
                    1560.0,
                    2742.0,
                    1.825,
                    1.57,
                    2.8,
                    3,
                    new Element.Configuration(null, new Element.Orbital[] {
                            new Element.Orbital(1, 's', 2),
                            new Element.Orbital(2, 's', 2)
                    }),
                    new Integer[] {2, 2},
                    false
            ),
            new Element(
                    5,
                    "B",
                    13,
                    2,
                    'p',
                    10.811,
                    2.34,
                    2349.0,
                    4200.0,
                    1.026,
                    2.04,
                    10.0,
                    4,
                    new Element.Configuration(null, new Element.Orbital[] {
                            new Element.Orbital(1, 's', 2),
                            new Element.Orbital(2, 's', 2),
                            new Element.Orbital(2, 'p', 1)
                    }),
                    new Integer[] {2, 3},
                    false
            ),
            new Element(
                    6,
                    "C",
                    14,
                    2,
                    'p',
                    12.0107,
                    2.267,
                    3823.0,
                    4300.0,
                    0.709,
                    2.55,
                    200.0,
                    0,
                    new Element.Configuration(null, new Element.Orbital[] {
                            new Element.Orbital(1, 's', 2),
                            new Element.Orbital(2, 's', 2),
                            new Element.Orbital(2, 'p', 2)
                    }),
                    new Integer[] {2, 4},
                    false
            ),
            new Element(
                    7,
                    "N",
                    15,
                    2,
                    'p',
                    14.0067,
                    0.0012506,
                    63.15,
                    77.36,
                    1.04,
                    3.04,
                    19.0,
                    0,
                    new Element.Configuration(null, new Element.Orbital[] {
                            new Element.Orbital(1, 's', 2),
                            new Element.Orbital(2, 's', 2),
                            new Element.Orbital(2, 'p', 3)
                    }),
                    new Integer[] {2, 5},
                    false
            ),
            new Element(
                    8,
                    "O",
                    16,
                    2,
                    'p',
                    15.9994,
                    0.001429,
                    54.36,
                    90.2,
                    0.918,
                    3.44,
                    461000.0,
                    0,
                    new Element.Configuration(null, new Element.Orbital[] {
                            new Element.Orbital(1, 's', 2),
                            new Element.Orbital(2, 's', 2),
                            new Element.Orbital(2, 'p', 4)
                    }),
                    new Integer[] {2, 6},
                    false
            ),
            new Element(
                    9,
                    "F",
                    17,
                    2,
                    'p',
                    18.9984032,
                    0.001696,
                    53.53,
                    85.03,
                    0.824,
                    3.98,
                    585.0,
                    5,
                    new Element.Configuration(null, new Element.Orbital[] {
                            new Element.Orbital(1, 's', 2),
                            new Element.Orbital(2, 's', 2),
                            new Element.Orbital(2, 'p', 5)
                    }),
                    new Integer[] {2, 7},
                    false
            ),
            new Element(
                    10,
                    "Ne",
                    18,
                    2,
                    'p',
                    20.1797,
                    0.0008999,
                    24.56,
                    27.07,
                    1.03,
                    null,
                    0.005,
                    1,
                    new Element.Configuration(null, new Element.Orbital[] {
                            new Element.Orbital(1, 's', 2),
                            new Element.Orbital(2, 's', 2),
                            new Element.Orbital(2, 'p', 6)
                    }),
                    new Integer[] {2, 8},
                    false
            ),
            new Element(
                    11,
                    "Na",
                    1,
                    3,
                    's',
                    22.98976928,
                    0.971,
                    370.87,
                    1156.0,
                    1.228,
                    0.93,
                    23600.0,
                    2,
                    new Element.Configuration("Ne", new Element.Orbital[] {
                            new Element.Orbital(3, 's', 1)
                    }),
                    new Integer[] {2, 8, 1},
                    false
            ),
            new Element(
                    12,
                    "Mg",
                    2,
                    3,
                    's',
                    24.305,
                    1.738,
                    923.0,
                    1363.0,
                    1.023,
                    1.31,
                    23300.0,
                    3,
                    new Element.Configuration("Ne", new Element.Orbital[] {
                            new Element.Orbital(3, 's', 2)
                    }),
                    new Integer[] {2, 8, 2},
                    false
            ),
            new Element(
                    13,
                    "Al",
                    13,
                    3,
                    'p',
                    26.9815386,
                    2.698,
                    933.47,
                    2792.0,
                    0.897,
                    1.61,
                    82300.0,
                    6,
                    new Element.Configuration("Ne", new Element.Orbital[] {
                            new Element.Orbital(3, 's', 2),
                            new Element.Orbital(3, 'p', 1)
                    }),
                    new Integer[] {2, 8, 3},
                    false
            ),
            new Element(
                    14,
                    "Si",
                    14,
                    3,
                    'p',
                    28.0855,
                    2.3296,
                    1687.0,
                    3538.0,
                    0.705,
                    1.9,
                    282000.0,
                    4,
                    new Element.Configuration("Ne", new Element.Orbital[] {
                            new Element.Orbital(3, 's', 2),
                            new Element.Orbital(3, 'p', 2)
                    }),
                    new Integer[] {2, 8, 4},
                    false
            ),
            new Element(
                    15,
                    "P",
                    15,
                    3,
                    'p',
                    30.973762,
                    1.82,
                    317.3,
                    553.6,
                    0.769,
                    2.19,
                    1050.0,
                    0,
                    new Element.Configuration("Ne", new Element.Orbital[] {
                            new Element.Orbital(3, 's', 2),
                            new Element.Orbital(3, 'p', 3)
                    }),
                    new Integer[] {2, 8, 5},
                    false
            ),
            new Element(
                    16,
                    "S",
                    16,
                    3,
                    'p',
                    32.065,
                    2.067,
                    388.36,
                    717.87,
                    0.71,
                    2.58,
                    350.0,
                    0,
                    new Element.Configuration("Ne", new Element.Orbital[] {
                            new Element.Orbital(3, 's', 2),
                            new Element.Orbital(3, 'p', 4)
                    }),
                    new Integer[] {2, 8, 6},
                    false
            ),
            new Element(
                    17,
                    "Cl",
                    17,
                    3,
                    'p',
                    35.453,
                    0.003214,
                    171.6,
                    239.11,
                    0.479,
                    3.16,
                    145.0,
                    5,
                    new Element.Configuration("Ne", new Element.Orbital[] {
                            new Element.Orbital(3, 's', 2),
                            new Element.Orbital(3, 'p', 5)
                    }),
                    new Integer[] {2, 8, 7},
                    false
            ),
            new Element(
                    18,
                    "Ar",
                    18,
                    3,
                    'p',
                    39.948,
                    0.0017837,
                    83.8,
                    87.3,
                    0.52,
                    null,
                    3.5,
                    1,
                    new Element.Configuration("Ne", new Element.Orbital[] {
                            new Element.Orbital(3, 's', 2),
                            new Element.Orbital(3, 'p', 6)
                    }),
                    new Integer[] {2, 8, 8},
                    false
            ),
            new Element(
                    19,
                    "K",
                    1,
                    4,
                    's',
                    39.0983,
                    0.862,
                    336.53,
                    1032.0,
                    0.757,
                    0.82,
                    20900.0,
                    2,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(4, 's', 1)
                    }),
                    new Integer[] {2, 8, 8, 1},
                    false
            ),
            new Element(
                    20,
                    "Ca",
                    2,
                    4,
                    's',
                    40.078,
                    1.54,
                    1115.0,
                    1757.0,
                    0.647,
                    1.0,
                    41500.0,
                    3,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(4, 's', 2)
                    }),
                    new Integer[] {2, 8, 8, 2},
                    false
            ),
            new Element(
                    21,
                    "Sc",
                    3,
                    4,
                    'd',
                    44.955912,
                    2.989,
                    1814.0,
                    3109.0,
                    0.568,
                    1.36,
                    22.0,
                    7,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 1),
                            new Element.Orbital(4, 's', 2)
                    }),
                    new Integer[] {2, 8, 9, 2},
                    false
            ),
            new Element(
                    22,
                    "Ti",
                    4,
                    4,
                    'd',
                    47.867,
                    4.54,
                    1941.0,
                    3560.0,
                    0.523,
                    1.54,
                    5650.0,
                    7,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 2),
                            new Element.Orbital(4, 's', 2)
                    }),
                    new Integer[] {2, 8, 10, 2},
                    false
            ),
            new Element(
                    23,
                    "V",
                    5,
                    4,
                    'd',
                    50.9415,
                    6.11,
                    2183.0,
                    3680.0,
                    0.489,
                    1.63,
                    120.0,
                    7,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 3),
                            new Element.Orbital(4, 's', 2)
                    }),
                    new Integer[] {2, 8, 11, 2},
                    false
            ),
            new Element(
                    24,
                    "Cr",
                    6,
                    4,
                    'd',
                    51.9961,
                    7.15,
                    2180.0,
                    2944.0,
                    0.449,
                    1.66,
                    102.0,
                    7,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 5),
                            new Element.Orbital(4, 's', 1)
                    }),
                    new Integer[] {2, 8, 13, 1},
                    false
            ),
            new Element(
                    25,
                    "Mn",
                    7,
                    4,
                    'd',
                    54.938045,
                    7.44,
                    1519.0,
                    2334.0,
                    0.479,
                    1.55,
                    950.0,
                    7,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 5),
                            new Element.Orbital(4, 's', 2)
                    }),
                    new Integer[] {2, 8, 13, 2},
                    false
            ),
            new Element(
                    26,
                    "Fe",
                    8,
                    4,
                    'd',
                    55.845,
                    7.874,
                    1811.0,
                    3134.0,
                    0.449,
                    1.83,
                    56300.0,
                    7,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 6),
                            new Element.Orbital(4, 's', 2)
                    }),
                    new Integer[] {2, 8, 14, 2},
                    false
            ),
            new Element(
                    27,
                    "Co",
                    9,
                    4,
                    'd',
                    58.933195,
                    8.86,
                    1768.0,
                    3200.0,
                    0.421,
                    1.88,
                    25.0,
                    7,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 7),
                            new Element.Orbital(4, 's', 2)
                    }),
                    new Integer[] {2, 8, 15, 2},
                    false
            ),
            new Element(
                    28,
                    "Ni",
                    10,
                    4,
                    'd',
                    58.6934,
                    8.912,
                    1728.0,
                    3186.0,
                    0.444,
                    1.91,
                    84.0,
                    7,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 8),
                            new Element.Orbital(4, 's', 2)
                    }),
                    new Integer[] {2, 8, 16, 2},
                    false
            ),
            new Element(
                    29,
                    "Cu",
                    11,
                    4,
                    'd',
                    63.546,
                    8.96,
                    1357.77,
                    2835.0,
                    0.385,
                    1.9,
                    60.0,
                    7,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 10),
                            new Element.Orbital(4, 's', 1)
                    }),
                    new Integer[] {2, 8, 18, 1},
                    false
            ),
            new Element(
                    30,
                    "Zn",
                    12,
                    4,
                    'd',
                    65.38,
                    7.134,
                    692.68,
                    1180.0,
                    0.388,
                    1.65,
                    70.0,
                    7,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 10),
                            new Element.Orbital(4, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 2},
                    false
            ),
            new Element(
                    31,
                    "Ga",
                    13,
                    4,
                    'p',
                    69.723,
                    5.907,
                    302.9146,
                    2477.0,
                    0.371,
                    1.81,
                    19.0,
                    6,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 10),
                            new Element.Orbital(4, 's', 2),
                            new Element.Orbital(4, 'p', 1)
                    }),
                    new Integer[] {2, 8, 18, 3},
                    false
            ),
            new Element(
                    32,
                    "Ge",
                    14,
                    4,
                    'p',
                    72.63,
                    5.323,
                    1211.4,
                    3106.0,
                    0.32,
                    2.01,
                    1.5,
                    4,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 10),
                            new Element.Orbital(4, 's', 2),
                            new Element.Orbital(4, 'p', 2)
                    }),
                    new Integer[] {2, 8, 18, 4},
                    false
            ),
            new Element(
                    33,
                    "As",
                    15,
                    4,
                    'p',
                    74.9216,
                    5.776,
                    1090.0,
                    887.0,
                    0.329,
                    2.18,
                    1.8,
                    4,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 10),
                            new Element.Orbital(4, 's', 2),
                            new Element.Orbital(4, 'p', 3)
                    }),
                    new Integer[] {2, 8, 18, 5},
                    false
            ),
            new Element(
                    34,
                    "Se",
                    16,
                    4,
                    'p',
                    78.96,
                    4.809,
                    494.0,
                    958.0,
                    0.321,
                    2.55,
                    0.05,
                    0,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 10),
                            new Element.Orbital(4, 's', 2),
                            new Element.Orbital(4, 'p', 4)
                    }),
                    new Integer[] {2, 8, 18, 6},
                    false
            ),
            new Element(
                    35,
                    "Br",
                    17,
                    4,
                    'p',
                    79.904,
                    3.122,
                    265.8,
                    332.0,
                    0.474,
                    2.96,
                    2.4,
                    5,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 10),
                            new Element.Orbital(4, 's', 2),
                            new Element.Orbital(4, 'p', 5)
                    }),
                    new Integer[] {2, 8, 18, 7},
                    false
            ),
            new Element(
                    36,
                    "Kr",
                    18,
                    4,
                    'p',
                    83.798,
                    0.003733,
                    115.79,
                    119.93,
                    0.248,
                    3.0,
                    0.0,
                    1,
                    new Element.Configuration("Ar", new Element.Orbital[] {
                            new Element.Orbital(3, 'd', 10),
                            new Element.Orbital(4, 's', 2),
                            new Element.Orbital(4, 'p', 6)
                    }),
                    new Integer[] {2, 8, 18, 8},
                    false
            ),
            new Element(
                    37,
                    "Rb",
                    1,
                    5,
                    's',
                    85.4678,
                    1.532,
                    312.46,
                    961.0,
                    0.363,
                    0.82,
                    90.0,
                    2,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(5, 's', 1)
                    }),
                    new Integer[] {2, 8, 18, 8, 1},
                    false
            ),
            new Element(
                    38,
                    "Sr",
                    2,
                    5,
                    's',
                    87.62,
                    2.64,
                    1050.0,
                    1655.0,
                    0.301,
                    0.95,
                    370.0,
                    3,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(5, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 8, 2},
                    false
            ),
            new Element(
                    39,
                    "Y",
                    3,
                    5,
                    'd',
                    88.90585,
                    4.469,
                    1799.0,
                    3609.0,
                    0.298,
                    1.22,
                    33.0,
                    7,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 1),
                            new Element.Orbital(5, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 9, 2},
                    false
            ),
            new Element(
                    40,
                    "Zr",
                    4,
                    5,
                    'd',
                    91.224,
                    6.506,
                    2128.0,
                    4682.0,
                    0.278,
                    1.33,
                    165.0,
                    7,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 2),
                            new Element.Orbital(5, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 10, 2},
                    false
            ),
            new Element(
                    41,
                    "Nb",
                    5,
                    5,
                    'd',
                    92.90638,
                    8.57,
                    2750.0,
                    5017.0,
                    0.265,
                    1.6,
                    20.0,
                    7,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 4),
                            new Element.Orbital(5, 's', 1)
                    }),
                    new Integer[] {2, 8, 18, 12, 1},
                    false
            ),
            new Element(
                    42,
                    "Mo",
                    6,
                    5,
                    'd',
                    95.96,
                    10.22,
                    2896.0,
                    4912.0,
                    0.251,
                    2.16,
                    1.2,
                    7,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 5),
                            new Element.Orbital(5, 's', 1)
                    }),
                    new Integer[] {2, 8, 18, 13, 1},
                    false
            ),
            new Element(
                    43,
                    "Tc",
                    7,
                    5,
                    'd',
                    98.0,
                    11.5,
                    2430.0,
                    4538.0,
                    null,
                    1.9,
                    0.0,
                    7,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 5),
                            new Element.Orbital(5, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 13, 2},
                    true
            ),
            new Element(
                    44,
                    "Ru",
                    8,
                    5,
                    'd',
                    101.07,
                    12.37,
                    2607.0,
                    4423.0,
                    0.238,
                    2.2,
                    0.001,
                    7,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 7),
                            new Element.Orbital(5, 's', 1)
                    }),
                    new Integer[] {2, 8, 18, 15, 1},
                    false
            ),
            new Element(
                    45,
                    "Rh",
                    9,
                    5,
                    'd',
                    102.9055,
                    12.41,
                    2237.0,
                    3968.0,
                    0.243,
                    2.28,
                    0.001,
                    7,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 8),
                            new Element.Orbital(5, 's', 1)
                    }),
                    new Integer[] {2, 8, 18, 16, 1},
                    false
            ),
            new Element(
                    46,
                    "Pd",
                    10,
                    5,
                    'd',
                    106.42,
                    12.02,
                    1828.05,
                    3236.0,
                    0.244,
                    2.2,
                    0.015,
                    7,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 10)
                    }),
                    new Integer[] {2, 8, 18, 18},
                    false
            ),
            new Element(
                    47,
                    "Ag",
                    11,
                    5,
                    'd',
                    107.8682,
                    10.501,
                    1234.93,
                    2435.0,
                    0.235,
                    1.93,
                    0.075,
                    7,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 10),
                            new Element.Orbital(5, 's', 1)
                    }),
                    new Integer[] {2, 8, 18, 18, 1},
                    false
            ),
            new Element(
                    48,
                    "Cd",
                    12,
                    5,
                    'd',
                    112.411,
                    8.69,
                    594.22,
                    1040.0,
                    0.232,
                    1.69,
                    0.159,
                    7,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 10),
                            new Element.Orbital(5, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 18, 2},
                    false
            ),
            new Element(
                    49,
                    "In",
                    13,
                    5,
                    'p',
                    114.818,
                    7.31,
                    429.75,
                    2345.0,
                    0.233,
                    1.78,
                    0.25,
                    6,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 10),
                            new Element.Orbital(5, 's', 2),
                            new Element.Orbital(5, 'p', 1)
                    }),
                    new Integer[] {2, 8, 18, 18, 3},
                    false
            ),
            new Element(
                    50,
                    "Sn",
                    14,
                    5,
                    'p',
                    118.71,
                    7.287,
                    505.08,
                    2875.0,
                    0.228,
                    1.96,
                    2.3,
                    6,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 10),
                            new Element.Orbital(5, 's', 2),
                            new Element.Orbital(5, 'p', 2)
                    }),
                    new Integer[] {2, 8, 18, 18, 4},
                    false
            ),
            new Element(
                    51,
                    "Sb",
                    15,
                    5,
                    'p',
                    121.76,
                    6.685,
                    903.78,
                    1860.0,
                    0.207,
                    2.05,
                    0.2,
                    4,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 10),
                            new Element.Orbital(5, 's', 2),
                            new Element.Orbital(5, 'p', 3)
                    }),
                    new Integer[] {2, 8, 18, 18, 5},
                    false
            ),
            new Element(
                    52,
                    "Te",
                    16,
                    5,
                    'p',
                    127.6,
                    6.232,
                    722.66,
                    1261.0,
                    0.202,
                    2.1,
                    0.001,
                    4,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 10),
                            new Element.Orbital(5, 's', 2),
                            new Element.Orbital(5, 'p', 4)
                    }),
                    new Integer[] {2, 8, 18, 18, 6},
                    false
            ),
            new Element(
                    53,
                    "I",
                    17,
                    5,
                    'p',
                    126.90447,
                    4.93,
                    386.85,
                    457.4,
                    0.214,
                    2.66,
                    0.45,
                    5,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 10),
                            new Element.Orbital(5, 's', 2),
                            new Element.Orbital(5, 'p', 5)
                    }),
                    new Integer[] {2, 8, 18, 18, 7},
                    false
            ),
            new Element(
                    54,
                    "Xe",
                    18,
                    5,
                    'p',
                    131.293,
                    0.005887,
                    161.4,
                    165.03,
                    0.158,
                    2.6,
                    0.0,
                    1,
                    new Element.Configuration("Kr", new Element.Orbital[] {
                            new Element.Orbital(4, 'd', 10),
                            new Element.Orbital(5, 's', 2),
                            new Element.Orbital(5, 'p', 6)
                    }),
                    new Integer[] {2, 8, 18, 18, 8},
                    false
            ),
            new Element(
                    55,
                    "Cs",
                    1,
                    6,
                    's',
                    132.9054519,
                    1.873,
                    301.59,
                    944.0,
                    0.242,
                    0.79,
                    3.0,
                    2,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(6, 's', 1)
                    }),
                    new Integer[] {2, 8, 18, 18, 8, 1},
                    false
            ),
            new Element(
                    56,
                    "Ba",
                    2,
                    6,
                    's',
                    137.327,
                    3.594,
                    1000.0,
                    2170.0,
                    0.204,
                    0.89,
                    425.0,
                    3,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 18, 8, 2},
                    false
            ),
            new Element(
                    57,
                    "La",
                    0,
                    6,
                    'd',
                    138.90547,
                    6.145,
                    1193.0,
                    3737.0,
                    0.195,
                    1.1,
                    39.0,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(5, 'd', 1),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 18, 9, 2},
                    false
            ),
            new Element(
                    58,
                    "Ce",
                    0,
                    6,
                    'f',
                    140.116,
                    6.77,
                    1068.0,
                    3716.0,
                    0.192,
                    1.12,
                    66.5,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 1),
                            new Element.Orbital(5, 'd', 1),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 19, 9, 2},
                    false
            ),
            new Element(
                    59,
                    "Pr",
                    0,
                    6,
                    'f',
                    140.90765,
                    6.773,
                    1208.0,
                    3793.0,
                    0.193,
                    1.13,
                    9.2,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 3),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 21, 8, 2},
                    false
            ),
            new Element(
                    60,
                    "Nd",
                    0,
                    6,
                    'f',
                    144.242,
                    7.007,
                    1297.0,
                    3347.0,
                    0.19,
                    1.14,
                    41.5,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 4),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 22, 8, 2},
                    false
            ),
            new Element(
                    61,
                    "Pm",
                    0,
                    6,
                    'f',
                    145.0,
                    7.26,
                    1315.0,
                    3273.0,
                    null,
                    null,
                    0.0,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 5),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 23, 8, 2},
                    true
            ),
            new Element(
                    62,
                    "Sm",
                    0,
                    6,
                    'f',
                    150.36,
                    7.52,
                    1345.0,
                    2067.0,
                    0.197,
                    1.17,
                    7.05,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 6),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 24, 8, 2},
                    false
            ),
            new Element(
                    63,
                    "Eu",
                    0,
                    6,
                    'f',
                    151.964,
                    5.243,
                    1099.0,
                    1802.0,
                    0.182,
                    1.2,
                    2.0,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 7),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 25, 8, 2},
                    false
            ),
            new Element(
                    64,
                    "Gd",
                    0,
                    6,
                    'f',
                    157.25,
                    7.895,
                    1585.0,
                    3546.0,
                    0.236,
                    1.2,
                    6.2,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 7),
                            new Element.Orbital(5, 'd', 1),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 25, 9, 2},
                    false
            ),
            new Element(
                    65,
                    "Tb",
                    0,
                    6,
                    'f',
                    158.92535,
                    8.229,
                    1629.0,
                    3503.0,
                    0.182,
                    1.2,
                    1.2,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 9),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 27, 8, 2},
                    false
            ),
            new Element(
                    66,
                    "Dy",
                    0,
                    6,
                    'f',
                    162.5,
                    8.55,
                    1680.0,
                    2840.0,
                    0.17,
                    1.22,
                    5.2,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 10),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 28, 8, 2},
                    false
            ),
            new Element(
                    67,
                    "Ho",
                    0,
                    6,
                    'f',
                    164.93032,
                    8.795,
                    1734.0,
                    2993.0,
                    0.165,
                    1.23,
                    1.3,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 11),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 29, 8, 2},
                    false
            ),
            new Element(
                    68,
                    "Er",
                    0,
                    6,
                    'f',
                    167.259,
                    9.066,
                    1802.0,
                    3141.0,
                    0.168,
                    1.24,
                    3.5,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 12),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 30, 8, 2},
                    false
            ),
            new Element(
                    69,
                    "Tm",
                    0,
                    6,
                    'f',
                    168.93421,
                    9.321,
                    1818.0,
                    2223.0,
                    0.16,
                    1.25,
                    0.52,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 13),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 31, 8, 2},
                    false
            ),
            new Element(
                    70,
                    "Yb",
                    0,
                    6,
                    'f',
                    173.054,
                    6.965,
                    1097.0,
                    1469.0,
                    0.155,
                    1.1,
                    3.2,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 8, 2},
                    false
            ),
            new Element(
                    71,
                    "Lu",
                    0,
                    6,
                    'f',
                    174.9668,
                    9.84,
                    1925.0,
                    3675.0,
                    0.154,
                    1.27,
                    0.8,
                    8,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 1),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 9, 2},
                    false
            ),
            new Element(
                    72,
                    "Hf",
                    4,
                    6,
                    'd',
                    178.49,
                    13.31,
                    2506.0,
                    4876.0,
                    0.144,
                    1.3,
                    3.0,
                    7,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 2),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 10, 2},
                    false
            ),
            new Element(
                    73,
                    "Ta",
                    5,
                    6,
                    'd',
                    180.94788,
                    16.654,
                    3290.0,
                    5731.0,
                    0.14,
                    1.5,
                    2.0,
                    7,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 3),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 11, 2},
                    false
            ),
            new Element(
                    74,
                    "W",
                    6,
                    6,
                    'd',
                    183.84,
                    19.25,
                    3695.0,
                    5828.0,
                    0.132,
                    2.36,
                    1.3,
                    7,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 4),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 12, 2},
                    false
            ),
            new Element(
                    75,
                    "Re",
                    7,
                    6,
                    'd',
                    186.207,
                    21.02,
                    3459.0,
                    5869.0,
                    0.137,
                    1.9,
                    0.0,
                    7,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 5),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 13, 2},
                    false
            ),
            new Element(
                    76,
                    "Os",
                    8,
                    6,
                    'd',
                    190.23,
                    22.61,
                    3306.0,
                    5285.0,
                    0.13,
                    2.2,
                    0.002,
                    7,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 6),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 14, 2},
                    false
            ),
            new Element(
                    77,
                    "Ir",
                    9,
                    6,
                    'd',
                    192.217,
                    22.56,
                    2719.0,
                    4701.0,
                    0.131,
                    2.2,
                    0.001,
                    7,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 7),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 15, 2},
                    false
            ),
            new Element(
                    78,
                    "Pt",
                    10,
                    6,
                    'd',
                    195.084,
                    21.46,
                    2041.4,
                    4098.0,
                    0.133,
                    2.28,
                    0.005,
                    7,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 9),
                            new Element.Orbital(6, 's', 1)
                    }),
                    new Integer[] {2, 8, 18, 32, 17, 1},
                    false
            ),
            new Element(
                    79,
                    "Au",
                    11,
                    6,
                    'd',
                    196.966569,
                    19.282,
                    1337.33,
                    3129.0,
                    0.129,
                    2.54,
                    0.004,
                    7,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 10),
                            new Element.Orbital(6, 's', 1)
                    }),
                    new Integer[] {2, 8, 18, 32, 18, 1},
                    false
            ),
            new Element(
                    80,
                    "Hg",
                    12,
                    6,
                    'd',
                    200.59,
                    13.5336,
                    234.32,
                    629.88,
                    0.14,
                    2.0,
                    0.085,
                    7,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 10),
                            new Element.Orbital(6, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 18, 2},
                    false
            ),
            new Element(
                    81,
                    "Tl",
                    13,
                    6,
                    'p',
                    204.3833,
                    11.85,
                    577.0,
                    1746.0,
                    0.129,
                    1.62,
                    0.85,
                    6,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 10),
                            new Element.Orbital(6, 's', 2),
                            new Element.Orbital(6, 'p', 1)
                    }),
                    new Integer[] {2, 8, 18, 32, 18, 3},
                    false
            ),
            new Element(
                    82,
                    "Pb",
                    14,
                    6,
                    'p',
                    207.2,
                    11.342,
                    600.61,
                    2022.0,
                    0.129,
                    2.33,
                    14.0,
                    6,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 10),
                            new Element.Orbital(6, 's', 2),
                            new Element.Orbital(6, 'p', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 18, 4},
                    false
            ),
            new Element(
                    83,
                    "Bi",
                    15,
                    6,
                    'p',
                    208.9804,
                    9.807,
                    544.7,
                    1837.0,
                    0.122,
                    2.02,
                    0.009,
                    6,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 10),
                            new Element.Orbital(6, 's', 2),
                            new Element.Orbital(6, 'p', 3)
                    }),
                    new Integer[] {2, 8, 18, 32, 18, 5},
                    false
            ),
            new Element(
                    84,
                    "Po",
                    16,
                    6,
                    'p',
                    210.0,
                    9.32,
                    527.0,
                    1235.0,
                    null,
                    2.0,
                    0.0,
                    4,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 10),
                            new Element.Orbital(6, 's', 2),
                            new Element.Orbital(6, 'p', 4)
                    }),
                    new Integer[] {2, 8, 18, 32, 18, 6},
                    true
            ),
            new Element(
                    85,
                    "At",
                    17,
                    6,
                    'p',
                    210.0,
                    7.0,
                    575.0,
                    610.0,
                    null,
                    2.2,
                    0.0,
                    5,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 10),
                            new Element.Orbital(6, 's', 2),
                            new Element.Orbital(6, 'p', 5)
                    }),
                    new Integer[] {2, 8, 18, 32, 18, 7},
                    true
            ),
            new Element(
                    86,
                    "Rn",
                    18,
                    6,
                    'p',
                    222.0,
                    0.00973,
                    202.0,
                    211.3,
                    0.094,
                    null,
                    0.0,
                    1,
                    new Element.Configuration("Xe", new Element.Orbital[] {
                            new Element.Orbital(4, 'f', 14),
                            new Element.Orbital(5, 'd', 10),
                            new Element.Orbital(6, 's', 2),
                            new Element.Orbital(6, 'p', 6)
                    }),
                    new Integer[] {2, 8, 18, 32, 18, 8},
                    true
            ),
            new Element(
                    87,
                    "Fr",
                    1,
                    7,
                    's',
                    223.0,
                    1.87,
                    300.0,
                    950.0,
                    null,
                    0.7,
                    0.0,
                    2,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(7, 's', 1)
                    }),
                    new Integer[] {2, 8, 18, 32, 18, 8, 1},
                    true
            ),
            new Element(
                    88,
                    "Ra",
                    2,
                    7,
                    's',
                    226.0,
                    5.5,
                    973.0,
                    2010.0,
                    null,
                    0.9,
                    0.0,
                    3,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 18, 8, 2},
                    true
            ),
            new Element(
                    89,
                    "Ac",
                    0,
                    7,
                    'd',
                    227.0,
                    10.07,
                    1323.0,
                    3471.0,
                    0.12,
                    1.1,
                    0.0,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(6, 'd', 1),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 18, 9, 2},
                    true
            ),
            new Element(
                    90,
                    "Th",
                    0,
                    7,
                    'f',
                    232.03806,
                    11.72,
                    2115.0,
                    5061.0,
                    0.113,
                    1.3,
                    9.6,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(6, 'd', 2),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 18, 10, 2},
                    false
            ),
            new Element(
                    91,
                    "Pa",
                    0,
                    7,
                    'f',
                    231.03588,
                    15.37,
                    1841.0,
                    4273.0,
                    null,
                    1.5,
                    0.0,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 2),
                            new Element.Orbital(6, 'd', 1),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 20, 9, 2},
                    false
            ),
            new Element(
                    92,
                    "U",
                    0,
                    7,
                    'f',
                    238.02891,
                    18.95,
                    1405.3,
                    4404.0,
                    0.116,
                    1.38,
                    2.7,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 3),
                            new Element.Orbital(6, 'd', 1),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 21, 9, 2},
                    false
            ),
            new Element(
                    93,
                    "Np",
                    0,
                    7,
                    'f',
                    237.0,
                    20.45,
                    917.0,
                    4273.0,
                    null,
                    1.36,
                    0.0,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 4),
                            new Element.Orbital(6, 'd', 1),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 22, 9, 2},
                    true
            ),
            new Element(
                    94,
                    "Pu",
                    0,
                    7,
                    'f',
                    244.0,
                    19.84,
                    912.5,
                    3501.0,
                    null,
                    1.28,
                    0.0,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 6),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 24, 8, 2},
                    true
            ),
            new Element(
                    95,
                    "Am",
                    0,
                    7,
                    'f',
                    243.0,
                    13.69,
                    1449.0,
                    2880.0,
                    null,
                    1.3,
                    0.0,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 7),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 25, 8, 2},
                    true
            ),
            new Element(
                    96,
                    "Cm",
                    0,
                    7,
                    'f',
                    247.0,
                    13.51,
                    1613.0,
                    3383.0,
                    null,
                    1.3,
                    0.0,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 7),
                            new Element.Orbital(6, 'd', 1),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 25, 9, 2},
                    true
            ),
            new Element(
                    97,
                    "Bk",
                    0,
                    7,
                    'f',
                    247.0,
                    14.79,
                    1323.0,
                    983.0,
                    null,
                    1.3,
                    0.0,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 9),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 27, 8, 2},
                    true
            ),
            new Element(
                    98,
                    "Cf",
                    0,
                    7,
                    'f',
                    251.0,
                    15.1,
                    1173.0,
                    1173.0,
                    null,
                    1.3,
                    0.0,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 10),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 28, 8, 2},
                    true
            ),
            new Element(
                    99,
                    "Es",
                    0,
                    7,
                    'f',
                    252.0,
                    13.5,
                    1133.0,
                    null,
                    null,
                    1.3,
                    null,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 11),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 29, 8, 2},
                    true
            ),
            new Element(
                    100,
                    "Fm",
                    0,
                    7,
                    'f',
                    257.0,
                    null,
                    1800.0,
                    null,
                    null,
                    1.3,
                    null,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 12),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 30, 8, 2},
                    true
            ),
            new Element(
                    101,
                    "Md",
                    0,
                    7,
                    'f',
                    258.0,
                    null,
                    1100.0,
                    null,
                    null,
                    1.3,
                    null,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 13),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 31, 8, 2},
                    true
            ),
            new Element(
                    102,
                    "No",
                    0,
                    7,
                    'f',
                    259.0,
                    null,
                    1100.0,
                    null,
                    null,
                    1.3,
                    null,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 8, 2},
                    true
            ),
            new Element(
                    103,
                    "Lr",
                    0,
                    7,
                    'f',
                    262.0,
                    null,
                    1900.0,
                    null,
                    null,
                    1.3,
                    null,
                    9,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(7, 's', 2),
                            new Element.Orbital(7, 'p', 1)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 8, 3},
                    true
            ),
            new Element(
                    104,
                    "Rf",
                    4,
                    7,
                    'd',
                    267.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    7,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 2),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 10, 2},
                    true
            ),
            new Element(
                    105,
                    "Db",
                    5,
                    7,
                    'd',
                    268.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    7,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 3),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 11, 2},
                    true
            ),
            new Element(
                    106,
                    "Sg",
                    6,
                    7,
                    'd',
                    269.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    7,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(7, 's', 2),
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 4)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 12, 2},
                    true
            ),
            new Element(
                    107,
                    "Bh",
                    7,
                    7,
                    'd',
                    270.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    7,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 5),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 13, 2},
                    true
            ),
            new Element(
                    108,
                    "Hs",
                    8,
                    7,
                    'd',
                    269.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    7,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 6),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 14, 2},
                    true
            ),
            new Element(
                    109,
                    "Mt",
                    9,
                    7,
                    'd',
                    278.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    7,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(7, 's', 2),
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 7)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 15, 2},
                    true
            ),
            new Element(
                    110,
                    "Ds",
                    10,
                    7,
                    'd',
                    281.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    7,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(7, 's', 2),
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 8)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 17, 1},
                    true
            ),
            new Element(
                    111,
                    "Rg",
                    11,
                    7,
                    'd',
                    281.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    7,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 9),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 18, 1},
                    true
            ),
            new Element(
                    112,
                    "Cn",
                    12,
                    7,
                    'd',
                    285.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    7,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 10),
                            new Element.Orbital(7, 's', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 18, 2},
                    true
            ),
            new Element(
                    113,
                    "Nh",
                    13,
                    7,
                    'p',
                    286.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    6,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 10),
                            new Element.Orbital(7, 's', 2),
                            new Element.Orbital(7, 'p', 1)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 18, 3},
                    true
            ),
            new Element(
                    114,
                    "Fl",
                    14,
                    7,
                    'p',
                    289.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    6,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 10),
                            new Element.Orbital(7, 's', 2),
                            new Element.Orbital(7, 'p', 2)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 18, 4},
                    true
            ),
            new Element(
                    115,
                    "Mc",
                    15,
                    7,
                    'p',
                    288.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    6,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 10),
                            new Element.Orbital(7, 's', 2),
                            new Element.Orbital(7, 'p', 3)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 18, 5},
                    true
            ),
            new Element(
                    116,
                    "Lv",
                    16,
                    7,
                    'p',
                    293.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    6,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 10),
                            new Element.Orbital(7, 's', 2),
                            new Element.Orbital(7, 'p', 4)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 18, 6},
                    true
            ),
            new Element(
                    117,
                    "Ts",
                    17,
                    7,
                    'p',
                    294.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    5,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 10),
                            new Element.Orbital(7, 's', 2),
                            new Element.Orbital(7, 'p', 5)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 18, 7},
                    true
            ),
            new Element(
                    118,
                    "Og",
                    18,
                    7,
                    'p',
                    294.0,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    1,
                    new Element.Configuration("Rn", new Element.Orbital[] {
                            new Element.Orbital(5, 'f', 14),
                            new Element.Orbital(6, 'd', 10),
                            new Element.Orbital(7, 's', 2),
                            new Element.Orbital(7, 'p', 6)
                    }),
                    new Integer[] {2, 8, 18, 32, 32, 18, 8},
                    true
            )
    };

    /**
     * Map of element symbols to Elements
     */
    private static final HashMap<String, Element> SYMBOL_MAP = new HashMap<>(ELEMENTS.length);

    static {
        for(Element element : ELEMENTS) {
            SYMBOL_MAP.put(element.symbol.toLowerCase(), element);
        }
    }

    /**
     * Get an Element based on its number.
     *
     * @param number The element number
     * @return The Element
     */
    @Nullable
    public static Element getElement(int number) {
        if(number < 1 || number > ELEMENTS.length) {
            return null;
        }
        return ELEMENTS[number - 1];
    }

    /**
     * Get an Element based on its symbol.
     *
     * @param symbol The element symbol
     * @return The Element
     */
    @Nullable
    public static Element getElement(String symbol) {
        if(symbol == null) {
            return null;
        }
        return SYMBOL_MAP.get(symbol.toLowerCase());
    }

    /**
     * Get all of the Elements.
     *
     * @return An array containing all of the Elements
     */
    @NonNull
    public static Element[] getElements() {
        return ELEMENTS.clone();
    }

}
