package com.example.mycity.data

import com.example.mycity.R

object Datasource {

    private val restaurantsCategory = Category(
        name = R.string.restaurants_category,
        icon = R.drawable.restaurant_icon,
        list = listOf(
            Place(
                name = R.string.goodtaste_title,
                description = R.string.goodtaste_description,
                address = R.string.goodtaste_address,
                photo = R.drawable.goodtaste
            ),
            Place(
                name = R.string.farmerdaughter_title,
                description = R.string.farmerdaughter_description,
                address = R.string.farmerdaughter_address,
                photo = R.drawable.farmer
            ),
            Place(
                name = R.string.oh_my_gulay_title,
                description = R.string.oh_my_gulay_description,
                address = R.string.oh_my_gulay_address,
                photo = R.drawable.ohmygulay
            ),
            Place(
                name = R.string.cafe_by_the_ruins_title,
                description = R.string.cafe_by_the_ruins_description,
                address = R.string.cafe_by_the_ruins_address,
                photo = R.drawable.cafebytheruins
            )
        )
    )

    private val barsCategory = Category(
        name = R.string.bars_category,
        icon = R.drawable.bar_icon,
        list = listOf(
            Place(
                name = R.string.hardin_title,
                description = R.string.hardin_description,
                address = R.string.hardin_address,
                photo = R.drawable.hardin
            ),
            Place(
                name = R.string. alberto_title,
                description = R.string.alberto_description,
                address = R.string.alberto_address,
                photo = R.drawable.alberto
            )
        )
    )
    private val parksCategory=Category(
        name=R.string.parks_category,
        icon = R.drawable.nature_icon,
        list=listOf(
            Place(
                name = R.string.burnham_title,
                description = R.string.burnham_description,
                address = R.string.burnham_address,
                photo = R.drawable.burnham
            ),
            Place(
                name = R.string.wright_title,
                description = R.string.wright_description,
                address = R.string.wright_address,
                photo = R.drawable.wright
            )
        )
    )
    private val shopsCategory=Category(
        name=R.string.shops_category,
        icon=R.drawable.shops_icon,
        list = listOf(
            Place(
                name = R.string.baguio_night_market_title,
                description = R.string.baguio_night_market_description,
                address = R.string.baguio_night_market_address,
                photo = R.drawable.nightmarket
            ),
            Place(
                name = R.string.good_shepherd_convent_title,
                description = R.string.good_shepherd_convent_description,
                address = R.string.good_shepherd_convent_address,
                photo = R.drawable.goodshepherdconvent
            ),
            Place(
                name = R.string.city_market_title,
                description = R.string.city_market_description,
                address = R.string.city_market_address,
                photo = R.drawable.citymarket
            )
        )
    )

    private val attractionsCategory= Category(
        name = R.string.attractions_category,
        icon = R.drawable.attractions_icon,
        list = listOf(
            Place(
                name = R.string.camp_john_hay_title,
                description = R.string.camp_john_hay_description,
                address = R.string.camp_john_hay_address,
                photo = R.drawable.campjohnhay
            ),
            Place(
                name = R.string.mines_view_title,
                description = R.string.mines_view_description,
                address = R.string.mines_view_address,
                photo = R.drawable.minesview
            ),
            Place(
                name = R.string.mount_costa_title,
                description = R.string.mount_costa_description,
                address = R.string.mount_costa_address,
                photo = R.drawable.mountcosta
            ),
            Place(
                name = R.string.the_mansion_title,
                description = R.string.the_mansion_description,
                address = R.string.the_mansion_address,
                photo = R.drawable.themansion
            )
        )

    )
    val listOfCategories = listOf(restaurantsCategory, barsCategory, parksCategory, shopsCategory, attractionsCategory)

}