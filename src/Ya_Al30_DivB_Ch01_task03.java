import java.util.*;

//заваливается на тесте 9 по времени > 1сек

public class Ya_Al30_DivB_Ch01_task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countDiego = in.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < countDiego; i++) set.add(in.nextInt());
        int[] collectionDiego = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            collectionDiego[count] = iterator.next();
            count++;
        }
        int countPeople = in.nextInt();
        ArrayList<Item> arrayList = new ArrayList<>();
        for (int i = 0; i < countPeople; i++) arrayList.add(new Item(in.nextInt(), i));
        arrayList.sort((o1, o2) -> o1.value - o2.value);
        int start = 0;

        for (int i = 0; i < countPeople; i++) {
            if (start == collectionDiego.length) {
                arrayList.get(i).value = start;
            } else {
                for (int j = start; j < collectionDiego.length; j++) {
                    if (arrayList.get(i).value > collectionDiego[j]) {
                        if (j == collectionDiego.length - 1) {
                            j = collectionDiego.length;
                            arrayList.get(i).value = j;
                            start = j;
                        }
                    } else {
                        arrayList.get(i).value = j;
                        start = j;
                        j = collectionDiego.length;
                    }
                }
            }
        }

        arrayList.sort((o1, o2) -> o1.pozition - o2.pozition);

        for (int i = 0; i < arrayList.size(); i++) System.out.println(arrayList.get(i).value);
    }

    static class Item {
        int value = 0;
        int pozition = 0;

        public Item(int value, int pozition) {
            this.value = value;
            this.pozition = pozition;
        }
    }
}
