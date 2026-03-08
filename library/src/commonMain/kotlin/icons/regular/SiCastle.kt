package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiCastle: ImageVector
    get() {
        if (_SiCastle != null) {
            return _SiCastle!!
        }
        _SiCastle = ImageVector.Builder(
            name = "Regular.SiCastle",
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
                moveTo(22f, 8.047f)
                verticalLineTo(19.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(4.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19.6f)
                verticalLineTo(8f)
                moveToRelative(0f, 2f)
                horizontalLineToRelative(20f)
                moveTo(6f, 4f)
                horizontalLineToRelative(12f)
                moveToRelative(-3f, 18f)
                verticalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 0f)
                verticalLineToRelative(4f)
                moveTo(6f, 2f)
                verticalLineToRelative(8f)
                moveToRelative(4f, -8f)
                verticalLineToRelative(2f)
                moveToRelative(4f, -2f)
                verticalLineToRelative(2f)
                moveToRelative(4f, -2f)
                verticalLineToRelative(8f)
                moveToRelative(-7f, -3f)
                horizontalLineToRelative(2f)
                moveToRelative(-8f, 6f)
                horizontalLineToRelative(2f)
                moveToRelative(10f, 0f)
                horizontalLineToRelative(2f)
            }
        }.build()

        return _SiCastle!!
    }

@Suppress("ObjectPropertyName")
private var _SiCastle: ImageVector? = null
