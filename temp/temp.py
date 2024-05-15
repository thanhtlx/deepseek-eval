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
def generate_integers(a, b):
    return [i for i in range(a, b+1) if i % 2 == 0] if a < b else [i for i in range(b, a+1) if i % 2 == 0]
