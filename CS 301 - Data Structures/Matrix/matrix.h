class Matrix
{
public:

    // Creates an empty matrix of size 0 times 0.
    Matrix();

    // Creates an identity matrix of size <size> times <size>.
    Matrix(int size);

    // Creates a matrix of size <height> times <width> filled with 0s.
    Matrix(int height, int width);

    // Destructor
    ~Matrix();


    int getWidth() const;
    int getHeight() const;
    void resize(int height, int width);


    // Returns the value at the specified position in the matrix.
    long& operator()(const int row, const int col);
    long operator()(const int row, const int col) const;


private:

    int width = 0;
    int height = 0;

    long** values = nullptr;
};
