package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiRupee: ImageVector
    get() {
        if (_SiRupee != null) {
            return _SiRupee!!
        }
        _SiRupee = ImageVector.Builder(
            name = "Filled.SiRupee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.001f, 12f)
                horizontalLineToRelative(3.75f)
                curveToRelative(1.172f, 0f, 2.272f, -0.4f, 3.061f, -1.077f)
                arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.01f, -1.423f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(7.822f)
                arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.01f, -1.423f)
                curveTo(13.022f, 5.401f, 11.923f, 5f, 10.751f, 5f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(3.75f)
                quadToRelative(0.09f, 0f, 0.18f, 0.002f)
                lineTo(11f, 3f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-2.425f)
                arcToRelative(5.24f, 5.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.322f, 2.5f)
                horizontalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-1.103f)
                curveToRelative(-0.236f, 1.127f, -0.865f, 2.154f, -1.783f, 2.941f)
                curveTo(13.934f, 13.452f, 12.363f, 14f, 10.75f, 14f)
                horizontalLineTo(9.712f)
                lineToRelative(6.138f, 5.24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.299f, 1.52f)
                lineToRelative(-8.197f, -6.997f)
                lineToRelative(-0.01f, -0.009f)
                arcToRelative(0.996f, 0.996f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.207f, -1.26f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.001f, 12f)
            }
        }.build()

        return _SiRupee!!
    }

@Suppress("ObjectPropertyName")
private var _SiRupee: ImageVector? = null
