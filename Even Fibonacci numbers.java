        int x = 0;
        int y = 1;
        int temp;
        int sum = 0;

        do {
            if(y % 2 == 0)sum += y;
            temp = x + y;
            x = y;
            y = temp;
        } while (y < 4000000);
        System.out.println(sum);
