import math
import re
import sys
import copy
import datetime
import itertools
import collections
import heapq
import functools
import hashlib
import numpy
import numpy as np
import string
from typing import *
from collections import *
def rolling_max(numbers: List[int]) -> List[int]:
    max_numbers = []
    for i in range(len(numbers)):
        max_numbers.append(max(numbers[:i+1]))
    return max_numbers


METADATA = {
    'author': 'jt',
    'dataset': 'test'
}


def check(rolling_max):
    assert rolling_max([]) == []
    assert rolling_max([1, 2, 3, 4]) == [1, 2, 3, 4]
    assert rolling_max([4, 3, 2, 1]) == [4, 4, 4, 4]
    assert rolling_max([3, 2, 3, 100, 3]) == [3, 3, 3, 100, 1001]

check(rolling_max)


print('done')