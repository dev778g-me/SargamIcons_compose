package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiSignOut: ImageVector
    get() {
        if (_SiSignOut != null) {
            return _SiSignOut!!
        }
        _SiSignOut = ImageVector.Builder(
            name = "Regular.SiSignOut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(18f, 15f)
                lineToRelative(3f, -3f)
                moveToRelative(0f, 0f)
                lineToRelative(-3f, -3f)
                moveToRelative(3f, 3f)
                horizontalLineTo(7f)
                moveToRelative(7f, 4f)
                verticalLineToRelative(2.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.6f)
                verticalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 3f)
                horizontalLineToRelative(6.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 5.4f)
                verticalLineTo(8f)
            }
        }.build()

        return _SiSignOut!!
    }

@Suppress("ObjectPropertyName")
private var _SiSignOut: ImageVector? = null
