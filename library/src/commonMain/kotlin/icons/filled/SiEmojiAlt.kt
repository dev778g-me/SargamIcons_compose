package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiEmojiAlt: ImageVector
    get() {
        if (_SiEmojiAlt != null) {
            return _SiEmojiAlt!!
        }
        _SiEmojiAlt = ImageVector.Builder(
            name = "Filled.SiEmojiAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.523f, 2f, 12f)
                reflectiveCurveTo(6.477f, 2f, 12f, 2f)
                moveToRelative(4.933f, 11.147f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.287f, 0.587f)
                lineToRelative(-0.079f, 0.21f)
                arcToRelative(3.81f, 3.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.277f, 2.461f)
                lineToRelative(-0.29f, 0.012f)
                arcToRelative(3.81f, 3.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.568f, -2.473f)
                lineToRelative(-0.078f, -0.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.875f, 0.699f)
                lineToRelative(0.08f, 0.212f)
                verticalLineToRelative(0.002f)
                arcTo(5.81f, 5.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18.417f)
                lineToRelative(0.22f, -0.005f)
                arcToRelative(5.81f, 5.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.22f, -3.765f)
                lineToRelative(0.001f, -0.002f)
                lineToRelative(0.08f, -0.212f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.588f, -1.287f)
                moveTo(8f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                moveToRelative(8f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
            }
        }.build()

        return _SiEmojiAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiEmojiAlt: ImageVector? = null
