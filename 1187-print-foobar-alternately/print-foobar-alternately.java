class FooBar {
    private int n;
    Semaphore fs = new Semaphore(1);
    Semaphore bs = new Semaphore(0);
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            fs.acquire();
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            bs.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            bs.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            fs.release();
        }
    }
}