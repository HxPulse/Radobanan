#scripts to scrap data from the mhw API
import requests
import json
import pandas as pd

# Get the data from the API
def get_armors():
    url = 'https://mhw-db.com/armor'
    response = requests.get(url)
    return response.json()

def get_weapons():
    url = 'https://mhw-db.com/weapons'
    response = requests.get(url)
    return response.json()

def get_sets():
    url = 'https://mhw-db.com/armor/sets'
    response = requests.get(url)
    return response.json()

def get_charms():
    url = 'https://mhw-db.com/charms'
    response = requests.get(url)
    return response.json()

def get_decorations():
    url = 'https://mhw-db.com/decorations'
    response = requests.get(url)
    return response.json()

def get_skills():
    url = 'https://mhw-db.com/skills'
    response = requests.get(url)
    return response.json()


# Save the data to a file
def save_armors(armors):
    with open('data/armors.json', 'w+') as file:
        json.dump(armors, file)

def save_weapons(weapons):
    with open('data/weapons.json', 'w+') as file:
        json.dump(weapons, file)

def save_sets(sets):
    with open('data/sets.json', 'w+') as file:
        json.dump(sets, file)

def save_charms(charms):
    with open('data/charms.json', 'w+') as file:
        json.dump(charms, file)

def save_decorations(decorations):
    with open('data/decorations.json', 'w+') as file:
        json.dump(decorations, file)

def save_skills(skills):
    with open('data/skills.json', 'w+') as file:
        json.dump(skills, file)

#save it as a csv
def save_as_csv(data, filename):
    df = pd.DataFrame(data)
    df.to_csv(filename, index=False)


armors = get_armors()
weapons = get_weapons()
sets = get_sets()
charms = get_charms()
decorations = get_decorations()
skills = get_skills()

save_armors(armors)
save_weapons(weapons)
save_sets(sets)
save_charms(charms)
save_decorations(decorations)
save_skills(skills)

save_as_csv(armors, 'data/armors.csv')
save_as_csv(weapons, 'data/weapons.csv')
save_as_csv(sets, 'data/sets.csv')
save_as_csv(charms, 'data/charms.csv')
save_as_csv(decorations, 'data/decorations.csv')
save_as_csv(skills, 'data/skills.csv')