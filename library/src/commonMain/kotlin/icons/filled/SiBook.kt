package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiBook: ImageVector
    get() {
        if (_SiBook != null) {
            return _SiBook!!
        }
        _SiBook = ImageVector.Builder(
            name = "Filled.SiBook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.833f, 18f)
                curveToRelative(1.4f, 0f, 2.62f, 0.819f, 3.195f, 2.028f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.806f, 0.86f)
                arcTo(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.833f, 20f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(21f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-4.833f)
                curveToRelative(-0.567f, 0f, -1.135f, 0.357f, -1.389f, 0.889f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.806f, -0.86f)
                arcTo(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.167f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.889f, 3.006f)
                arcToRelative(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.11f, 1.564f)
                arcTo(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.333f, 3f)
                horizontalLineTo(22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(12.001f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(15.333f, 17f)
                curveToRelative(-0.658f, 0f, -1.085f, 0.162f, -1.372f, 0.354f)
                curveToRelative(-0.293f, 0.195f, -0.5f, 0.462f, -0.65f, 0.76f)
                arcTo(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 19.33f)
                verticalLineToRelative(0.009f)
                lineToRelative(-0.005f, 0.097f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.99f, 0f)
                lineTo(11f, 19.334f)
                verticalLineToRelative(-0.005f)
                lineToRelative(-0.004f, -0.068f)
                arcToRelative(3.143f, 3.143f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.305f, -1.151f)
                arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, -0.76f)
                curveToRelative(-0.28f, -0.19f, -0.698f, -0.35f, -1.343f, -0.35f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(6.667f)
                close()
                moveTo(11f, 5f)
                verticalLineToRelative(12.334f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _SiBook!!
    }

@Suppress("ObjectPropertyName")
private var _SiBook: ImageVector? = null
