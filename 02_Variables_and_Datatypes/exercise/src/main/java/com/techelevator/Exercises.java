package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

		int racoonsInWoods = 3;
		int racoonsGoHome = 2;
		int racoonsLeft = racoonsInWoods - racoonsGoHome;



        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int flowersMinusBees = flowers - bees;


        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		int anotherPigeon = 1;
		int together = lonelyPigeon + anotherPigeon;



        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int ogOwls = 3;
		int extraOwls = 2;
		int totalOwls = ogOwls + extraOwls;


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int workingBeavs = 2;
		int wentHone = 1;
		int beaversLeft = workingBeavs - wentHone;


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int ogToucans = 2;
		int extraToucans = 1;
		int totalToucans = ogToucans + extraToucans;


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		int nutless = squirrels - nuts;


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarter = .25;
		double dime = .10;
		double nickel = .05;
		double totalMoney = quarter + dime + (2 * nickel);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brier = 18;
		int mcAdams = 20;
		int flannery = 17;
		int totalMuffins = brier + mcAdams + flannery;


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyo = .24;
		double whistle = .14;
		double moneySpent = yoyo + whistle;


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int riceKrispies = 5;
		int largeMellows = 8;
		int miniMellows = 10;
		int totalMellows = largeMellows + miniMellows;


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int home = 29;
		int school = 17;
		int moreAtHome = home - school;


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double totalDollars = 10;
		double truck = 3;
		double pencil = 2;
		double totalMoneySpent = totalDollars - truck - pencil;


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int totalMarbles = 16;
		int marblesLost = 7;
		int joshMarble = totalMarbles - marblesLost;


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int totalShells = 25;
		int meghansShells = 19;
		int shellsNeeded= totalShells - meghansShells;


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradBalloons = 17;
		int redBallons = 8;
		int greenBaloons = bradBalloons - redBallons;





        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int marta = 10;
		int totalBooks = booksOnShelf + marta;


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beesLegs = 6;
		int totalBees = 8;
		int totalegs = beesLegs * totalBees;



        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCream = .99;
		int totalCones = 2;
		double iceCreamCost = iceCream * totalCones;



        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalRocksNeeded = 125;
		int hiltsRocks = 64;
		int moreRocks = totalRocksNeeded - hiltsRocks;


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltsMarbles = 38;
		int marblesLostAgain = 15;
		int marblesLeft = hiltsMarbles - marblesLostAgain;


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMiles = 78;
		int pitStop = 32;
		int milesLeft = totalMiles - pitStop;


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int morningMinutes = 90;
		int afternoonMinutes = 45;
		int saturdayMinutes = morningMinutes + afternoonMinutes;


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int hotDogsbought = 6;
		double hotDogPrice = .50;
		double totalHotDogs = hotDogsbought * hotDogPrice;


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int hiltsMoney = 50;
		int pencilCost = 7;
		int pencilsBought = hiltsMoney / pencilCost;


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterfliesSaw = 33;
		int orangeButterflies = 20;
		int redButterflies = butterfliesSaw - orangeButterflies;


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double katesMoney = 1.00;
		double cost = .54;
		double change = katesMoney - cost;


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int originalTrees = 13;
		int treesPlanted = 12;
		int totalTrees = originalTrees + treesPlanted;



        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysToGrandma = 2;
		int hoursInDay = 24;
		int totalHours = daysToGrandma * hoursInDay;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousins = 4;
		int gum = 5;
		int totalPieces = gum * cousins;


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double dan = 3;
		double candyBar = 1;
		double moneyLeft = dan - candyBar;


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boats = 5;
		int people = 3;
		int peopleOnBoats = boats * people;


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellenLogos = 380;
		int lostLegos = 57;
		int legosLeft = ellenLogos - lostLegos;


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int arthurMuffin = 35;
		int neededMuffins = 83;
		int howMany = neededMuffins - arthurMuffin;


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int moreForWill = willyCrayons - lucyCrayons;


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10;
		int numOfPages = 22;
		int totalStickers = stickersOnPage * numOfPages;


        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double cupcakes = 100;
		double children = 8;
		double cupcakesForEach = cupcakes / children;


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int gingerBread = 47;
		int jars = 6;
		int cookiesInJar = gingerBread % jars;


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int croissants = 59;
		int numOfNeighbors = 8;
		int marian = croissants % numOfNeighbors;


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesOnTray = 12;
		int cookiesNeeded = 276;
		int traysNeeded = cookiesNeeded / cookiesOnTray;


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int totalPretzels = 480;
		int oneServing = 12;
		int numOfServings = totalPretzels / oneServing;


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupCakes = 53;
		int leftAtHome = 2;
		int cupCakesInBox = 3;
		int boxesGivenAway = (lemonCupCakes - leftAtHome) / cupCakesInBox;


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int sticksPrepared = 74;
		int numOfPeople = 12;
		int carrotsLeft = sticksPrepared % numOfPeople;


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBears = 98;
		int bearsOnShelf = 7;
		int shelvesUsed = teddyBears / bearsOnShelf;


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int totalPics = 480;
		int picsInAlbum = 20;
		int totalAlbums = totalPics / picsInAlbum;


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int totalCards = 94;
		int fullBox = 8;
		int boxesFilled = totalCards / fullBox;
		int cardsLeft = totalCards % fullBox;


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int booksDistributed = 210;
		int shelvesRepaired = 10;
		int boosOnShelf = booksDistributed / shelvesRepaired;


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double croissantsBaked = 17;
		double numOfGuests = 7;
		double croissantsForGuest = croissantsBaked / numOfGuests;


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double roomSize = 12 * 14;
		double billsHours = 2.15;
		double jillsHours = 1.90;
		double billsRatePerHour = roomSize / billsHours;
		double jillsRatePerHour = roomSize / jillsHours;
		double workingTogether = (5 * roomSize) / (billsRatePerHour + jillsRatePerHour);


	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		String middleInitial = "B";
		String fullName = lastName + ", " + firstName + " " + middleInitial + ".";


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double newYorkToChicago = 800;
		double milesTraveled = 537;
		double decimalToWhole = 100;
		double percentageCompleted =(milesTraveled / newYorkToChicago) * decimalToWhole;
		System.out.println(percentageCompleted);
		int intValue = (int)percentageCompleted;


	}

}
