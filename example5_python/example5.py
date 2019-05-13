class Swan:
    def __init__(self):
        self.name = "Swan"
        self.location = "the lake"


class Person:
    def __init__(self):
        self.name = "Person"


class Swimmer(Person):
    def __init__(self):
        super().__init__()
        self.name = "Swimmer"
        self.location = "the pool"


for c in [Swan, Swimmer]:
    thing_swimming = c()

    print(f"{thing_swimming.name} swam in {thing_swimming.location}.")
