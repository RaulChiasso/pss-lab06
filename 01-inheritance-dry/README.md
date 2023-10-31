# Improving an existing design with inheritance

Look at `SimpleBankAccount` and `StrictBankAccount`.

1. Create a new class `ExtendedStrictBankAccount` that extends `SimpleBankAccount`,
  with the same behavior of `StrictBankAccount` (provided by us).
  Your goal is to reduce, as much as possible, code duplications.
  *Note:* modifying `BankAccount`, `AccountHolder`, or `SimpleBankAccount` is *forbidden*.

2. Change the type of the class created in `TestBankAccount` and use it to test your implementation

3. Analyse what you just did: compare your `ExtendedStrictBankAccount` with `StrictBankAccount`. See how much code you *reused*.

4. Answer the following question: *How would you have designed the application, if you knew interfaces and and inheritance?*
    * Originally, we used inheritance in order to improve a sub-optimal design (of course it was sub-optimal, we didn't know inheritance existed!). 
    * Provide a simple UML scheme (draw it on paper or on [mermaid.live](https://mermaid.live/edit#pako:eNptkctOAzEMRX8l8gpE5weibhClEouuuqsiIU_iTqPJA_JQBWX-nUxgpNDilXVu7pXtXEB6RcBBGoxxo3EIaIVjpR6dtmjY-qvr2CbL8ZZudTzd0gP1Af9gzh60SwwHusb7FLQb2EBOUWjF2RJ3aEt7d38lWEy0wDp2He_yA-ZaYnvC8ckbHxopnrVdzBW8Z5TjQqY2dV6vSe3mHaL-pBe3JUqNINE9Y_o3ox6jHa333jAdX8_aqAaH7Bo_rMBSsKhV-ZnqFpBOZEkAL62iI2aTBAg3laeYk99_OAk8hUwryG-qXOj3L4Ef0USavgH6HZMp)) with your design proposal and let the teacher see it.
    * Draw the *vtable (virtual method table)* of the classes in your hierarchy.

(https://mermaid.live/edit#pako:eNqdlVFvmzAUhf-K5adES6ftYS9Im0Q7svUBKi1Me0Gqbu1bYgXsyDbKpq7_fSbQCIpxuvASYp9z7vXlk_xEmeJII8oqMOargFJDXUjinpgx1Uj7XVUcNYnIu43VQpZEQo1hhWl0QCSkJYJ7Nt1eiTZzzsVydnvTZQcUt7zd7LavQe56SVua414ZYReCrwjU7erSqzsIu-UaDmeFfeBaqzrO0zfnvlXPtqBLTEFCiTVKu0Y0zuQXu6NfQwWSnYYzFeQapAFmhZLmpl33zpFcXf39MnS_jLP9vsy-noFqHiok7jz3-Y8428Q3-e1ddr9OEvKZfDxvTOMs_pakSZb3nk_nPdNCH96HSg2ZC-U-dAM8k2QHUwxIzeSDeGUnZGcVg3p3-8WjkFCR7kQr0v3r2x-xNNM-00eUhiQEi7Mtst1Pg3pUeElCRcyvHvS4qtQB-WK-y6H1iN0k8QSfqPcVXgJfwDgLn88zoigQOqZoLslDkU_qocgnG1PkU1xIkb_9EEU-R5iiKQSvM14gSH5blBz5xTAEA_4H3GnAsfPZ_PYEhaQrWqOuQXB35z61SQW1WzfLgkbulYPeFbSQz04HjVWbP5LRyOoGV7TZc7DYX9E0eoTKuFXkwiqd9pd4-_P8D7_LoSI)