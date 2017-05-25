package edu.wit.cs.comp3370;

public class RandTable extends HashTable {

	// an array of random numbers to use with calculateHash
	private int[] rand = {18, 20, 250, 204, 89, 27, 177, 114, 212, 97, 85, 238, 90, 124, 242, 184, 231, 46, 168, 193, 75, 15, 12, 142, 146, 253, 91, 111, 149, 40, 148, 232, 189, 199, 157, 202, 207, 117, 47, 153, 162, 131, 230, 78, 6, 133, 201, 84, 43, 229, 109, 191, 182, 181, 8, 28, 0, 2, 80, 96, 16, 138, 173, 38, 121, 61, 104, 77, 62, 72, 180, 56, 239, 223, 44, 214, 74, 110, 255, 115, 197, 69, 10, 23, 73, 19, 196, 170, 186, 81, 221, 79, 42, 167, 143, 99, 187, 127, 237, 248, 215, 139, 210, 183, 172, 71, 155, 159, 123, 249, 13, 225, 112, 36, 222, 35, 219, 200, 147, 151, 68, 55, 154, 119, 17, 252, 190, 14, 30, 29, 86, 209, 216, 240, 31, 92, 145, 105, 64, 103, 118, 102, 176, 150, 65, 33, 50, 211, 95, 251, 192, 25, 126, 5, 226, 217, 52, 241, 156, 161, 206, 128, 59, 53, 48, 130, 1, 194, 26, 24, 208, 3, 106, 122, 54, 247, 87, 125, 220, 132, 171, 76, 116, 41, 233, 108, 164, 246, 236, 21, 244, 224, 254, 245, 213, 107, 83, 203, 140, 141, 51, 45, 188, 70, 22, 137, 100, 34, 32, 179, 4, 175, 165, 166, 198, 49, 158, 98, 93, 174, 136, 144, 63, 66, 235, 169, 9, 101, 205, 39, 195, 82, 178, 57, 94, 228, 67, 60, 163, 218, 152, 113, 37, 7, 160, 185, 135, 129, 227, 88, 120, 234, 134, 58, 11, 243};
	
	public RandTable(int size) {
		super(size);
	}

	@Override
	public int calculateHash(String word) {
		// TODO: implement hash from slides that uses random table
		return -1;
	}

}
