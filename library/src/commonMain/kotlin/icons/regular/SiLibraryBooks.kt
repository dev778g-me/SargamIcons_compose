package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiLibraryBooks: ImageVector
    get() {
        if (_SiLibraryBooks != null) {
            return _SiLibraryBooks!!
        }
        _SiLibraryBooks = ImageVector.Builder(
            name = "Regular.SiLibraryBooks",
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
                moveTo(10f, 11f)
                horizontalLineToRelative(8f)
                moveToRelative(-8f, 3f)
                horizontalLineToRelative(4f)
                moveToRelative(-4f, -6f)
                horizontalLineToRelative(8f)
                moveToRelative(2f, 14f)
                horizontalLineTo(8.4f)
                curveTo(5.42f, 22f, 3f, 19.58f, 3f, 16.6f)
                verticalLineTo(5f)
                moveToRelative(5.4f, -2f)
                horizontalLineToRelative(11.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5.4f)
                verticalLineToRelative(11.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(8.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 16.6f)
                verticalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 3f)
            }
        }.build()

        return _SiLibraryBooks!!
    }

@Suppress("ObjectPropertyName")
private var _SiLibraryBooks: ImageVector? = null
