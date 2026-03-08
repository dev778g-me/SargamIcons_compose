package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAlert: ImageVector
    get() {
        if (_SiAlert != null) {
            return _SiAlert!!
        }
        _SiAlert = ImageVector.Builder(
            name = "Filled.SiAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveToRelative(3.517f, 17f)
                lineToRelative(7.058f, -11.783f)
                arcToRelative(1.667f, 1.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.85f, 0f)
                lineTo(20.483f, 17f)
                arcToRelative(1.667f, 1.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.425f, 2.5f)
                horizontalLineTo(4.942f)
                arcTo(1.666f, 1.666f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.517f, 17f)
                moveTo(12f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                moveToRelative(-1f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(0.008f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            }
        }.build()

        return _SiAlert!!
    }

@Suppress("ObjectPropertyName")
private var _SiAlert: ImageVector? = null
