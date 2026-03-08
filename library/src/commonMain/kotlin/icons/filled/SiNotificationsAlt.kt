package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiNotificationsAlt: ImageVector
    get() {
        if (_SiNotificationsAlt != null) {
            return _SiNotificationsAlt!!
        }
        _SiNotificationsAlt = ImageVector.Builder(
            name = "Filled.SiNotificationsAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.894f, -1.447f)
                lineTo(6f, 12.764f)
                lineTo(6f, 10f)
                curveToRelative(0f, -3.728f, 2.55f, -6.86f, 6f, -7.748f)
                curveToRelative(3.45f, 0.888f, 6f, 4.02f, 6f, 7.748f)
                verticalLineToRelative(2.764f)
                lineToRelative(1.894f, 3.789f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 18f)
                close()
                moveTo(8.126f, 19f)
                arcToRelative(4.002f, 4.002f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.748f, 0f)
                close()
            }
        }.build()

        return _SiNotificationsAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiNotificationsAlt: ImageVector? = null
